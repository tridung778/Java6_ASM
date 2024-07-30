package com.example.Java6_ASM.services;

import com.example.Java6_ASM.models.Account;

import java.util.List;
import java.util.UUID;

public interface AccountService {
	Account findById(String username);

	List<Account> findAll();

	Account createAccount(Account account);

	Account findById(UUID id);
}
