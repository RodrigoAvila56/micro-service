package com.microservie.course.service;

import com.microservie.course.entities.Course;
import com.microservie.course.http.response.StudentByCourseResponse;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ICourseService {

    List<Course> findAll();

    Course findById(Long id);

    void save(Course course);

    StudentByCourseResponse findStudentsByIdCourse(Long idCourse);
}
