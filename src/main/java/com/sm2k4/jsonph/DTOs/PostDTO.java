package com.sm2k4.jsonph.DTOs;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PostDTO {
    private int userId;
    private int id;
    private String title;
    private String body;
}