package com.application.ATM.repositories;

import com.application.ATM.models.AccountDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountDetailsRepo extends JpaRepository<AccountDetail, Integer> {


}
