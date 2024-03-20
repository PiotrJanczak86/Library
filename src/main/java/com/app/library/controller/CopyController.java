package com.app.library.controller;

import com.app.library.domain.dtos.CopyDto;
import com.app.library.domain.dtos.TitleDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/copy")
@CrossOrigin("*")
@RequiredArgsConstructor
public class CopyController {

    @PostMapping(value = "/new", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> createCopy(@RequestBody CopyDto copyDto) {
        return ResponseEntity.ok("done");
    }

    @GetMapping(value = "/checkCopies", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> checkNumberOfCopies (@RequestBody TitleDto titleDto) {
        return ResponseEntity.ok("number");
    }

    @PutMapping(value = "/changeStatus,", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> changeStatus (@RequestBody CopyDto copyDto) {
        return ResponseEntity.ok("done");
    }
}