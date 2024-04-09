package com.app.library;

import com.app.library.domain.Copy;
import com.app.library.domain.Title;
import com.app.library.repository.CopyRepository;
import com.app.library.repository.TitleRepository;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;



@Transactional
@SpringBootTest
public class CopyEntityTests {

    @Autowired
    TitleRepository titleRepository;

    @Autowired
    CopyRepository copyRepository;

    @Test
    public void titleAndCopyRelationInitializing() {
        //Given
        Title title = new Title(1, "Slaughterhouse 5", "Kurt Vonnegut", 1969, new ArrayList<>());
        Copy copy = new Copy(1, "Available", new ArrayList<>(), title);
        //When
        titleRepository.save(title);
        copyRepository.save(copy);
        //Then

        assertEquals(1, copyRepository.findAll().size());
    }

}
