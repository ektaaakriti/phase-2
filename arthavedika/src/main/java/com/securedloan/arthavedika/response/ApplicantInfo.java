package com.securedloan.arthavedika.response;

import com.securedloan.arthavedika.model.Applicant;

public class ApplicantInfo {
	private String message;
	private boolean status;
	private Applicant applicant;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public Applicant getApplicant() {
		return applicant;
	}
	public void setApplicant(Applicant applicant) {
		this.applicant = applicant;
	}
	public ApplicantInfo(String message, boolean status, Applicant applicant) {
		super();
		this.message = message;
		this.status = status;
		this.applicant = applicant;
	}
	public ApplicantInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

}

