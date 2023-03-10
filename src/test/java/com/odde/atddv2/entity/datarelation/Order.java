package com.odde.atddv2.entity.datarelation;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Accessors(chain = true)
@Table(name = "orders_for_relation")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonIgnore
    private long id;

    @ManyToOne
    private Customer customer;

    @ManyToOne
    private Product product;

    private String code, status;
    private int total;
}
