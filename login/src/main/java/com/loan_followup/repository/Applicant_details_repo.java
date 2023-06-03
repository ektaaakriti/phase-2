package com.loan_followup.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.loan_followup.entity.Applicant_details;
public interface Applicant_details_repo extends JpaRepository<Applicant_details, Long> {


	@Transactional
	 @Modifying(clearAutomatically = true) 
	@Query("select u from Applicant_details u")
	  public Applicant_details ApplicantDetails(); 

}
