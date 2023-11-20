package com.example.Assignment.Assignment.service;

import com.example.Assignment.Assignment.model.Address;

import com.example.Assignment.Assignment.repository.AddressRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;

    public List<Address> getAddressesByStudentId(Long studentId) {
        return addressRepository.findByStudentId(studentId);
    }

    public Address saveAddress(Address address) {
        return addressRepository.save(address);
    }
}
