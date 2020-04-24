package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.example.data.Account;
import com.example.repository.AccountRepository;

@Service(value = "accountService")
@EnableTransactionManagement
public class AccountServiceImpl implements AccountService
{
	private AccountRepository accountRepository;

	@Autowired
	public AccountServiceImpl(AccountRepository accountDAO)
	{
		super();
		this.accountRepository = accountDAO;
	}

	@Override
	@Transactional
	public ResponseEntity<Iterable<Account>> getAccounts()
	{
		Iterable<Account> accounts=accountRepository.findAll();
		return ResponseEntity.ok().body(accounts);
	}

	@Override
	public Account findById(int accountNumber)
	{
		return accountRepository.findById(accountNumber).get();
	}
	

}
