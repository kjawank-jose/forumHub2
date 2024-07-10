package com.kjawank.forumapp.ForumAppApplication.repository;

import com.kjawank.forumapp.ForumAppApplication.model.UserActivity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserActivityRepository extends JpaRepository<UserActivity, Long> {
    List<UserActivity> findByUserId(Long userId);
}
