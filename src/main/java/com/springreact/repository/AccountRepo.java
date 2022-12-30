package com.springreact.repository;

import com.springreact.entities.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepo extends JpaRepository<Account, Integer> {

}
