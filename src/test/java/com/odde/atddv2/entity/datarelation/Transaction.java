package com.odde.atddv2.entity.datarelation;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Accessors(chain = true)
@Table(name = "transactions")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonIgnore
    private long id;

    @ManyToOne
    private Order order;

    private String type, status;

    private BigDecimal amount;
}
