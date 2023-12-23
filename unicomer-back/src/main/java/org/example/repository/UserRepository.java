package org.example.repository;

import org.example.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    @Query("FROM users WHERE dni = :dni AND secret = :secret")
//    @Query("FROM users WHERE name = :name AND secret = :secret")
    Optional<User> findByCredential(@Param("dni") Integer dni,@Param("secret") String secret);
}
