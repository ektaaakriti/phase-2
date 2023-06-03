//Name:Ekta Sharma
//Date:9-8-2022
package com.securedloan.arthavedika.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.Data;

@Data
@Entity
@Table(name = "applicant_verification", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"Applicant_id"}),})
        
public class VerficationEntity {

	  @Id
	  	private Long Applicant_id;
		private String Verified_By;
		private Date Verification_date;
		private String NameStatus;
		private String Name_remarks;
		private String FathersNameStatus;
		private String FathersNameRemarks;
		private String DOBStatus;
		private String DOBRemarks;
		private String GenderStatus;
		private String GenderRemarks;
		private String MobileStatus;
		private String MobileRemarks;
		private String EmailStatus;
		private String FamilyNumberStatus;
		private String EmailRemarks;
		private String FamilyNumberRemaks;
		private String AddressLine1Status;
		private String AddressLine1Remarks;
		private String AddressLIne2Status;
		private String AddressLine2Remarks;
		private String AddressLine3Status;
		private String AddressLine3Remarks;
		private String CityStatus;
		private String CityRemarks;
		private String StateStatus;
		private String StateRemarks;
		private String PinStatus;
		private String PinRemarks;
		private String FamilyMemberStatus;
		private String FamilyMemberRemarks;
		private String EarningFamilyMemebrStatus;
		private String EarningFamilyMemberRemarks;
		private String ChildrenStatus;
		private String ChildrenRemarks;
		private String ChildrenStudyingStatus;
		private String ChildrenStudyingRemarks;
		private String educationExpenseChildstatus;
		private String EducationExpenseChildRemarks;
		private String SickMemberStatus;
		private String SickMemberRemarks;
		private String FamilyCoveredAyushmanStatus;
		private String FamilyCoveredAyushmanRemarks;
		private String EducationStatus;
		private String EducationRemarks;
		private String JobStatus;
		private String JobRemarks;
		private String TobaccoStatus;
		private String Alcholic_smoking_chewingStatus;
		private String TobaccoRemarks;
		private String Alcholic_smoking_chewingRemarks;
		public String getAlcholic_smoking_chewingRemarks() {
			return Alcholic_smoking_chewingRemarks;
		}
		public void setAlcholic_smoking_chewingRemarks(String alcholic_smoking_chewingRemarks) {
			Alcholic_smoking_chewingRemarks = alcholic_smoking_chewingRemarks;
		}
		public Long getApplicant_id() {
			return Applicant_id;
		}
		public void setApplicant_id(Long applicant_id) {
			Applicant_id = applicant_id;
		}
		public String getVerified_By() {
			return Verified_By;
		}
		public void setVerified_By(String verified_By) {
			Verified_By = verified_By;
		}
		public Date getVerification_date() {
			return Verification_date;
		}
		public void setVerification_date(Date verification_date) {
			Verification_date = verification_date;
		}
		public String getNameStatus() {
			return NameStatus;
		}
		public void setNameStatus(String nameStatus) {
			NameStatus = nameStatus;
		}
		public String getName_remarks() {
			return Name_remarks;
		}
		public void setName_remarks(String name_remarks) {
			Name_remarks = name_remarks;
		}
		public String getFathersNameStatus() {
			return FathersNameStatus;
		}
		public void setFathersNameStatus(String fathersNameStatus) {
			FathersNameStatus = fathersNameStatus;
		}
		public String getFathersNameRemarks() {
			return FathersNameRemarks;
		}
		public void setFathersNameRemarks(String fathersNameRemarks) {
			FathersNameRemarks = fathersNameRemarks;
		}
		public String getDOBStatus() {
			return DOBStatus;
		}
		public void setDOBStatus(String dOBStatus) {
			DOBStatus = dOBStatus;
		}
		public String getDOBRemarks() {
			return DOBRemarks;
		}
		public void setDOBRemarks(String dOBRemarks) {
			DOBRemarks = dOBRemarks;
		}
		public String getGenderStatus() {
			return GenderStatus;
		}
		public void setGenderStatus(String genderStatus) {
			GenderStatus = genderStatus;
		}
		public String getGenderRemarks() {
			return GenderRemarks;
		}
		public void setGenderRemarks(String genderRemarks) {
			GenderRemarks = genderRemarks;
		}
		public String getMobileStatus() {
			return MobileStatus;
		}
		public void setMobileStatus(String mobileStatus) {
			MobileStatus = mobileStatus;
		}
		public String getMobileRemarks() {
			return MobileRemarks;
		}
		public void setMobileRemarks(String mobileRemarks) {
			MobileRemarks = mobileRemarks;
		}
		public String getEmailStatus() {
			return EmailStatus;
		}
		public void setEmailStatus(String emailStatus) {
			EmailStatus = emailStatus;
		}
		public String getFamilyNumberStatus() {
			return FamilyNumberStatus;
		}
		public void setFamilyNumberStatus(String familyNumberStatus) {
			FamilyNumberStatus = familyNumberStatus;
		}
		public String getEmailRemarks() {
			return EmailRemarks;
		}
		public void setEmailRemarks(String emailRemarks) {
			EmailRemarks = emailRemarks;
		}
		public String getFamilyNumberRemaks() {
			return FamilyNumberRemaks;
		}
		public void setFamilyNumberRemaks(String familyNumberRemaks) {
			FamilyNumberRemaks = familyNumberRemaks;
		}
		public String getAddressLine1Status() {
			return AddressLine1Status;
		}
		public void setAddressLine1Status(String addressLine1Status) {
			AddressLine1Status = addressLine1Status;
		}
		public String getAddressLine1Remarks() {
			return AddressLine1Remarks;
		}
		public void setAddressLine1Remarks(String addressLine1Remarks) {
			AddressLine1Remarks = addressLine1Remarks;
		}
		public String getAddressLIne2Status() {
			return AddressLIne2Status;
		}
		public void setAddressLIne2Status(String addressLIne2Status) {
			AddressLIne2Status = addressLIne2Status;
		}
		public String getAddressLine2Remarks() {
			return AddressLine2Remarks;
		}
		public void setAddressLine2Remarks(String addressLine2Remarks) {
			AddressLine2Remarks = addressLine2Remarks;
		}
		public String getAddressLine3Status() {
			return AddressLine3Status;
		}
		public void setAddressLine3Status(String addressLine3Status) {
			AddressLine3Status = addressLine3Status;
		}
		public String getAddressLine3Remarks() {
			return AddressLine3Remarks;
		}
		public void setAddressLine3Remarks(String addressLine3Remarks) {
			AddressLine3Remarks = addressLine3Remarks;
		}
		public String getCityStatus() {
			return CityStatus;
		}
		public void setCityStatus(String cityStatus) {
			CityStatus = cityStatus;
		}
		public String getCityRemarks() {
			return CityRemarks;
		}
		public void setCityRemarks(String cityRemarks) {
			CityRemarks = cityRemarks;
		}
		public String getStateStatus() {
			return StateStatus;
		}
		public void setStateStatus(String stateStatus) {
			StateStatus = stateStatus;
		}
		public String getStateRemarks() {
			return StateRemarks;
		}
		public void setStateRemarks(String stateRemarks) {
			StateRemarks = stateRemarks;
		}
		public String getPinStatus() {
			return PinStatus;
		}
		public void setPinStatus(String pinStatus) {
			PinStatus = pinStatus;
		}
		public String getPinRemarks() {
			return PinRemarks;
		}
		public void setPinRemarks(String pinRemarks) {
			PinRemarks = pinRemarks;
		}
		public String getFamilyMemberStatus() {
			return FamilyMemberStatus;
		}
		public void setFamilyMemberStatus(String familyMemberStatus) {
			FamilyMemberStatus = familyMemberStatus;
		}
		public String getFamilyMemberRemarks() {
			return FamilyMemberRemarks;
		}
		public void setFamilyMemberRemarks(String familyMemberRemarks) {
			FamilyMemberRemarks = familyMemberRemarks;
		}
		public String getEarningFamilyMemebrStatus() {
			return EarningFamilyMemebrStatus;
		}
		public void setEarningFamilyMemebrStatus(String earningFamilyMemebrStatus) {
			EarningFamilyMemebrStatus = earningFamilyMemebrStatus;
		}
		public String getEarningFamilyMemberRemarks() {
			return EarningFamilyMemberRemarks;
		}
		public void setEarningFamilyMemberRemarks(String earningFamilyMemberRemarks) {
			EarningFamilyMemberRemarks = earningFamilyMemberRemarks;
		}
		public String getChildrenStatus() {
			return ChildrenStatus;
		}
		public void setChildrenStatus(String childrenStatus) {
			ChildrenStatus = childrenStatus;
		}
		public String getChildrenRemarks() {
			return ChildrenRemarks;
		}
		public void setChildrenRemarks(String childrenRemarks) {
			ChildrenRemarks = childrenRemarks;
		}
		public String getChildrenStudyingStatus() {
			return ChildrenStudyingStatus;
		}
		public void setChildrenStudyingStatus(String childrenStudyingStatus) {
			ChildrenStudyingStatus = childrenStudyingStatus;
		}
		public String getChildrenStudyingRemarks() {
			return ChildrenStudyingRemarks;
		}
		public void setChildrenStudyingRemarks(String childrenStudyingRemarks) {
			ChildrenStudyingRemarks = childrenStudyingRemarks;
		}
		public String getEducationExpenseChildstatus() {
			return educationExpenseChildstatus;
		}
		public void setEducationExpenseChildstatus(String educationExpenseChildstatus) {
			this.educationExpenseChildstatus = educationExpenseChildstatus;
		}
		public String getEducationExpenseChildRemarks() {
			return EducationExpenseChildRemarks;
		}
		public void setEducationExpenseChildRemarks(String educationExpenseChildRemarks) {
			EducationExpenseChildRemarks = educationExpenseChildRemarks;
		}
		public String getSickMemberStatus() {
			return SickMemberStatus;
		}
		public void setSickMemberStatus(String sickMemberStatus) {
			SickMemberStatus = sickMemberStatus;
		}
		public String getSickMemberRemarks() {
			return SickMemberRemarks;
		}
		public void setSickMemberRemarks(String sickMemberRemarks) {
			SickMemberRemarks = sickMemberRemarks;
		}
		public String getFamilyCoveredAyushmanStatus() {
			return FamilyCoveredAyushmanStatus;
		}
		public void setFamilyCoveredAyushmanStatus(String familyCoveredAyushmanStatus) {
			FamilyCoveredAyushmanStatus = familyCoveredAyushmanStatus;
		}
		public String getFamilyCoveredAyushmanRemarks() {
			return FamilyCoveredAyushmanRemarks;
		}
		public void setFamilyCoveredAyushmanRemarks(String familyCoveredAyushmanRemarks) {
			FamilyCoveredAyushmanRemarks = familyCoveredAyushmanRemarks;
		}
		public String getEducationStatus() {
			return EducationStatus;
		}
		public void setEducationStatus(String educationStatus) {
			EducationStatus = educationStatus;
		}
		public String getEducationRemarks() {
			return EducationRemarks;
		}
		public void setEducationRemarks(String educationRemarks) {
			EducationRemarks = educationRemarks;
		}
		public String getJobStatus() {
			return JobStatus;
		}
		public void setJobStatus(String jobStatus) {
			JobStatus = jobStatus;
		}
		public String getJobRemarks() {
			return JobRemarks;
		}
		public void setJobRemarks(String jobRemarks) {
			JobRemarks = jobRemarks;
		}
		public String getTobaccoStatus() {
			return TobaccoStatus;
		}
		public void setTobaccoStatus(String tobaccoStatus) {
			TobaccoStatus = tobaccoStatus;
		}
		public String getAlcholic_smoking_chewingStatus() {
			return Alcholic_smoking_chewingStatus;
		}
		public void setAlcholic_smoking_chewingStatus(String alcholic_smoking_chewingStatus) {
			Alcholic_smoking_chewingStatus = alcholic_smoking_chewingStatus;
		}
		public String getTobaccoRemarks() {
			return TobaccoRemarks;
		}
		public void setTobaccoRemarks(String tobaccoRemarks) {
			TobaccoRemarks = tobaccoRemarks;
		}
		
}
