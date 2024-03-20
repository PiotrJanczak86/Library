package com.app.library.controller;

import com.app.library.domain.dtos.RentDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rent")
@CrossOrigin("*")
@RequiredArgsConstructor
public class RentController {

    @PostMapping(value = "/new", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> createRent(@RequestBody RentDto rentDto) {
        return ResponseEntity.ok("done");
    }

    @PutMapping(value = "/return", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> returnCopy(@RequestBody RentDto rentDto) {
        return ResponseEntity.ok("done");
    }
}