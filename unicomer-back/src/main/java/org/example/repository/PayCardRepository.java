package org.example.repository;

import org.example.entity.PayCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PayCardRepository extends JpaRepository<PayCard, Long> {
}
