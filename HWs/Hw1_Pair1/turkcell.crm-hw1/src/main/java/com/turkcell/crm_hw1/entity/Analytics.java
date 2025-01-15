package com.turkcell.crm_hw1.entity;

import jakarta.persistence.*;

@Entity
@Table(name="analytics")
public class Analytics extends BaseEntity{
    @Column(name="report")
    private String report;

    @ManyToOne()
    @JoinColumn(name="report_type")
    private ReportType reportType;
}
