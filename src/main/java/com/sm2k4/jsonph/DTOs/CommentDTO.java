package com.sm2k4.jsonph.DTOs;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CommentDTO {
    private int postId;
    private int id;
    private String name;
    private String email;
    private String body;
}
