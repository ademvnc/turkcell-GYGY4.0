package com.turkcell.crm_hw1.dtos.customer;

import com.turkcell.crm_hw1.dtos.customerType.GetAllCustomerTypesDto;
import com.turkcell.crm_hw1.dtos.segment.GetAllSegmentsDto;
import com.turkcell.crm_hw1.entity.CustomerType;
import com.turkcell.crm_hw1.entity.Segment;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetAllCustomersDto {
    private int id;

    private String firstName;

    private String lastName;

    private String address;

    private String contact;

    private String identityNo;

    private GetAllCustomerTypesDto type;

    private GetAllSegmentsDto segment;
}
