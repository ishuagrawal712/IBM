package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import com.example.demo.model.Account;
import com.example.demo.repository.AccountRepository;


@SpringBootApplication
@EnableDiscoveryClient
public class MyAccountServiceApplication implements CommandLineRunner
{
	private AccountRepository accountRepository;
	
	@Autowired
	public MyAccountServiceApplication(AccountRepository accountRepository)
	{
		super();
		this.accountRepository = accountRepository;
	}

	public static void main(String[] args)
	{
		SpringApplication.run(MyAccountServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception
	{
		accountRepository.save(new Account(111, "5000"));
		accountRepository.save(new Account(222, "4000"));
		accountRepository.save(new Account(333, "2000"));
		accountRepository.save(new Account(444, "6000"));
		
	}

}
