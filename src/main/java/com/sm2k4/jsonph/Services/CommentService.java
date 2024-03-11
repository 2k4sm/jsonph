package com.sm2k4.jsonph.Services;

import java.util.List;

import com.sm2k4.jsonph.DTOs.CommentDTO;

public interface CommentService {

    public List<CommentDTO> getAllComments();

    public CommentDTO getCommentById(int id);

    public List<CommentDTO> getCommentsByPost(int postId);

}
