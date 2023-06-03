package com.loan_followup.entity;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.Data;

@Data
@Entity
@Table(name = "EMI_details", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"Emi_no"}),})
public class EMI_details {
	 int Emi_no ;
	 int applicant_id; 
	 long emi_amount;
	 Date emi_payed_date;
	String  Emi_mode;
			String Cheque_no;
			Date Cheque_date;
			String Cheque_bank;
			  String NEFT_no;
			  Date NEFT_date;
			  String NEFT_bank;
			 String UPI_no; 
			 String upi_bank;
			 Date upi_date;
			public int getEmi_no() {
				return Emi_no;
			}
			public void setEmi_no(int emi_no) {
				Emi_no = emi_no;
			}
			public int getApplicant_id() {
				return applicant_id;
			}
			public void setApplicant_id(int applicant_id) {
				this.applicant_id = applicant_id;
			}
			public long getEmi_amount() {
				return emi_amount;
			}
			public void setEmi_amount(long emi_amount) {
				this.emi_amount = emi_amount;
			}
			public Date getEmi_payed_date() {
				return emi_payed_date;
			}
			public void setEmi_payed_date(Date emi_payed_date) {
				this.emi_payed_date = emi_payed_date;
			}
			public String getEmi_mode() {
				return Emi_mode;
			}
			public void setEmi_mode(String emi_mode) {
				Emi_mode = emi_mode;
			}
			public String getCheque_no() {
				return Cheque_no;
			}
			public void setCheque_no(String cheque_no) {
				Cheque_no = cheque_no;
			}
			public Date getCheque_date() {
				return Cheque_date;
			}
			public void setCheque_date(Date cheque_date) {
				Cheque_date = cheque_date;
			}
			public String getCheque_bank() {
				return Cheque_bank;
			}
			public void setCheque_bank(String cheque_bank) {
				Cheque_bank = cheque_bank;
			}
			public String getNEFT_no() {
				return NEFT_no;
			}
			public void setNEFT_no(String nEFT_no) {
				NEFT_no = nEFT_no;
			}
			public Date getNEFT_date() {
				return NEFT_date;
			}
			public void setNEFT_date(Date nEFT_date) {
				NEFT_date = nEFT_date;
			}
			public String getNEFT_bank() {
				return NEFT_bank;
			}
			public void setNEFT_bank(String nEFT_bank) {
				NEFT_bank = nEFT_bank;
			}
			public String getUPI_no() {
				return UPI_no;
			}
			public void setUPI_no(String uPI_no) {
				UPI_no = uPI_no;
			}
			public String getUpi_bank() {
				return upi_bank;
			}
			public void setUpi_bank(String upi_bank) {
				this.upi_bank = upi_bank;
			}
			public Date getUpi_date() {
				return upi_date;
			}
			public void setUpi_date(Date upi_date) {
				this.upi_date = upi_date;
			}
		

}
