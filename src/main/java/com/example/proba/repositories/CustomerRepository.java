package com.example.proba.repositories;

import com.example.proba.Customer;
import org.springframework.data.jpa.repository.JpaRepository;



public interface CustomerRepository extends JpaRepository<Customer,Long> {

}
