package com.example.proba.repositories;

import com.example.proba.Account;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AccountRepository extends JpaRepository<Account,Long> {

}
