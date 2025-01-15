package com.turkcell.crm_hw1.controllers;

import com.turkcell.crm_hw1.dtos.customer.CreateCustomerDto;
import com.turkcell.crm_hw1.dtos.customer.GetAllCustomersDto;
import com.turkcell.crm_hw1.dtos.customer.UpdateCustomerDto;
import com.turkcell.crm_hw1.dtos.customerType.CreateCustomerTypeDto;
import com.turkcell.crm_hw1.dtos.customerType.GetAllCustomerTypesDto;
import com.turkcell.crm_hw1.dtos.customerType.UpdateCustomerTypeDto;
import com.turkcell.crm_hw1.services.concretes.CustomerService;
import com.turkcell.crm_hw1.services.concretes.CustomerTypeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/api/v1/customer-types")
@AllArgsConstructor
public class CustomerTypeController {
    private final CustomerTypeService customerTypeService;

    @PostMapping
    public void add(@RequestBody CreateCustomerTypeDto createCustomerTypeDto)
    {
        this.customerTypeService.add(createCustomerTypeDto);
    }

    @GetMapping
    public List<GetAllCustomerTypesDto> getAll() {
        return this.customerTypeService.getAll();
    }

    @PutMapping
    public void update(@RequestBody UpdateCustomerTypeDto updateCustomerTypeDto)
    {
        this.customerTypeService.update(updateCustomerTypeDto);
    }
}
