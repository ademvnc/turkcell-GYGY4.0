package com.turkcell.crm_hw1.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name="campaigns")
public class Campaign extends BaseEntity{
    @Column(name="start_date")
    private LocalDateTime startDate;

    @Column(name="end_date")
    private LocalDateTime endDate;

    @Column(name="performance_report")
    private String performanceReport;

    @ManyToOne()
    @JoinColumn(name="segment_id")
    private Segment segment;


}
