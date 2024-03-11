package com.sm2k4.jsonph.Services;

import java.util.List;

import com.sm2k4.jsonph.DTOs.PostDTO;

public interface PostService {
    public List<PostDTO> getAllPosts();
    public PostDTO getPostById(int id);
}
