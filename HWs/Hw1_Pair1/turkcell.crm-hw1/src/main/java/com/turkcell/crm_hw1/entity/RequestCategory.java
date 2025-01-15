package com.turkcell.crm_hw1.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "request_categories")
public class RequestCategory extends BaseEntity{
    @Column(name="category_name")
    private String categoryName;
}
