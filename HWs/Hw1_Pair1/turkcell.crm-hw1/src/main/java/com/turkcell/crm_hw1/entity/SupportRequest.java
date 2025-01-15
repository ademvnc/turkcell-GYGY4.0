package com.turkcell.crm_hw1.entity;

import jakarta.persistence.*;

@Entity
@Table(name="support_requests")
public class SupportRequest extends BaseEntity{
    @ManyToOne()
    @JoinColumn(name="customer_id")
    private Customer customer;

    @ManyToOne()
    @JoinColumn(name="category_id")
    private RequestCategory category;

    @ManyToOne()
    @JoinColumn(name="status_id")
    private RequestStatus status;

    @ManyToOne()
    @JoinColumn(name="user_id")
    private User customerRepresentative;

    @Column(name="description")
    private String description;
}
