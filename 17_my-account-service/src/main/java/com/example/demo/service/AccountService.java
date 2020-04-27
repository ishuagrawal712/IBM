package com.example.demo.service;

import com.example.demo.model.Account;

public interface AccountService
{	
	public Iterable<Account> getAccounts();
	public Account findById(int accountNumber);
	Iterable<Account> findByNumber(String number);
}
