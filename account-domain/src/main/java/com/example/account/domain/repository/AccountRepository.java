package com.example.account.domain.repository;


import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;

import com.example.account.domain.model.Account;

public interface AccountRepository {

    List<Account> findAll();
//    List<Account> findByCriteria(Account account, Pageable pageable);
    List<Account> findByCriteria(@Param("condition") SearchCondition condition, @Param("pageable") Pageable pageable);
    Account findOne(String userId);
    int create(Account account);
    long countByCondition(@Param("condition") SearchCondition condition);
}