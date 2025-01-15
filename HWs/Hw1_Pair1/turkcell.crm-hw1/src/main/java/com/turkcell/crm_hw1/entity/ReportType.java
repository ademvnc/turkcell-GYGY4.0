package com.turkcell.crm_hw1.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "report_types")
public class ReportType extends BaseEntity{
    @Column(name="type_name")
    private String typeName;
}
