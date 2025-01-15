package com.turkcell.crm_hw1.entity;

import jakarta.persistence.*;
import jakarta.persistence.ManyToOne;

@Entity
@Table(name = "logs")
public class Log extends BaseEntity{
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "description")
    private String description;
}
