package com.dbs.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dbs.beans.Receiver;

public interface Receiverepo extends JpaRepository<Receiver, String> {

}
