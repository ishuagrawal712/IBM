package com.example.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.data.Account;

@Repository(value = "accountRepository")
public interface AccountRepository extends CrudRepository<Account, Integer>
{

}
