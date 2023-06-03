package com.securedloan.arthavedika.service;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.securedloan.arthavedika.model.Applicant;
import com.securedloan.arthavedika.repo.ApplicantRepository;

@Service
@Transactional
public class ApplicantService {
	@Autowired
	private ApplicantRepository applRepo;

	public Applicant saveApplicant(Applicant applicant) throws Exception {
		return applRepo.save(applicant);
	}

	public Applicant findByApplicant_mobile_no(String applicant_mobile_no) throws Exception {
		return applRepo.findByApplicant_mobile_no(applicant_mobile_no);
	}


	public String concat(String str,byte[] bytes) {
		final StringBuilder sb = new StringBuilder();
		sb.append(str);
		for (byte b : bytes) {
			sb.append(b);
		}
	
		return sb.toString();
	}

	public Applicant findById(long applicant_id) throws Exception{
		// TODO Auto-generated method stub
		return applRepo.findByApplicant_id(applicant_id);
	}

	

}
