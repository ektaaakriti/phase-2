//Name: Ekta sharma
//Date:9-8-2022
package com.securedloan.arthavedika.repo;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.securedloan.arthavedika.model.VerficationEntity;



public interface VerifyRepo extends JpaRepository<VerficationEntity,Long> {

	@Query("select u from VerficationEntity u where u.Applicant_id=?1 ")
	   VerficationEntity findApplicantByApplicantId(Long Applicant_id);
	@Modifying(clearAutomatically = false) 
	@Transactional
	@Query("update VerficationEntity u set u.Verified_By=?1, u.Verification_date=?2,u.NameStatus=?3, u.Name_remarks=?4 ,u.FathersNameStatus=?5,u.FathersNameRemarks=?6,u.DOBStatus=?7, u.DOBRemarks=?8, u.GenderStatus=?9, u.GenderRemarks=?10, u.MobileStatus=?11,u.MobileRemarks=?12,u.EmailStatus=?13, u.FamilyNumberStatus=?14,u.EmailRemarks=?15,u.FamilyNumberRemaks=?16,u.AddressLine1Status=?17,u.AddressLine1Remarks=?18,u.AddressLIne2Status=?19,u.AddressLine2Remarks=?20," 
			  +"u.AddressLine3Status=?21,u.AddressLine3Remarks=?22,u.CityStatus=?23,u.CityRemarks=?24,u.StateStatus=?25,u.StateRemarks=?26,u.PinStatus=?27,u.PinRemarks=?28," 
			  +"u.FamilyMemberStatus=?29,u.FamilyMemberRemarks=?30,u.EarningFamilyMemebrStatus=?31,u.EarningFamilyMemberRemarks=?32,u.ChildrenStatus=?33,u.ChildrenRemarks=?34," 
			  +"u.ChildrenStudyingStatus=?35,u.ChildrenStudyingRemarks=?36,u.educationExpenseChildstatus=?37,u.EducationExpenseChildRemarks=?38,u.SickMemberStatus=?39,u.SickMemberRemarks=?40," 
			  +"u.FamilyCoveredAyushmanStatus=?41,u.FamilyCoveredAyushmanRemarks=?42,u.EducationStatus=?43,u.EducationRemarks=?44,u.JobStatus=?45,u.JobRemarks=?46,u.TobaccoStatus=?47," 
			  +"u.Alcholic_smoking_chewingStatus=?48,u.TobaccoRemarks=?49,u.Alcholic_smoking_chewingRemarks=?50 where u.Applicant_id=?51 ")
	public void updateVerification(
	  String Verified_By,
	  Date Verification_date,
	  String NameStatus,
	  String Name_remarks,
	  String FathersNameStatus,
	  String FathersNameRemarks,
	  String DOBStatus,
	  String DOBRemarks,
	  String GenderStatus,
	  String GenderRemarks,
	  String MobileStatus,
	  String MobileRemarks,
	  String EmailStatus,
	  String FamilyNumberStatus,
	  String EmailRemarks,
	  String FamilyNumberRemaks,
	  String AddressLine1Status,
	  String AddressLine1Remarks,
	  String AddressLIne2Status,
	  String AddressLine2Remarks,
	  String AddressLine3Status,
	  String AddressLine3Remarks,
	  String CityStatus,
	  String CityRemarks,
	  String StateStatus,
	  String StateRemarks,
	  String PinStatus,
	  String PinRemarks,
	  String FamilyMemberStatus,
	  String FamilyMemberRemarks,
	  String EarningFamilyMemebrStatus,
	  String EarningFamilyMemberRemarks,
	  String ChildrenStatus,
	  String ChildrenRemarks,
	  String ChildrenStudyingStatus,
	  String ChildrenStudyingRemarks,
	  String educationExpenseChildstatus,
	  String EducationExpenseChildRemarks,
	  String SickMemberStatus,String SickMemberRemarks,
	  String FamilyCoveredAyushmanStatus,String FamilyCoveredAyushmanRemarks,
	  String EducationStatus,String EducationRemarks,
	  String JobStatus,String JobRemarks,
	  String TobaccoStatus,String Alcholic_smoking_chewingStatus,
	  String TobaccoRemarks,String Alcholic_smoking_chewingRemarks,Long Applicant_id);
	
} 

