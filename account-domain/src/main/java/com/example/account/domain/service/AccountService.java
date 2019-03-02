package com.example.account.domain.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.example.account.domain.model.Account;
import com.example.account.domain.repository.SearchCondition;

/**
 * 会員ログインサービスインタフェース。
 * @author NTT 電電太郎
 */
public interface AccountService {

    /**
     * ログイン時に必要な業務処理を行う。
     * @param member 会員情報
     */
    List<Account> getAccountList();
//    List<Account> getAccountByCriteria(Account account,Pageable pageable);
    Page<Account> getAccountByCriteria(SearchCondition condition, Pageable pageable);
    Account getAccount(String userId);
    Account register(Account account);
}