package com.turkcell.crm_hw1.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="segments")
public class Segment extends BaseEntity{
    @Column(name="segment_name")
    private String segmentName;
}
