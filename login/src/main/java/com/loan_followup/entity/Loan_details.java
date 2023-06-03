package com.loan_followup.entity;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.Data;

@Data
@Entity
@Table(name = "Loan_details", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"Loan_id"}),})
public class Loan_details {
	int Loan_id;
	int applicant_id;
	Long Loan_amount;
	Date Loan_date ;
	Date loan_maturity_date;
	long Outstanding_loan_amount;
	Float Rate_of_interest;
	Date next_payment_date;
	int Emi_frequency;
	public int getLoan_id() {
		return Loan_id;
	}
	public void setLoan_id(int loan_id) {
		Loan_id = loan_id;
	}
	public int getApplicant_id() {
		return applicant_id;
	}
	public void setApplicant_id(int applicant_id) {
		this.applicant_id = applicant_id;
	}
	public Long getLoan_amount() {
		return Loan_amount;
	}
	public void setLoan_amount(Long loan_amount) {
		Loan_amount = loan_amount;
	}
	public Date getLoan_date() {
		return Loan_date;
	}
	public void setLoan_date(Date loan_date) {
		Loan_date = loan_date;
	}
	public Date getLoan_maturity_date() {
		return loan_maturity_date;
	}
	public void setLoan_maturity_date(Date loan_maturity_date) {
		this.loan_maturity_date = loan_maturity_date;
	}
	public long getOutstanding_loan_amount() {
		return Outstanding_loan_amount;
	}
	public void setOutstanding_loan_amount(long outstanding_loan_amount) {
		Outstanding_loan_amount = outstanding_loan_amount;
	}
	public Float getRate_of_interest() {
		return Rate_of_interest;
	}
	public void setRate_of_interest(Float rate_of_interest) {
		Rate_of_interest = rate_of_interest;
	}
	public Date getNext_payment_date() {
		return next_payment_date;
	}
	public void setNext_payment_date(Date next_payment_date) {
		this.next_payment_date = next_payment_date;
	}
	public int getEmi_frequency() {
		return Emi_frequency;
	}
	public void setEmi_frequency(int emi_frequency) {
		Emi_frequency = emi_frequency;
	}
			 
			
}
