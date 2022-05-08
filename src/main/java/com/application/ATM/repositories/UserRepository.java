package com.application.ATM.repositories;

import com.application.ATM.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User , Integer> {
    <T> Optional<T> findByUsername(String username);
//    Optional<User> findByName(String username);
}
