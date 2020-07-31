package com.ssmdemo.dao;

import com.ssmdemo.Account;

import java.util.List;

public interface AccountDao {
    List<Account> findAll();
    void insertAccount(Account account);
}
