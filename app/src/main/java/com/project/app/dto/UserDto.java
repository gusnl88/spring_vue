package com.project.app.dto;

import java.time.LocalDate;

import lombok.Data;

@Data
public class UserDto {
    private int no;
    private String name;
    private String email;
    private String pwd;
    private boolean gender;
    private boolean del;
    private LocalDate regDate;
}
