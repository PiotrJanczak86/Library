package com.app.library.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity(name = "BOOK_COPIES")
public class BookCopy {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private int id;

    @Column(name = "TitleId")
    @NotNull
    private int titleId;

    @Column(name = "status")
    @NotNull
    private String status;

    @OneToMany(targetEntity = BookRent.class,
    mappedBy = "bookCopyId",
    fetch = FetchType.EAGER)
    private List<BookRent> rents = new ArrayList<>();

    @ManyToOne
    @NotNull
    @JoinColumn(name = "BOOK_TITLE_ID")
    private BookTitle bookTitle;
}