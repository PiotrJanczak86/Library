package com.app.library.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity(name = "USERS")
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "ID")
    private int id;

    @Column(name = "name")
    @NotNull
    private String name;

    @Column(name = "surname")
    @NotNull
    private String surname;

    @Column(name = "createdOn")
    @NotNull
    private int accountCreated;

    @OneToMany(targetEntity = BookRent.class,
    mappedBy = "userId",
    fetch = FetchType.EAGER)
    private List<BookRent> rents = new ArrayList<>();
}