package com.app.library.controller;

import com.app.library.domain.dtos.TitleDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/title")
@CrossOrigin("*")
@RequiredArgsConstructor
public class TitleController {

    @PostMapping(value = "/new", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> createTitle(@RequestBody TitleDto titleDto) {
        return ResponseEntity.ok("done");
    }
}