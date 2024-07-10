package com.kjawank.forumapp.ForumAppApplication.repository;

import com.kjawank.forumapp.ForumAppApplication.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByCourseId(Long courseId);
}
