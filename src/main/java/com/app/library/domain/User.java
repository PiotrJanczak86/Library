package com.app.library.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
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
    private LocalDate accountCreated;

    @OneToMany(targetEntity = Rent.class,
    mappedBy = "user",
    fetch = FetchType.EAGER)
    private List<Rent> rents = new ArrayList<>();
}