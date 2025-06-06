package org.example.paymenttest.repository;

import org.example.paymenttest.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(java.lang.String email);

    Optional<User> findByEmailAndPassword(String email, String password);

    @Query("SELECT u.username FROM User u where u.email = :email")
    Optional<String> findNameByEmail(@Param("email") String email);
}
