package com.turkcell.crm_hw1.controllers;

import com.turkcell.crm_hw1.dtos.segment.CreateSegmentDto;
import com.turkcell.crm_hw1.dtos.segment.GetAllSegmentsDto;
import com.turkcell.crm_hw1.dtos.segment.UpdateSegmentDto;
import com.turkcell.crm_hw1.services.concretes.SegmentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/api/v1/segments")
@AllArgsConstructor
public class SegmentController {
    private final SegmentService segmentService;

    @PostMapping
    public void add(@RequestBody CreateSegmentDto createSegmentDto)
    {
        this.segmentService.add(createSegmentDto);
    }

    @GetMapping
    public List<GetAllSegmentsDto> getAll() {
        return this.segmentService.getAll();
    }

    @PutMapping
    public void update(@RequestBody UpdateSegmentDto updateSegmentDto)
    {
        this.segmentService.update(updateSegmentDto);
    }
}
