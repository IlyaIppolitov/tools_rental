package com.itexclusive.toolsrental.model.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;


@Data
@Entity
@Table(name = "cart_t")
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @OneToOne(fetch = FetchType.LAZY)
    @MapsId
    private User user;
    @ManyToMany(mappedBy = "cartList", cascade = CascadeType.ALL)
    private Set<Item> cartList;
}
