package com.app.library.repository;

import com.app.library.domain.Title;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TitleRepository extends CrudRepository<Title, Long> {
    @Override
    Title save(Title title);

    @Override
    List<Title> findAll();

    @Override
    void deleteById(Long id);
}
