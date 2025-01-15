package com.turkcell.crm_hw1.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "role")
public class Role extends BaseEntity{
    @Column(name = "role_name")
    private String roleName;

    @OneToMany(mappedBy = "role")
    private List<User> users;

    @ManyToMany
    @JoinTable(name = "role_permission",
            joinColumns = @JoinColumn(name = "role_id"),
            inverseJoinColumns = @JoinColumn(name = "permission_id")
    )
    private List<Permission> permissions;

}
