package com.sm2k4.jsonph.Services;

import java.util.List;

import com.sm2k4.jsonph.DTOs.PostDTO;

public interface PostService {
    public List<PostDTO> getAllPosts();
    public PostDTO getPostById(int id);
    public PostDTO createPost(PostDTO newPost);
    public PostDTO updatePost(PostDTO updatePost,int id);
    public PostDTO deletePost(int id);
}
