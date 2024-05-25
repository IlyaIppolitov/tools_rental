package com.itexclusive.toolsrental.model.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Table(name = "brand_t")
@Setter
@Getter
public class Brand {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name")
    private String name;
    @OneToMany(mappedBy = "brand", cascade = CascadeType.ALL)
    private Set<Item> catalogue;
}
