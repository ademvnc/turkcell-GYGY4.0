package com.turkcell.crm_hw1.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="product_service_types")
public class ProductServiceType extends BaseEntity{
    @Column(name="type_name")
    private String typeName;
}
