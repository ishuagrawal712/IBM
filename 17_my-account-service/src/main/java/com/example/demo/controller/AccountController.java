package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Account;
import com.example.demo.service.AccountService;

@RestController
@RequestMapping("/api")
public class AccountController
{
	private AccountService accountService;
	
	@Autowired
	public AccountController(AccountService accountService)
	{
		super();
		this.accountService = accountService;
	}

	@GetMapping("/accounts")
	public Iterable<Account> getAllAccounts()
	{
		return accountService.getAccounts();
	}
	
	@GetMapping("/accounts/{accountNumber}")
	public Iterable<Account> getById(@PathVariable("accountNumber") String accountNumber)
	{
		return accountService.findByNumber(accountNumber);
	}
	
	@GetMapping("/accounts/{id}")
	public Account getById(@PathVariable("id") Integer id)
	{
		return accountService.findById(id);
	}
	
}
