package com.application.ATM.controllers;


import com.application.ATM.models.User;
import com.application.ATM.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;


@RestController
@RequestMapping("/api/v1")
public class UserController {

   @Autowired
   private UserService userService ;

    public UserController(UserService userService){
        this.userService = userService;
    }
  


    @GetMapping("/users")
    public String getUser() {
        return "Hello world";
    }

}
