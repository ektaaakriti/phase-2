package com.securedloan.arthavedika.payload;

public class VerificationPaylaod {
	public Long Applicant_id;
	public String Verified_By;
	public String Verification_date;
	public String NameStatus;
	public String Name_remarks;
	public String FathersNameStatus;
	public String FathersNameRemarks;
	public String DOBStatus;
	public String DOBRemarks;
	public String GenderStatus;
	public String GenderRemarks;
	public String MobileStatus;
	public String MobileRemarks;
	public String EmailStatus;
	public String FamilyNumberStatus;
	public String EmailRemarks;
	public String FamilyNumberRemaks;
	public String AddressLine1Status;
	public String AddressLine1Remarks;
	public String AddressLIne2Status;
	public String AddressLine2Remarks;
	public String AddressLine3Status;
	public String AddressLine3Remarks;
	public String CityStatus;
	public String CityRemarks;
	public String StateStatus;
	public String StateRemarks;
	public String PinStatus;
	public String PinRemarks;
	public String FamilyMemberStatus;
	public String FamilyMemberRemarks;
	public String EarningFamilyMemebrStatus;
	public String EarningFamilyMemberRemarks;
	public String ChildrenStatus;
	public String ChildrenRemarks;
	public String ChildrenStudyingStatus;
	public String ChildrenStudyingRemarks;
	public String educationExpenseChildstatus;
	public String EducationExpenseChildRemarks;
	public String SickMemberStatus;
	public String SickMemberRemarks;
	public String FamilyCoveredAyushmanStatus;
	public String FamilyCoveredAyushmanRemarks;
	public String EducationStatus;
	public String EducationRemarks;
	public String JobStatus;
	public String JobRemarks;
	public String TobaccoStatus;
	public String Alcholic_smoking_chewingStatus;
	public String Alcholic_smoking_chewingRemarks;
	public String TobaccoRemarks;
	
