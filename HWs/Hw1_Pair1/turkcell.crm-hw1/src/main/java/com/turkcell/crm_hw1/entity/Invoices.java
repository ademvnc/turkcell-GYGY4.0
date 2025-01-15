package com.turkcell.crm_hw1.entity;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Entity
@Table(name = "invoices")
public class Invoices extends BaseEntity {
    @ManyToOne
    @JoinColumn(name = "subscription_id")
    private Subscription subscription;

    @Column(name = "creation_date")
    private LocalDateTime creationDate;

    @Column(name = "due_date")
    private LocalDateTime dueDate;

    @Column(name = "amount")
    private BigDecimal amount;

    @Column(name = "payment_date")
    private LocalDateTime paymentDate;

    @Column(name = "late_fee")
    private BigDecimal lateFee;

    @Column(name = "discount")
    private BigDecimal discount;
}
