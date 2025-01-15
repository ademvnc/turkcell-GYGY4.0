package com.turkcell.crm_hw1.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "request_status")
public class RequestStatus extends BaseEntity{
    @Column(name="status_name")
    private String statusName;
}
