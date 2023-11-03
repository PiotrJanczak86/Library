package com.app.library.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDate;
@Data
@Entity(name = "BOOK_RENTS")
public class Rent {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "ID")
    private int id;

    @Column(name = "bookId")
    @NotNull
    private int bookCopyId;

    @Column(name = "userId")
    @NotNull
    private int userId;

    @Column(name = "rentDate")
    @NotNull
    private LocalDate rentDate;

    @Column(name = "returnDate")
    private LocalDate returnDate;

    @ManyToOne
    @NotNull
    @JoinColumn(name = "USER_ID")
    private User user;

    @ManyToOne(fetch = FetchType.EAGER)
    @NotNull
    @JoinColumn(name = "BOOK_ID")
    private Copy bookCopy;
}