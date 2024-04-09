package com.app.library.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "BOOK_TITLE")
public class Title {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "ID")
    private int id;

    @Column(name = "title")
    @NotNull
    private String title;

    @Column(name = "author")
    @NotNull
    private String author;

    @Column(name = "publicationYear")
    @NotNull
    private int publicationYear;

    @OneToMany(targetEntity = Copy.class,
    mappedBy = "title",
    fetch = FetchType.EAGER)
    private List<Copy> bookCopies = new ArrayList<>();
}