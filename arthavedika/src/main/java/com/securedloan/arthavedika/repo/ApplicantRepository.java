package com.securedloan.arthavedika.repo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.securedloan.arthavedika.model.Applicant;
import java.util.Optional;

@Repository
public interface ApplicantRepository extends JpaRepository<Applicant, Long> {

	@Query("SELECT a FROM Applicant a WHERE a.applicant_mobile_no =?1")
	public Applicant findByApplicant_mobile_no(String applicant_mobile_no);
	
	@Query("SELECT a FROM Applicant a WHERE a.applicant_id=?1")
	public Applicant findByApplicant_id(long applicant_id);
	
	@Query("SELECT a FROM Applicant a WHERE a.dataentdt between ?1 and ?2")
	public Optional <List<Applicant>> findAllByDate(LocalDate dataentdt,LocalDate enddt );


}
//
//	@Query("SELECT a FROM Applicant a WHERE a.applicant_id =?1")
//    public Applicant findByApplicantId(long applicant_id);
//	
