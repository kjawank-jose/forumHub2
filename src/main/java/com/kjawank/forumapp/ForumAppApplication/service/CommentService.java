package com.kjawank.forumapp.ForumAppApplication.service;

import com.kjawank.forumapp.ForumAppApplication.model.Comment;
import com.kjawank.forumapp.ForumAppApplication.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;

    public List<Comment> getCommentsByCourseId(Long courseId) {
        return commentRepository.findByCourseId(courseId);
    }

    public Comment saveComment(Comment comment) {
        return commentRepository.save(comment);
    }
}
