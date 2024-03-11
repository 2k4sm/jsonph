package com.sm2k4.jsonph.Services;

import java.util.ArrayList;
import java.util.List;

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
}
