package com.Anish1.Mapping.repo;

import com.Anish1.Mapping.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepo extends JpaRepository<Address,Integer> {
}
