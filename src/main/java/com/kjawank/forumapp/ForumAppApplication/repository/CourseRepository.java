package com.kjawank.forumapp.ForumAppApplication.repository;

import com.kjawank.forumapp.ForumAppApplication.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
