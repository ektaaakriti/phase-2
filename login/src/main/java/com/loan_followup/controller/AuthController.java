//Purpose:This is controller class which defines all the API.
//Developed by:Author Arthvedika dev team
//Date:26/01/2022
package com.loan_followup.controller;

import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;

import java.util.List;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
/*import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.authorization.AuthenticatedAuthorizationManager;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;*/
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.loan_followup.entity.Applicant_details;
import com.loan_followup.repository.Applicant_details_repo;
import com.loan_followup.repository.EMI_details_repo;
import com.loan_followup.repository.Loan_details_repo;
import com.loan_followup.request.LoanDetails_request;
import com.loan_followup.response.LoanDetailsResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;




@CrossOrigin ()
@RestController
@Service
@RequestMapping("/api/loanFollowup")
public class AuthController {
	public static Logger log = LogManager.getLogger(AuthController.class.getName());

    @Autowired
    private Applicant_details_repo Apprepo;
    @Autowired
    private Loan_details_repo Loanrepo;
    @Autowired
    private EMI_details_repo EMIrepo;
    @PostMapping(
            value = "/LoanDetails",
            consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE})
 
    public ResponseEntity<LoanDetailsResponse> authenticateUser(@RequestBody  LoanDetails_request LoanDetails_request){
	   List Details = null;
    	try {
    		return ResponseEntity.status(HttpStatus.OK)
					.body(new LoanDetailsResponse("Loan details",Boolean.TRUE,Details));
	   }
	   catch(Exception e) {
	    	  System.out.println("error in login api"+e);
	    	  log.info("error"+e);
	    
	    	  return ResponseEntity.status(HttpStatus.BAD_REQUEST)
						.body(new LoanDetailsResponse(("Error in loan details"),Boolean.FALSE,Details));
	      }
    }
}








