package com.turkcell.crm_hw1.entity;

import jakarta.persistence.*;

@Entity
@Table(name="feedback")
public class Feedback extends BaseEntity{
    @ManyToOne()
    @JoinColumn(name="customer_id")
    private Customer customer;

    @ManyToOne()
    @JoinColumn(name="type_id")
    private FeedbackType type;

    @ManyToOne()
    @JoinColumn(name="status_id")
    private FeedbackStatus status;

    @Column(name="actions")
    private String actions;
}
