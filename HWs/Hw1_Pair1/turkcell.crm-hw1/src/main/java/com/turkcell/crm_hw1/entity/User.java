package com.turkcell.crm_hw1.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="users")
public class User extends BaseEntity{
    @ManyToOne()
    @JoinColumn(name="role_id")
    private Role role;
}
