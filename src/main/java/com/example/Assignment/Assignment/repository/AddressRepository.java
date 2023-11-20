package com.example.Assignment.Assignment.repository;

import com.example.Assignment.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AddressRepository extends JpaRepository<Address, Long> {
    List<Address> findByStudentId(Long studentId);
}