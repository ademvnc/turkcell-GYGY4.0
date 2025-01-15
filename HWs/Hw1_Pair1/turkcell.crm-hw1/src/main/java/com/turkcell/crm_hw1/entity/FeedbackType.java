package com.turkcell.crm_hw1.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "feedback_types")
public class FeedbackType extends BaseEntity {
    @Column(name = "type_name")
    private String typeName;
}
