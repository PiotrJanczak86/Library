package com.app.library.repository;

import com.app.library.domain.Title;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TitleRepository extends CrudRepository<Title, Long> {
    @Override
    Title save(Title title);

    @Override
    List<Title> findAll();

    Optional<Title> findById(int id);

    @Override
    void deleteById(Long id);
}
