package com.loan_followup.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.Data;

@Data
@Entity
@Table(name = "applicant_details", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"applicant_id"}),})
public class Applicant_details {
@Id
int Applicant_id;
String Applicant_firstname; 
String applicant_middle_name;
String applicant_lastname;
String applicant_address_line1;
String applicant_address_line2;
String applicant_address_line3;
Long applicant_pin;
Long applicant_mobile_no;
String applicant_relation_manager_name ;
Long applicant_manager_moblieno;
public int getApplicant_id() {
	return Applicant_id;
}
public void setApplicant_id(int applicant_id) {
	Applicant_id = applicant_id;
}
public String getApplicant_firstname() {
	return Applicant_firstname;
}
public void setApplicant_firstname(String applicant_firstname) {
	Applicant_firstname = applicant_firstname;
}
public String getApplicant_middle_name() {
	return applicant_middle_name;
}
public void setApplicant_middle_name(String applicant_middle_name) {
	this.applicant_middle_name = applicant_middle_name;
}
public String getApplicant_lastname() {
	return applicant_lastname;
}
public void setApplicant_lastname(String applicant_lastname) {
	this.applicant_lastname = applicant_lastname;
}
public String getApplicant_address_line1() {
	return applicant_address_line1;
}
public void setApplicant_address_line1(String applicant_address_line1) {
	this.applicant_address_line1 = applicant_address_line1;
}
public String getApplicant_address_line2() {
	return applicant_address_line2;
}
public void setApplicant_address_line2(String applicant_address_line2) {
	this.applicant_address_line2 = applicant_address_line2;
}
public String getApplicant_address_line3() {
	return applicant_address_line3;
}
public void setApplicant_address_line3(String applicant_address_line3) {
	this.applicant_address_line3 = applicant_address_line3;
}
public Long getApplicant_pin() {
	return applicant_pin;
}
public void setApplicant_pin(Long applicant_pin) {
	this.applicant_pin = applicant_pin;
}
public Long getApplicant_mobile_no() {
	return applicant_mobile_no;
}
public void setApplicant_mobile_no(Long applicant_mobile_no) {
	this.applicant_mobile_no = applicant_mobile_no;
}
public String getApplicant_relation_manager_name() {
	return applicant_relation_manager_name;
}
public void setApplicant_relation_manager_name(String applicant_relation_manager_name) {
	this.applicant_relation_manager_name = applicant_relation_manager_name;
}
public Long getApplicant_manager_moblieno() {
	return applicant_manager_moblieno;
}
public void setApplicant_manager_moblieno(Long applicant_manager_moblieno) {
	this.applicant_manager_moblieno = applicant_manager_moblieno;
}
}
