package com.loan_followup.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.loan_followup.entity.Applicant_details;
import com.loan_followup.entity.EMI_details;

public interface EMI_details_repo extends JpaRepository<EMI_details, Long> {


	@Transactional
	 @Modifying(clearAutomatically = true) 
	@Query("select u from EMI_details u")
	  public EMI_details EMIDetails();

}
