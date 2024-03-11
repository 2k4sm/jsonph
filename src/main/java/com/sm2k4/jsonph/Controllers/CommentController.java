package com.sm2k4.jsonph.Controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sm2k4.jsonph.DTOs.CommentDTO;
import com.sm2k4.jsonph.Services.CommentService;

@RestController
public class CommentController {

    private CommentService commentService;

    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    @GetMapping("/comments")
    public ResponseEntity<List<CommentDTO>> getAllComments() {
        List<CommentDTO> allComments = this.commentService.getAllComments();

        return ResponseEntity.ok(allComments);
    }

    @GetMapping("/comments/{id}")
    public ResponseEntity<CommentDTO> getCommentsById(@PathVariable int id) {
        CommentDTO comment = this.commentService.getCommentById(id);

        return ResponseEntity.ok(comment);
    }

    @GetMapping("/posts/{postId}/comments")
    public ResponseEntity<List<CommentDTO>> getCommentsByPost(@PathVariable int postId) {
        List<CommentDTO> commentsByPost = this.commentService.getCommentsByPost(postId);

        return ResponseEntity.ok(commentsByPost);
    }

}
