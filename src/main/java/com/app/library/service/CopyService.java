package com.app.library.service;

import com.app.library.domain.Copy;
import com.app.library.domain.Title;
import com.app.library.repository.CopyRepository;
import com.app.library.repository.TitleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CopyService {

    private final CopyRepository copyRepository;
    private final TitleRepository titleRepository;

    public Copy saveCopy(final Copy copy) {
        Optional<Title> title = titleRepository.findById(copy.getTitle().getId());
        title.get().getBookCopies().add(copy);
        return copyRepository.save(copy);
    }

    public Copy changeStatus(final Copy copy, String status) {
        copy.setStatus(status);
        return copyRepository.save(copy);
    }
}