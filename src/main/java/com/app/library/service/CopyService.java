package com.app.library.service;

import com.app.library.repository.CopyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CopyService {

    private final CopyRepository copyRepository;
}
