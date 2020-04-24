package com.example;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.data.Account;
import com.example.repository.AccountRepository;

@SpringBootApplication
public class SpringBootHibernateIntegration1Application implements CommandLineRunner
{
	private AccountRepository accountRepository;
	
	@Autowired
	public SpringBootHibernateIntegration1Application(AccountRepository accountRepository)
	{
		super();
		this.accountRepository = accountRepository;
	}

	public static void main(String[] args)
	{
		SpringApplication.run(SpringBootHibernateIntegration1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception
	{
	
		accountRepository.save(new Account(UUID.randomUUID().toString(), "Savings", 5000));
		accountRepository.save(new Account(UUID.randomUUID().toString(), "Credit Card", 4000));
		accountRepository.save(new Account(UUID.randomUUID().toString(), "Loan", 20000));
		//System.out.println(accountRepository.getAccounts().toString());
	}

}
