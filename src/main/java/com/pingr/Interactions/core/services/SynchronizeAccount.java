package com.pingr.Interactions.core.services;

import com.pingr.Interactions.core.Account;
import com.pingr.Interactions.core.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SynchronizeAccount {
    private final AccountRepository repo;

    @Autowired
    public SynchronizeAccount(AccountRepository repo) {
        this.repo = repo;
    }

    public void store(Account account) {
        this.repo.save(account);
    }

    public void remove(Account account) {
        this.repo.deleteById(account.getId());
    }
}
