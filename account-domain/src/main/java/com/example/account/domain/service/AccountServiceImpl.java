package com.example.account.domain.service;

import java.util.Collections;
import java.util.List;

import javax.inject.Inject;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;
import org.terasoluna.gfw.common.exception.ResourceNotFoundException;
import org.terasoluna.gfw.common.message.ResultMessages;

import com.example.account.domain.model.Account;
import com.example.account.domain.repository.AccountRepository;
import com.example.account.domain.repository.SearchCondition;

@Transactional
@Service
public class AccountServiceImpl implements AccountService {

    @Inject
    AccountRepository accountRepository;

    @Transactional(readOnly = true)
    @Override
    public List<Account> getAccountList() {
        // (6)
        List<Account> accountList = accountRepository.findAll();
        if (accountList == null) { // (7)
            throw new ResourceNotFoundException(ResultMessages.error().add("e.ex.td.5001"));
        }
        return accountList;
    }

    @Override
    public Page<Account> getAccountByCriteria(SearchCondition condition, Pageable pageable) {

    	long total = accountRepository.countByCondition(condition);
    	
    	List<Account> accountList = (total > 0) ? accountRepository.findByCriteria(condition, pageable): Collections.emptyList();

        return new PageImpl<Account>(accountList, pageable, total);
    }

    @Transactional(readOnly = true)
    @Override
    public Account getAccount(String userId) {
        // (6)
        Account account = accountRepository.findOne(userId);
        if (account == null) { // (7)
            throw new ResourceNotFoundException(ResultMessages.error().add(
                    "e.ex.td.5001"));
        }
        return account;
    }
    
    @Override
    @Transactional
    public Account register(Account account) {
        Assert.notNull(account, "member must not be null");

        int insertAccountCount = accountRepository.create(account);
        if (insertAccountCount != 1) {
            throw new ResourceNotFoundException(ResultMessages.error().add("E_AR_A0_L9002"));
        }

        return account;
    }
    
}