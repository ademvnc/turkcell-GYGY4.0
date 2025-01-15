package com.turkcell.crm_hw1.dtos.segment;

import com.turkcell.crm_hw1.entity.Segment;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetAllSegmentsDto {
    private String id;
    private String name;
}
