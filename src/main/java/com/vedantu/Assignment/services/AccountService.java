package com.vedantu.Assignment.services;

import java.util.List;

import com.vedantu.Assignment.entities.Account;

public interface AccountService {
	    public void createAccount(Account account);
	    public List<Account> getAccount();
	    public Account findById(long id);
	    public Account update(Account account, long l);
	    public void deleteAccountById(long id);
}
