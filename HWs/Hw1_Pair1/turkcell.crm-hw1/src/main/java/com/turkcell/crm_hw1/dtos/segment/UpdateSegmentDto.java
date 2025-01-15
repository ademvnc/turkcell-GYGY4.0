package com.turkcell.crm_hw1.dtos.segment;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UpdateSegmentDto {
    @NotNull
    private String id;
    @NotNull
    @Size(min = 1, max = 20)
    private String name;
}
