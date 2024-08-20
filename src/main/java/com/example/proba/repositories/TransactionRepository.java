package com.example.proba.repositories;

import com.example.proba.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TransactionRepository extends JpaRepository<Transaction,Long> {
}
