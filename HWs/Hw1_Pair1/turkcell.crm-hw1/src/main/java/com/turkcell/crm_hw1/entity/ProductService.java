package com.turkcell.crm_hw1.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "product_service")
public class ProductService extends BaseEntity{

    @ManyToOne
    @JoinColumn(name = "type_id")
    private ProductServiceType type;

    @Column(name = "stock")
    private Integer stock;

    @Column(name = "price")
    private BigDecimal price;

    @ManyToMany
    @JoinTable(name = "campaign_product_service",
            joinColumns = @JoinColumn(name = "product_service_id"),
            inverseJoinColumns = @JoinColumn(name = "campaign_id")
    )
    private List<Campaign> campaignList;

    @ManyToMany
    @JoinTable(name = "promotion_product_service",
            joinColumns = @JoinColumn(name = "product_service_id"),
            inverseJoinColumns = @JoinColumn(name = "promotion_id")
    )
    private List<Promotion> promotionList;

}
