package com.loan_followup.response;

import java.util.List;

public class LoanDetailsResponse {
public String message;
public Boolean Status;
public List Details;
public LoanDetailsResponse(String message, Boolean status, List details) {
	super();
	this.message = message;
	Status = status;
	Details = details;
}
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
public Boolean getStatus() {
	return Status;
}
public void setStatus(Boolean status) {
	Status = status;
}
public List getDetails() {
	return Details;
}
public void setDetails(List details) {
	Details = details;
}
}
