package com.mProject.banking_app.service;

import com.mProject.banking_app.dto.AccountDto;
import com.mProject.banking_app.entity.Account;

import java.util.List;

public interface AccountService {

    AccountDto createAccount(AccountDto accountDto);

    AccountDto getAccountById(Long id);

    AccountDto deposit(Long id, double amount);

    AccountDto withdraw(Long id, double amount);

    List<AccountDto> getAllAccounts();

    void deleteAccount(Long id);

}
