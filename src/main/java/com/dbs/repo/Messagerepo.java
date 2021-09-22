package com.dbs.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dbs.beans.message;

public interface Messagerepo extends JpaRepository<message, String> {

}