	@Override
	public String toString() {
		return "VerificationPaylaod [Applicant_id=" + Applicant_id + ", Verified_By=" + Verified_By
				+ ", Verification_date=" + Verification_date + ", NameStatus=" + NameStatus + ", Name_remarks="
				+ Name_remarks + ", FathersNameStatus=" + FathersNameStatus + ", FathersNameRemarks="
				+ FathersNameRemarks + ", DOBStatus=" + DOBStatus + ", DOBRemarks=" + DOBRemarks + ", GenderStatus="
				+ GenderStatus + ", GenderRemarks=" + GenderRemarks + ", MobileStatus=" + MobileStatus
				+ ", MobileRemarks=" + MobileRemarks + ", EmailStatus=" + EmailStatus + ", FamilyNumberStatus="
				+ FamilyNumberStatus + ", EmailRemarks=" + EmailRemarks + ", FamilyNumberRemaks=" + FamilyNumberRemaks
				+ ", AddressLine1Status=" + AddressLine1Status + ", AddressLine1Remarks=" + AddressLine1Remarks
				+ ", AddressLIne2Status=" + AddressLIne2Status + ", AddressLine2Remarks=" + AddressLine2Remarks
				+ ", AddressLine3Status=" + AddressLine3Status + ", AddressLine3Remarks=" + AddressLine3Remarks
				+ ", CityStatus=" + CityStatus + ", CityRemarks=" + CityRemarks + ", StateStatus=" + StateStatus
				+ ", StateRemarks=" + StateRemarks + ", PinStatus=" + PinStatus + ", PinRemarks=" + PinRemarks
				+ ", FamilyMemberStatus=" + FamilyMemberStatus + ", FamilyMemberRemarks=" + FamilyMemberRemarks
				+ ", EarningFamilyMemebrStatus=" + EarningFamilyMemebrStatus + ", EarningFamilyMemberRemarks="
				+ EarningFamilyMemberRemarks + ", ChildrenStatus=" + ChildrenStatus + ", ChildrenRemarks="
				+ ChildrenRemarks + ", ChildrenStudyingStatus=" + ChildrenStudyingStatus + ", ChildrenStudyingRemarks="
				+ ChildrenStudyingRemarks + ", educationExpenseChildstatus=" + educationExpenseChildstatus
				+ ", EducationExpenseChildRemarks=" + EducationExpenseChildRemarks + ", SickMemberStatus="
				+ SickMemberStatus + ", SickMemberRemarks=" + SickMemberRemarks + ", FamilyCoveredAyushmanStatus="
				+ FamilyCoveredAyushmanStatus + ", FamilyCoveredAyushmanRemarks=" + FamilyCoveredAyushmanRemarks
				+ ", EducationStatus=" + EducationStatus + ", EducationRemarks=" + EducationRemarks + ", JobStatus="
				+ JobStatus + ", JobRemarks=" + JobRemarks + ", TobaccoStatus=" + TobaccoStatus
				+ ", Alcholic_smoking_chewingStatus=" + Alcholic_smoking_chewingStatus
				+ ", Alcholic_smoking_chewingRemarks=" + Alcholic_smoking_chewingRemarks + ", TobaccoRemarks="
				+ TobaccoRemarks + "]";
	}
	public VerificationPaylaod(Long applicant_id, String verified_By, String verification_date, String nameStatus,
			String name_remarks, String fathersNameStatus, String fathersNameRemarks, String dOBStatus,
			String dOBRemarks, String genderStatus, String genderRemarks, String mobileStatus, String mobileRemarks,
			String emailStatus, String familyNumberStatus, String emailRemarks, String familyNumberRemaks,
			String addressLine1Status, String addressLine1Remarks, String addressLIne2Status,
			String addressLine2Remarks, String addressLine3Status, String addressLine3Remarks, String cityStatus,
			String cityRemarks, String stateStatus, String stateRemarks, String pinStatus, String pinRemarks,
			String familyMemberStatus, String familyMemberRemarks, String earningFamilyMemebrStatus,
			String earningFamilyMemberRemarks, String childrenStatus, String childrenRemarks,
			String childrenStudyingStatus, String childrenStudyingRemarks, String educationExpenseChildstatus,
			String educationExpenseChildRemarks, String sickMemberStatus, String sickMemberRemarks,
			String familyCoveredAyushmanStatus, String familyCoveredAyushmanRemarks, String educationStatus,
			String educationRemarks, String jobStatus, String jobRemarks, String tobaccoStatus,
			String alcholic_smoking_chewingStatus, String alcholic_smoking_chewingRemarks, String tobaccoRemarks) {
		super();
		Applicant_id = applicant_id;
		Verified_By = verified_By;
		Verification_date = verification_date;
		NameStatus = nameStatus;
		Name_remarks = name_remarks;
		FathersNameStatus = fathersNameStatus;
		FathersNameRemarks = fathersNameRemarks;
		DOBStatus = dOBStatus;
		DOBRemarks = dOBRemarks;
		GenderStatus = genderStatus;
		GenderRemarks = genderRemarks;
		MobileStatus = mobileStatus;
		MobileRemarks = mobileRemarks;
		EmailStatus = emailStatus;
		FamilyNumberStatus = familyNumberStatus;
		EmailRemarks = emailRemarks;
		FamilyNumberRemaks = familyNumberRemaks;
		AddressLine1Status = addressLine1Status;
		AddressLine1Remarks = addressLine1Remarks;
		AddressLIne2Status = addressLIne2Status;
		AddressLine2Remarks = addressLine2Remarks;
		AddressLine3Status = addressLine3Status;
		AddressLine3Remarks = addressLine3Remarks;
		CityStatus = cityStatus;
		CityRemarks = cityRemarks;
		StateStatus = stateStatus;
		StateRemarks = stateRemarks;
		PinStatus = pinStatus;
		PinRemarks = pinRemarks;
		FamilyMemberStatus = familyMemberStatus;
		FamilyMemberRemarks = familyMemberRemarks;
		EarningFamilyMemebrStatus = earningFamilyMemebrStatus;
		EarningFamilyMemberRemarks = earningFamilyMemberRemarks;
		ChildrenStatus = childrenStatus;
		ChildrenRemarks = childrenRemarks;
		ChildrenStudyingStatus = childrenStudyingStatus;
		ChildrenStudyingRemarks = childrenStudyingRemarks;
		this.educationExpenseChildstatus = educationExpenseChildstatus;
		EducationExpenseChildRemarks = educationExpenseChildRemarks;
		SickMemberStatus = sickMemberStatus;
		SickMemberRemarks = sickMemberRemarks;
		FamilyCoveredAyushmanStatus = familyCoveredAyushmanStatus;
		FamilyCoveredAyushmanRemarks = familyCoveredAyushmanRemarks;
		EducationStatus = educationStatus;
		EducationRemarks = educationRemarks;
		JobStatus = jobStatus;
		JobRemarks = jobRemarks;
		TobaccoStatus = tobaccoStatus;
		Alcholic_smoking_chewingStatus = alcholic_smoking_chewingStatus;
		Alcholic_smoking_chewingRemarks = alcholic_smoking_chewingRemarks;
		TobaccoRemarks = tobaccoRemarks;
	}
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
	public String getVerification_date() {
		return Verification_date;
	}
	public void setVerification_date(String verification_date) {
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



