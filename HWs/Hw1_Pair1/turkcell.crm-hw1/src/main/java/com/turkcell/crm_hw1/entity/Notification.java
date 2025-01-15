package com.turkcell.crm_hw1.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "notifications")
public class Notification extends BaseEntity {
    @ManyToOne
    @JoinColumn(name = "notification_type")
    private NotificationType notificationType;

    @ManyToOne
    @JoinColumn(name = "message_type")
    private MessageType messageType;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customers;

    @Column(name = "content")
    private String content;

    @Column(name = "sent_at")
    private LocalDateTime sentAt;
}
