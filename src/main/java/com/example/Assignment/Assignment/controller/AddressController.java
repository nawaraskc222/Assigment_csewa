package com.example.Assignment.Assignment.controller;

import com.example.Assignment.Assignment.model.Address;
import com.example.Assignment.Assignment.service.AddressService;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/addresses")
public class AddressController {

    @Autowired
    private AddressService addressService;

    @GetMapping("/student/{studentId}")
    public List<Address> getAddressesByStudentId(@PathVariable Long studentId) {
        return addressService.getAddressesByStudentId(studentId);
    }

    @PostMapping
    public Address saveAddress(@RequestBody Address address) {
        return addressService.saveAddress(address);
    }
}
