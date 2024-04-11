package com.app.library.service;

import com.app.library.domain.Title;
import com.app.library.repository.TitleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TitleService {

    private final TitleRepository titleRepository;

    private Title saveTitle(final Title title) {return titleRepository.save(title);}
}