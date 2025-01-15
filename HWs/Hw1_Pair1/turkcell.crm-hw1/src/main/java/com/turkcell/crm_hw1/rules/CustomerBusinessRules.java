package com.turkcell.crm_hw1.rules;

import com.turkcell.crm_hw1.repositories.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class CustomerBusinessRules {
    private final CustomerRepository customerRepository;

    public void segmentMustExist(String segmentId) {
        if (!customerRepository.existsById(segmentId)) {
            throw new IllegalArgumentException("Segment with id " + segmentId + " does not exist.");
        }
    }

    public void customerTypeMustExist(String customerTypeId) {
        if (!customerRepository.existsById(customerTypeId)) {
            throw new IllegalArgumentException("Customer type with id " + customerTypeId + " does not exist.");
        }
    }
}
