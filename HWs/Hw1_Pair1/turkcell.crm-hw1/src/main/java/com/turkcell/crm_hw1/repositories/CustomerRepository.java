package com.turkcell.crm_hw1.repositories;

import com.turkcell.crm_hw1.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, String> {
}
