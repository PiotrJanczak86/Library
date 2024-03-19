package com.app.library.service;

import com.app.library.repository.RentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RentService {

    private final RentRepository rentRepository;
}
