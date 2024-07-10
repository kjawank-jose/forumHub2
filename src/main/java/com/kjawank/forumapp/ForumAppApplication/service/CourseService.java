package com.kjawank.forumapp.ForumAppApplication.service;

import com.kjawank.forumapp.ForumAppApplication.model.Course;
import com.kjawank.forumapp.ForumAppApplication.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public List<Course> getAllCourses(){
        return courseRepository.findAll();
    }

    public Course getCourseById(Long id){
        return courseRepository.findById(id).orElse(null);
    }

    public Course saveCourse(Course course){
        return courseRepository.save(course);
    }
}
