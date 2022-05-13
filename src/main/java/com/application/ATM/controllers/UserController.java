package com.application.ATM.controllers;


import com.application.ATM.models.User;
import com.application.ATM.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api/v1")
public class UserController {

   @Autowired
   private UserService userService ;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping("/register-user")
    public void registerUser(@RequestBody User user) {
        userService.RegisterUser(user);

    }

    @GetMapping("/get-current-balance/{userId}")
    public ResponseEntity<Object> getCurrentBalance(@PathVariable("userId") int id ){
     return  userService.getCurrentBalance(id);
    }

}
