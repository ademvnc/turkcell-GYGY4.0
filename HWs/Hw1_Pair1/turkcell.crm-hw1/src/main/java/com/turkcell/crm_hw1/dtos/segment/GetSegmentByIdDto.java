package com.turkcell.crm_hw1.dtos.segment;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetSegmentByIdDto {
    private String id;
    private String name;
}
