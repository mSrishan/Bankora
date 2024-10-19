package com.innovateX.Bankora.service.impl;

import com.innovateX.Bankora.dto.AccountDto;
import com.innovateX.Bankora.entity.Account;
import com.innovateX.Bankora.mapper.AccountMapper;
import com.innovateX.Bankora.repository.AccountRepository;
import com.innovateX.Bankora.service.AccountService;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    private AccountRepository accountRepository;

    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public AccountDto accountCreate(AccountDto accountDto) {
        Account account = AccountMapper.mapToAccount(accountDto);
        Account savedAccount = accountRepository.save(account);
        return AccountMapper.mapToAccountDto(savedAccount);

    }
}
