package com.application.ATM.controllers;

import com.application.ATM.User.userApiutils.APIResponses;
import com.application.ATM.models.User;
import com.application.ATM.services.AccountDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


import javax.validation.Valid;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class AccountDetailsController {


    private AccountDetailsService accountDetailService;

    @Autowired
    public AccountDetailsController(AccountDetailsService accountDetailService){
        this.accountDetailService = accountDetailService;
    }

    @PostMapping("/add-account/{accountRequestEmail}")
    public ResponseEntity<Object> registerAccount(@PathVariable("accountRequestEmail") String email){
       return accountDetailService.addAccount(email);
    }

    @GetMapping("/all-accounts")
    public ResponseEntity<Object> allaAccount(){
        return accountDetailService.getAllAccDetails();
    }


}
