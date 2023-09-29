package com.Anish1.Mapping.service;

import com.Anish1.Mapping.model.Address;
import com.Anish1.Mapping.repo.AddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {
    @Autowired
    AddressRepo addressRepo;

    public String addAddress(Address newAddress) {
        addressRepo.save(newAddress);
        return "Address Added";
    }
}
