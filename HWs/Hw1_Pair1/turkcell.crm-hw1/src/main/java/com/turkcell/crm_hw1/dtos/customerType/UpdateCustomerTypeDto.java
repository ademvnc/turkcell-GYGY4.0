package com.turkcell.crm_hw1.dtos.customerType;

import jakarta.validation.constraints.NotNull;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UpdateCustomerTypeDto {
    @NotNull
    private String id;
    @NotNull
    private String typeName;
}
