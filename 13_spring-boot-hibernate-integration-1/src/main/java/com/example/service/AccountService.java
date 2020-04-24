package com.example.service;

import org.springframework.http.ResponseEntity;

import com.example.data.Account;

public interface AccountService
{	
	public ResponseEntity<Iterable<Account>> getAccounts();
	public Account findById(int accountNumber);
}
