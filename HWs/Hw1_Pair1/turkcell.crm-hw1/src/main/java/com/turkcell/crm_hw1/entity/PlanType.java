package com.turkcell.crm_hw1.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table(name = "plan_types")
public class PlanType extends BaseEntity{
    @Column(name = "plan_type_name")
    private String planTypeName;
}
