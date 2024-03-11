package com.sm2k4.jsonph.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.sm2k4.jsonph.DTOs.CommentDTO;

@Service
public class CommentServiceImpl implements CommentService {

    private RestTemplate restTemplate;

    public CommentServiceImpl() {
        this.restTemplate = new RestTemplate();
    }

    public List<CommentDTO> getAllComments() {

        String URL = "https://jsonplaceholder.typicode.com/comments";
        CommentDTO[] allComments = this.restTemplate.getForObject(URL, CommentDTO[].class);
        List<CommentDTO> allCommentsList = new ArrayList<>();

        for (CommentDTO comment : allComments) {
            allCommentsList.add(comment);
        }
        return allCommentsList;
    }

    public CommentDTO getCommentById(int id) {
        String URL = "https://jsonplaceholder.typicode.com/comments/" + id;

        return this.restTemplate.getForObject(URL, CommentDTO.class);
    }
}
