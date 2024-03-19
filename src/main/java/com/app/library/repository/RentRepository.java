package com.app.library.repository;

import com.app.library.domain.Rent;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RentRepository extends CrudRepository<Rent, Long> {
    @Override
    Rent save(Rent rent);

    @Override
    List<Rent> findAll();

    @Override
    void deleteById(Long id);
}
