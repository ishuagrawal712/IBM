package com.example.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.data.Account;
import com.example.service.AccountService;

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
	public ResponseEntity<Iterable<Account>> getAllAccounts()
	{
		return accountService.getAccounts();
	}
	
	@GetMapping("/accounts/{accountNumber}")
	public Account getById(@PathVariable("accountNumber") int accountNumber)
	{
		return accountService.findById(accountNumber);
	}
	
}
