package com.example.Assignment.Assignment.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Assignment.Assignment.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
