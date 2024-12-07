package com.example.gradestudents.repository;

import com.example.gradestudents.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student,Long> { List<Student> findStudentById (long kw);}