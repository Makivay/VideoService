package ru.makivay.videonode.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.core.io.FileSystemResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.nio.file.Path;
import java.nio.file.Paths;

@Log4j2
@RestController
@RequestMapping("/api/")
public class VideoAPIController {
    private final Path VIDEO_PATH = Paths.get("/home/makivay/Videos/e10.mp4");

    @GetMapping(path = "/video/{id:.+}", produces = "video/mp4")
    public FileSystemResource video(@PathVariable("id") Long id) {
        log.debug("Video request: " + id);
        return new FileSystemResource(VIDEO_PATH);
    }
}
