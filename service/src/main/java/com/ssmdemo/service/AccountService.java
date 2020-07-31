package com.ssmdemo.service;

import com.ssmdemo.Account;

import java.util.List;

public interface AccountService  {
    List<Account> findAll();
    void insert(Account account);
}
