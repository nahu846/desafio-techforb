package org.example.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.*;

@Entity(name = "paycards")
@Table(name = "paycards")
@Cacheable
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PayCard {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "numero")
    private int numero;

    @Column(name = "saldo")
    private BigDecimal saldo;

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "payCards")
    private List<User> users = new ArrayList<>();
}
