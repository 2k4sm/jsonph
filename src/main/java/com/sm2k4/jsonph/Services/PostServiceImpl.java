package com.sm2k4.jsonph.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.sm2k4.jsonph.DTOs.PostDTO;

@Service
public class PostServiceImpl implements PostService {

    private RestTemplate restTemplate;

    public PostServiceImpl() {
        this.restTemplate = new RestTemplate();
    }

    public List<PostDTO> getAllPosts() {
        String URL = "https://jsonplaceholder.typicode.com/posts";

        PostDTO[] allPosts = this.restTemplate.getForObject(URL, PostDTO[].class);
        List<PostDTO> allPostList = new ArrayList<PostDTO>();

        for (PostDTO post : allPosts) {
            allPostList.add(post);
        }

        return allPostList;
    }

    public PostDTO getPostById(int id) {
        String URL = "https://jsonplaceholder.typicode.com/posts/";

        return this.restTemplate.getForObject(URL + id, PostDTO.class);
    }

    public PostDTO createPost(PostDTO newPost) {
        String URL = "https://jsonplaceholder.typicode.com/posts";

        return this.restTemplate.postForObject(URL, newPost, PostDTO.class);
    }

    public PostDTO updatePost(PostDTO updatePost, int id) {
        String URL = "https://jsonplaceholder.typicode.com/posts/";

        ResponseEntity<PostDTO> updatedPostEntity = this.restTemplate.exchange(URL + id, HttpMethod.PUT,
                new HttpEntity<>(updatePost), PostDTO.class);

        return updatedPostEntity.getBody();
    }

    public PostDTO deletePost(int id) {
        String URL = "https://jsonplaceholder.typicode.com/posts/";

        ResponseEntity<PostDTO> deletePostEntity = this.restTemplate.exchange(URL + id, HttpMethod.DELETE, null,
                PostDTO.class);

        return deletePostEntity.getBody();
    }
}
