package com.securedloan.arthavedika.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.securedloan.arthavedika.model.FileDB;

@Repository
public interface FileDBRepository extends JpaRepository<FileDB, String> {

}