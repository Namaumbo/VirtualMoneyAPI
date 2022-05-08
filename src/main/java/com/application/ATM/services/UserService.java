package com.application.ATM.services;


import com.application.ATM.models.User;
import com.application.ATM.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import javax.persistence.EntityNotFoundException;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public  UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public User RegisterUser(@RequestBody User user){
        return userRepository.save(user);
    }


    //    services for admnin
    protected void DeleteUser(String username) {
        userRepository.findByUsername(username).
                orElseThrow(() -> new EntityNotFoundException("NO user with user name " + username));
    }

    public User getOneUser(int id ){
        return userRepository.findById(id).orElse(null);
    }
}
