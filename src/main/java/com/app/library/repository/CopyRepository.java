package com.app.library.repository;

import com.app.library.domain.Copy;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CopyRepository extends CrudRepository<Copy, Long> {
    @Override
    Copy save(Copy copy);

    @Override
    List<Copy> findAll();

    @Override
    void deleteById(Long id);
}
