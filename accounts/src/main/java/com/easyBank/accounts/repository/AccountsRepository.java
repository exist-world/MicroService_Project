package com.easyBank.accounts.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.easyBank.accounts.Entity.Accounts;

@Repository
public interface AccountsRepository extends JpaRepository<Accounts, Long>{

}
