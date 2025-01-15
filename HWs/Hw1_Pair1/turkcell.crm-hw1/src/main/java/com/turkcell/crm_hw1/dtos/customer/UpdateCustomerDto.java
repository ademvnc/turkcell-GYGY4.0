package com.turkcell.crm_hw1.dtos.customer;


import com.turkcell.crm_hw1.entity.CustomerType;
import com.turkcell.crm_hw1.entity.Segment;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateCustomerDto {
    @NotNull
    private int id;

    @NotNull
    @Size(min = 1, max = 20)
    private String firstName;

    @NotNull
    @Size(min = 1, max = 20)
    private String lastName;

    @Size(min = 1, max = 200)
    private String address;

    @Size(min = 1, max = 200)
    private String contact;

    @NotNull
    @Size(min = 1, max = 20)
    private String identityNo;

    @NotNull
    private String typeId;

    @NotNull
    private String segmentId;
}

