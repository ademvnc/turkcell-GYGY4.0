package com.turkcell.crm_hw1.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name="subscriptions")
public class Subscription extends BaseEntity{
    @ManyToOne()
    @JoinColumn(name="customer_id")
    private Customer customer;

    @ManyToOne()
    @JoinColumn(name="plan_type_id")
    private PlanType type;

    @ManyToOne()
    @JoinColumn(name="payment_method_id")
    private PaymentMethod paymentMethod;

    @Column(name="billing_cycle")
    private String billingCycle;

    @Column(name="start_date")
    private LocalDateTime startDate;

    @Column(name="end_date")
    private LocalDateTime endDate;

    @Column(name="is_active")
    private boolean isActive;
}
