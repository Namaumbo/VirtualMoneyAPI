package com.application.ATM.repositories;

import com.application.ATM.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.swing.text.html.Option;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User , Integer> {
//    finding user by phoneNumber
    Optional<User> findByPhoneNumber(String phoneNumber);
//    finding user by email
    User findByEmail(String phoneNumber);
//    finding user by accountNumber
//    Optional findByAccountNumber(String AccountNumber);
}

