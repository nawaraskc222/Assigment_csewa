package com.example.Assignment.Assignment.repository;

import com.example.Assignment.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
