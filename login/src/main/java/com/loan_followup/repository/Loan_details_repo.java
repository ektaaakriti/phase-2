package com.loan_followup.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.loan_followup.entity.Applicant_details;
import com.loan_followup.entity.Loan_details;

public interface Loan_details_repo extends JpaRepository<Loan_details, Long> {


	@Transactional
	 @Modifying(clearAutomatically = true) 
	@Query("select u from Loan_details u")
	  public Loan_details LoanDetails(); 

}
