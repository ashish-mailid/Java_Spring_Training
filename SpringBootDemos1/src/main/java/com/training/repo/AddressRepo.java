package com.training.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.training.entity.Address;

public interface AddressRepo extends JpaRepository<Address, Integer> {

}
