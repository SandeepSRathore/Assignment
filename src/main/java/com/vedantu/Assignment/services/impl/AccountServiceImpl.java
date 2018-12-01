package com.vedantu.Assignment.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vedantu.Assignment.entities.Account;
import com.vedantu.Assignment.repositories.AccountRepository;
import com.vedantu.Assignment.services.AccountService;
import com.vedantu.Assignment.services.OrderService;

@Service
@Transactional
public class AccountServiceImpl implements AccountService {
    @Autowired
    AccountRepository accountRepository;

    public void createAccount(Account account) {
        // TODO Auto-generated method stub
        accountRepository.save(account);
    }

    public List<Account> getAccount() {
        // TODO Auto-generated method stub
        return (List<Account>) accountRepository.findAll();
    }

    public Account findById(long id) {
        // TODO Auto-generated method stub
        return accountRepository.findById(id).get();
    }

    public Account update(Account account, long l) {
        // TODO Auto-generated method stub
        return accountRepository.save(account);
    }

    public void deleteAccountById(long id) {
        // TODO Auto-generated method stub
        accountRepository.deleteById(id);
    }

}
