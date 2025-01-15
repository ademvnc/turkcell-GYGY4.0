package com.turkcell.crm_hw1.dtos.customerType;

import jakarta.validation.constraints.NotNull;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetCustomerTypeByIdDto {
    private String id;
    private String typeName;
    private String createdDate;
    private String updatedDate;
}
