package com.turkcell.crm_hw1.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="feedback_status")
public class FeedbackStatus extends BaseEntity{
    @Column(name="status_name")
    private String statusName;
}
