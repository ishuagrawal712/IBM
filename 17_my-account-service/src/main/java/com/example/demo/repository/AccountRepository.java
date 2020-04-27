package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Account;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

@Repository(value="accountRepository")
public interface AccountRepository extends CrudRepository<Account, Integer>
{
	@Query
	public Iterable<Account> findByNumber(String number);
}
