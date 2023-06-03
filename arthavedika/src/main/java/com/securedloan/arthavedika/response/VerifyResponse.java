//Name: Ekta sharma
//Date:9-8-2022
package com.securedloan.arthavedika.response;

public class VerifyResponse {
	public String Message;
	public Boolean Status;
	public String getMessage() {
		return Message;
	}
	public void setMessage(String message) {
		Message = message;
	}
	public Boolean getStatus() {
		return Status;
	}
	public void setStatus(Boolean status) {
		Status = status;
	}
	public VerifyResponse(String message, Boolean status) {
		super();
		Message = message;
		Status = status;
	}

	
	
	
	
	

}
