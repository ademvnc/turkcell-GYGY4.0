package com.turkcell.crm_hw1.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Table(name = "message_types")
public class MessageType extends BaseEntity {
    @Column(name = "type_name")
    private String typeName;
}
