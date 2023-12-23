package org.example.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

//@Entity(name = "user_transaction")
//@Table(name = "user_transaction")
//@Cacheable
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserTransaction {

//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

//    @Column(name = "transaction_type")
    private TransactionType transactionType;
//    @Column(name = "amount")
    private BigDecimal amount;
//    @Column(name = "time")
    private Date timeStamp;
}
