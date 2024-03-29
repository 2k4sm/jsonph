package com.sm2k4.jsonph.Controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sm2k4.jsonph.DTOs.PostDTO;
import com.sm2k4.jsonph.Services.PostService;

@RestController
@RequestMapping("/posts")
public class PostController {

    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("")
    public ResponseEntity<List<PostDTO>> getAllPosts() {
        List<PostDTO> allPosts = this.postService.getAllPosts();

        return ResponseEntity.ok(allPosts);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PostDTO> getPostById(@PathVariable int id) {
        PostDTO postById = this.postService.getPostById(id);
        return ResponseEntity.ok(postById);
    }

    @PostMapping("")
    public ResponseEntity<PostDTO> createPost(@RequestBody PostDTO newPost) {
        PostDTO createdPost = this.postService.createPost(newPost);

        return ResponseEntity.ok(createdPost);
    }

    @PutMapping("/{id}")
    public ResponseEntity<PostDTO> updatePost(@RequestBody PostDTO updatePost, @PathVariable int id) {
        PostDTO updatedPost = this.postService.updatePost(updatePost, id);

        return ResponseEntity.ok(updatedPost);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<PostDTO> deletePost(@PathVariable int id) {
        PostDTO deletedPost = this.postService.deletePost(id);

        return ResponseEntity.ok(deletedPost);
    }
}
