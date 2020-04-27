package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.Account;
import com.example.demo.repository.AccountRepository;


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
	public Iterable<Account> getAccounts()
	{
		return accountRepository.findAll();
	}

	@Override
	public Account findById(int accountNumber)
	{
		return accountRepository.findById(accountNumber).get();
	}
	
	@Override
	public Iterable<Account> findByNumber(String number)
	{
		return accountRepository.findByNumber(number);
	}
	

}
