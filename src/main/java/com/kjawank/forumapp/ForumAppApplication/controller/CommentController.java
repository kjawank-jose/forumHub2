package com.kjawank.forumapp.ForumAppApplication.controller;

import com.kjawank.forumapp.ForumAppApplication.model.Comment;
import com.kjawank.forumapp.ForumAppApplication.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/comments")
public class CommentController {

    @Autowired
    private CommentService commentService;

    @GetMapping("/course/{courseId}")
    public ResponseEntity<List<Comment>> getCommentsByCourseId(@PathVariable Long courseId) {
        return ResponseEntity.ok(commentService.getCommentsByCourseId(courseId));
    }

    @PostMapping
    public ResponseEntity<Comment> createComment(@RequestBody Comment comment) {
        return ResponseEntity.ok(commentService.saveComment(comment));
    }
}
