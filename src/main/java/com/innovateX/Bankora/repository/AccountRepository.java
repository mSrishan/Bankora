package com.innovateX.Bankora.repository;

import com.innovateX.Bankora.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {

}
