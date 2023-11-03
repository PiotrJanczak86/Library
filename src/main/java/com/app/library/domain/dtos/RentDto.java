package com.app.library.domain.dtos;

import lombok.Data;

import java.time.LocalDate;
@Data
public class RentDto {
    private int bookId;
    private int userId;
    private LocalDate rentDate;
    private LocalDate returnDate;
}
