package com.ssmdemo.service.imp;

import com.ssmdemo.Account;
import com.ssmdemo.dao.AccountDao;
import com.ssmdemo.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AccountServiceImp implements AccountService {
    @Autowired
    private AccountDao accountDao;
    public List<Account> findAll() {
       return accountDao.findAll();
    }

    public void insert(Account account) {
        accountDao.insertAccount(account);
    }
}
