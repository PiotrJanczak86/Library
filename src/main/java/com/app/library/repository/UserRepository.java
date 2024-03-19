package com.app.library.repository;

import com.app.library.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    @Override
    User save(User user);

    @Override
    List<User> findAll();

    @Override
    void deleteById(Long id);
}