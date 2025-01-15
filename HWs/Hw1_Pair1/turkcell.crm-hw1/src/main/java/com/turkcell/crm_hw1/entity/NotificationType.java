package com.turkcell.crm_hw1.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.List;

@Entity
@Table(name = "notification_type")
public class NotificationType extends BaseEntity {
    @Column(name = "type_name")
    private String typeName;
}
