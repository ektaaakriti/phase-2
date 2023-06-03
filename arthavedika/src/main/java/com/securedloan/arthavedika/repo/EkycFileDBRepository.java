package com.securedloan.arthavedika.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.securedloan.arthavedika.model.EkycFileDB;

@Repository
public interface EkycFileDBRepository extends JpaRepository<EkycFileDB, String> {

}
