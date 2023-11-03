package com.app.library.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity(name = "BOOK_TITLE")
public class BookTitle {
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

    @OneToMany(targetEntity = BookCopy.class,
    mappedBy = "titleId",
    fetch = FetchType.EAGER)
    private List<BookCopy> bookCopies = new ArrayList<>();
}