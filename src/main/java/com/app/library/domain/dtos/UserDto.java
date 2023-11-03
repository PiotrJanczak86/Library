package com.app.library.domain.dtos;

import lombok.Data;

@Data
public class UserDto {
    private String name;
    private String surname;
    private int accountCreated;
}
