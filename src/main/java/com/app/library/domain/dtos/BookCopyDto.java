package com.app.library.domain.dtos;

import lombok.Data;

@Data
public class BookCopyDto {
    private int id;
    private int titleId;
    private String status;
}