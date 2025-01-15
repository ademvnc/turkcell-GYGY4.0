package com.turkcell.crm_hw1.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="customer_types")
public class CustomerType extends BaseEntity{
    @Column(name="type_name")
    private String typeName;
}
