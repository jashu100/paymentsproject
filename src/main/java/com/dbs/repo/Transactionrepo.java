package com.dbs.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dbs.beans.Transaction;

public interface Transactionrepo extends JpaRepository<Transaction, String> {

}
