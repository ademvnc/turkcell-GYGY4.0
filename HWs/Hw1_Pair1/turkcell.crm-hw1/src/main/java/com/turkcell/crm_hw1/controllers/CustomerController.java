package com.turkcell.crm_hw1.controllers;

import com.turkcell.crm_hw1.dtos.customer.CreateCustomerDto;
import com.turkcell.crm_hw1.dtos.customer.GetAllCustomersDto;
import com.turkcell.crm_hw1.dtos.customer.UpdateCustomerDto;
import com.turkcell.crm_hw1.services.concretes.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/api/v1/customers")
@AllArgsConstructor
public class CustomerController {
    private final CustomerService customerService;

    @PostMapping
    public void add(@RequestBody CreateCustomerDto createCustomerDto)
    {
        this.customerService.add(createCustomerDto);
    }

    @GetMapping
    public List<GetAllCustomersDto> getAll() {
        return this.customerService.getAll();
    }

    @PutMapping
    public void update(@RequestBody UpdateCustomerDto updateCustomerDto)
    {
        this.customerService.update(updateCustomerDto);
    }
}
