package com.turkcell.crm_hw1.dtos.customer;


import com.turkcell.crm_hw1.dtos.customerType.GetCustomerTypeByIdDto;
import com.turkcell.crm_hw1.dtos.segment.GetSegmentByIdDto;
import com.turkcell.crm_hw1.entity.CustomerType;
import com.turkcell.crm_hw1.entity.Segment;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetCustomerByIdDto {
    private int id;

    private String firstName;

    private String lastName;

    private String address;

    private String contact;

    private String identityNo;

    private GetCustomerTypeByIdDto type;

    private GetSegmentByIdDto segment;
}
