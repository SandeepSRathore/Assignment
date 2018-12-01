package com.vedantu.Assignment.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vedantu.Assignment.entities.Account;

public interface AccountRepository extends JpaRepository<Account, Long>{

}