package com.application.ATM.services;

import com.application.ATM.User.userApiutils.APIResponses;
import com.application.ATM.models.AccountDetail;
import com.application.ATM.models.User;
import com.application.ATM.repositories.AccountDetailsRepo;
import com.application.ATM.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;

@Service
public class AccountDetailsService {

    private UserRepository userRepository;
    private AccountDetailsRepo accountDetailRepo;

    @Autowired
    public AccountDetailsService(UserRepository userRepository, AccountDetailsRepo accountDetailRepo ) {
        this.userRepository = userRepository;
        this.accountDetailRepo = accountDetailRepo;

    }

    public ResponseEntity<Object> getAllAccDetails(){
        List<AccountDetail> accountDetails = accountDetailRepo.findAll();
        User user = new User();
        AccountDetail accountDetail = new AccountDetail();
        return APIResponses.generateResponse("no user", HttpStatus.NOT_FOUND,user);
    }

//    assigning account
    public ResponseEntity<Object> addAccount(String email) {
        User user = userRepository.findByEmail(email);
        if(user == null){
           throw new EntityNotFoundException("oops there has been an error");
        }
//        firstly set the user account then  checki if the user account exitsts
        AccountDetail accountDetail = new AccountDetail();
        accountDetail.setAccountNumber(accountDetail.getAccountNumber());
        accountDetail.setAccountBalance(0);
//        saving to the database
        accountDetailRepo.save(accountDetail);
        user.setAccountDetail(accountDetail);
        userRepository.save(user);
        return APIResponses.generateResponse("Account created",HttpStatus.CREATED,user.getAccountDetail().getAccountNumber());
    }
}
