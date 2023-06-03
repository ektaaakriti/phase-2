package com.securedloan.arthavedika.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.codehaus.jettison.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.securedloan.arthavedika.model.Applicant;
import com.securedloan.arthavedika.model.DocEkyc;
import com.securedloan.arthavedika.model.EKYC;
//import com.securedloan.arthavedika.model.PreResult;
//import com.securedloan.arthavedika.model.Predict;
import com.securedloan.arthavedika.model.Res;
import com.securedloan.arthavedika.model.User;
import com.securedloan.arthavedika.model.VerficationEntity;
import com.securedloan.arthavedika.payload.VerificationPaylaod;
import com.securedloan.arthavedika.repo.VerifyRepo;
import com.securedloan.arthavedika.response.ApplicantInfo;
//import com.securedloan.arthavedika.response.Prediction;
import com.securedloan.arthavedika.response.Response;
import com.securedloan.arthavedika.response.ResponseMessage;
import com.securedloan.arthavedika.response.VerifyResponse;
import com.securedloan.arthavedika.service.ApplicantService;
import com.securedloan.arthavedika.service.EkycFileStorageService;
//import com.securedloan.arthavedika.service.PredictService;

@CrossOrigin()
@RestController
@RequestMapping("applicant")
public class ApplicantController {
	private final Logger LOGGER = LoggerFactory.getLogger(ApplicantController.class);

	@PersistenceContext
	private EntityManager entitymanager;
	@Autowired
	private EkycFileStorageService storageService;
	@Autowired
	private ApplicantService applicantService;
//	@Autowired
//	private PredictService pdService;
	 @Autowired
	    private VerifyRepo verifyrepo;
	
	
	@Value("${mandatory}")
	private String mandatoryField;
	@Value("${alreadyRegister}")
	private String Alreadyregistered;
	@Value("${registerSuccess}")
	private String registerSuccess;
	@Value("${success}")
	private String Success;

	@RequestMapping(value = { "/register/v1" }, method = RequestMethod.POST, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	@ResponseStatus(value = HttpStatus.OK)
	public ResponseEntity<Response> registerApplicant(@RequestBody Applicant newApplicant) {
		LOGGER.info("Register api has been called !!! Start Of Method registerApplicant");
		try {
			if (newApplicant.getUserIdStr() == null) {
				// return "User Id is Mandatory, Please Provide User Id";
				return ResponseEntity.status(HttpStatus.OK)
						.body(new Response(mandatoryField, Boolean.FALSE, new Applicant()));
			}
			Applicant applicants = applicantService.findByApplicant_mobile_no(newApplicant.getApplicant_mobile_no());
			if (applicants == null) {
				User user = new User();
				user.setUser_id(newApplicant.getUserIdStr());
				newApplicant.setUser(user);
				newApplicant.setDataentdt(LocalDate.now());
				newApplicant.setDatamoddt(null);
				Applicant applicant = applicantService.saveApplicant(newApplicant);
				// return "Applicant Registered Successfully";
				LOGGER.info("End Of Method registerApplicant");
				// return ResponseEntity.status(HttpStatus.OK).body(registerSuccess+applicant);
				return ResponseEntity.status(HttpStatus.OK)
						.body(new Response(registerSuccess, Boolean.TRUE, applicant));
			}
			else if(applicants !=null) {	
				if (applicants.getApplicant_id()==newApplicant.getApplicant_id()) {
					Applicant applicant = applicantService.saveApplicant(newApplicant);
					return ResponseEntity.status(HttpStatus.OK)
							.body(new Response("Data Saved", Boolean.TRUE, applicant));
				}
				}return ResponseEntity.status(HttpStatus.OK)
						.body(new Response("Already Registered", Boolean.FALSE,new Applicant()));
			
		} catch (Exception e) {
			LOGGER.error("Error While Registering the Applicant" + e.getMessage());
			return ResponseEntity.badRequest().body(new Response(e.getMessage(), Boolean.FALSE, new Applicant()));
		}
	}

	@RequestMapping(value = { "/register/v1" }, method = RequestMethod.PUT, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	@ResponseStatus(value = HttpStatus.OK)
	public ResponseEntity<Response> updateApplicant(@RequestBody Applicant newApplicant) {
		LOGGER.info("Register api has been called !!! Start Of Method registerApplicant");
		try {
			Applicant applicants = applicantService.findById(newApplicant.getApplicant_id());
			if (applicants != null) {
			newApplicant.setDatamoddt(LocalDate.now());
			Applicant applicant = applicantService.saveApplicant(newApplicant);
			LOGGER.info("End Of Method updateApplicant");
			return ResponseEntity.status(HttpStatus.OK)
					.body(new Response("Data Saved", Boolean.TRUE, applicant));
			}return ResponseEntity.status(HttpStatus.OK)
					.body(new Response("UNABLE TO UPDATE", Boolean.FALSE,new Applicant()));
		}
		catch(Exception e){
			LOGGER.error("Error While Updating the Applicant" + e.getMessage());
			return ResponseEntity.badRequest().body(new Response(e.getMessage(), Boolean.FALSE, new Applicant()));
			
		}
	}
	
	@RequestMapping(value = { "/getapplicant/v1" }, method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	@ResponseStatus(value = HttpStatus.OK)
	public ResponseEntity<ApplicantInfo> getApplicant(@RequestBody Applicant newApplicant) {
		LOGGER.info("getApplicant api has been called !!! Start Of Method getApplicant");
		try {
			Applicant applicants = applicantService.findById(newApplicant.getApplicant_id());
			if (applicants !=null) {
				return ResponseEntity.status(HttpStatus.OK)
						.body(new ApplicantInfo("Retrive Success", Boolean.TRUE, applicants));
			}else {
				return ResponseEntity.status(HttpStatus.OK)
						.body(new ApplicantInfo("No data with such applicant id", Boolean.FALSE, applicants));
			}
			}catch(Exception e) {
				LOGGER.error("Error While retrive the Applicant" + e.getMessage());
				return ResponseEntity.badRequest().body(new ApplicantInfo(e.getMessage(), Boolean.FALSE, new Applicant()));
				
			}
			
	}
	
	

	@RequestMapping(value = { "/eKYC/v1" }, method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
	@ResponseStatus(value = HttpStatus.OK)
	public ResponseEntity<Response> eKYC(@RequestParam("applicant_id") Applicant newApplicant) {
		LOGGER.info("Ekyc api has been called !!! Start Of Method eKYC");

		List<EKYC> response = new ArrayList<>();
		try {
			List<Object[]> docs = entitymanager.createNativeQuery(
					"SELECT f.data,f.doc_name,f.document,a.applicant_date_of_BIRTH as dob,a.APPLICANT_ID,a.APPLICANT_EMAIL_ID as email,a.APPLICANT_MOBILE_NO as mobile,a.APPLICANT_FIRSTNAME as firstname,a.APPLICANT_FATHER_FIRSTNAME as fathersfirstname,a.GENDER, a.APPLICANT_FATHER_MIDDLE_NAME as fathersmiddlename,a.APPLICANT_FATHER_LASTNAME as fatherslastname,a.APPLICANT_MIDDLE_NAME as middlename,a.APPLICANT_LASTNAME as lastname  from  arthavedika_v1.applicant_table a join arthavedika_v1.files f on a.applicant_id = f.applicant_id where a.applicant_id="
							+ newApplicant.getApplicant_id())
					.getResultList();
			if (docs.size() != 0) {
				for (Object d : docs) {
					EKYC ekyc = new EKYC();
					Object[] obj = (Object[]) d;
					String base64Image = Base64.getEncoder().encodeToString((byte[]) obj[0]);
					ekyc.setPhoto("data:image/jpeg;base64," + base64Image);
					ekyc.setPhotos((byte[]) obj[0]);
					ekyc.setDocName((String) obj[1]);
					ekyc.setDoc((String) obj[2]);
					ekyc.setDob((Date) obj[3]);

					long app_id = Long.parseLong(obj[4].toString());
					ekyc.setApplicant_id(app_id);
					// ekyc.setApplicant_id((long) obj[3]);
					ekyc.setEmail((String) obj[5]);
					ekyc.setMobile((String) obj[6]);
					ekyc.setApplicant_name((String) obj[7]);
					ekyc.setFathersName((String) obj[8]);
					ekyc.setGender((String) obj[9]);
					ekyc.setFathersMiddleName((String) obj[10]);
					ekyc.setFathersLastName((String) obj[11]);
					ekyc.setApplicant_middle_name((String) obj[12]);
					ekyc.setApplicant_lastname((String) obj[13]);
					response.add(ekyc);
				}
			}
		} catch (Exception e) {
			LOGGER.error("Error While fetching :" + e.getMessage());
			return ResponseEntity.badRequest().body(new Response(e.getMessage(), Boolean.FALSE, new ArrayList<>()));
		}
		// return response;
		return ResponseEntity.status(HttpStatus.OK).body(new Response(Success, Boolean.TRUE, response));
	}

	// @PostMapping("/upload/ekyc/v1")
	@RequestMapping(value = { "/upload/ekyc/v1" }, method = RequestMethod.POST, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	@ResponseStatus(value = HttpStatus.OK)
	public ResponseEntity<ResponseMessage> uploadFile(@RequestParam("file") MultipartFile file,
			@RequestParam("applicant_id") Applicant applicant) {
		LOGGER.info("Upload ekyc api has been called !!! Start Of Method uploadFile");
		String message = "";
		try {
			storageService.store(file, applicant);
			message = "Uploaded the file successfully: " + file.getOriginalFilename();
			LOGGER.info("End Of Method uploadFile");
			return ResponseEntity.status(HttpStatus.OK).body(new ResponseMessage(message));
		} catch (Exception e) {
			message = "Could not upload the file: " + file.getOriginalFilename() + "!";
			LOGGER.error("Error While Uploading the File" + e.getMessage());
			return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(new ResponseMessage(message));
		}
	}

	@RequestMapping(value = { "/eKYC/retrieve/v1" }, method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	@ResponseStatus(value = HttpStatus.OK)
	public ResponseEntity<Response> eKYCRetrieve(@RequestParam("applicant_id") Applicant newApplicant) {
		LOGGER.info("Retrieve ekyc api has been called !!! Start Of Method EkycRetrieve");
		Boolean Status = false;
		List<DocEkyc> DocResponse = new ArrayList<>();
		try {
			List<Object[]> docs = entitymanager.createNativeQuery(
					"SELECT f.data,f.applicant_id from arthavedika_v1.ekycfile f where f.applicant_id= "
							+ newApplicant.getApplicant_id())
					.getResultList();

			List<String> images = new ArrayList<>();

			if (docs.size() != 0) {
				System.out.println(docs.size());
				for (Object d : docs) {
					DocEkyc ekyc = new DocEkyc();
					Object[] obj = (Object[]) d;

					String base64Image = Base64.getEncoder().encodeToString((byte[]) obj[0]);

					ekyc.setPhotoString("data:image/jpeg;base64," + base64Image);
					images.add("data:image/jpeg;base64," + base64Image);
					long a_id = Long.parseLong(obj[1].toString());
					ekyc.setApplicant_id(a_id);
					DocResponse.add(ekyc);
					LOGGER.info("End Of Method EkycRetrieve");
				}
				Status = authImage(images);
				System.out.println(images);

			}
		} catch (Exception e) {
			LOGGER.error("Error While Retrieve" + e.getMessage());
			return ResponseEntity.badRequest().body(new Response(e.getMessage(), Boolean.FALSE, Status));
		}
		return ResponseEntity.status(HttpStatus.OK).body(new Response(Success, Boolean.TRUE, Status));
	}

//	@RequestMapping(value = { "/prediction/v1" }, method = RequestMethod.POST, produces = {
//			MediaType.APPLICATION_JSON_VALUE })
//	@ResponseStatus(value = HttpStatus.OK)
//	public ResponseEntity<Prediction> psychoPredict(@Valid @RequestBody Predict predict) {
//		LOGGER.info("prediction api has been called !!! Start Of Method psychoPredict");
//		try {
//			
//			predict.getApplicant_id();
//			predict.getQ1_ans();
//			predict.getQ2_ans();
//			predict.getQ3_ans();
//			predict.getQ4_ans();
//			predict.getQ5_ans();
//			pdService.save(predict);
//			
//			PreResult res = pdService.findByAnswr(predict.getQ1_ans(), predict.getQ2_ans(), predict.getQ3_ans(),
//					predict.getQ4_ans(), predict.getQ5_ans());
//		
//			LOGGER.info("End Of Method psychoPredict");
//			return ResponseEntity.status(HttpStatus.OK)
//					.body(new Prediction(res.getPrediction(),"RESULT RETURNED !!", Boolean.TRUE));
//		} catch (Exception e) {
//			LOGGER.error("Error While Prediction" + e.getMessage());
//			return ResponseEntity.badRequest().body(new Prediction(null, e.getMessage(), Boolean.FALSE));
//		}
//	}

	public Boolean authImage(List<String> image) throws Exception {
		RestTemplate restTemplate = new RestTemplate();
		JSONObject requestBody = new JSONObject();
		requestBody.put("images", image);
		String url = "http://122.160.96.98:1300/start";
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<String> entity = new HttpEntity<>(requestBody.toString(), headers);
		ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.POST, entity, String.class);
		if (response.getStatusCode() == HttpStatus.OK) {
			String responseBody = response.getBody();
			ObjectMapper mapper = new ObjectMapper();
			Res describeAccessResponse = mapper.readValue(responseBody, Res.class);
			return describeAccessResponse.isFace_result();
		} else {
			throw new Exception("API Response Failed !!");
		}
	}
	 @PostMapping(path = "/verification/v1")
	    public ResponseEntity<VerifyResponse> verifydetails(@RequestBody VerificationPaylaod verPayload)  {
	    
	    	try {
	    		VerficationEntity en=new VerficationEntity();
	    		Date date=new Date();
	    		VerficationEntity verification=verifyrepo.findApplicantByApplicantId(verPayload.Applicant_id);
	    		
	    		if (verification==null) {
	    	en.setApplicant_id(verPayload.getApplicant_id());
	    	en.setVerified_By(verPayload.getVerified_By());
	    	 
	    	en.setVerification_date(date);
	    	en.setNameStatus(verPayload.getNameStatus());
	    	en.setName_remarks(verPayload.getName_remarks());
	    	en.setFathersNameStatus(verPayload.getFathersNameStatus());
	    	en.setFathersNameRemarks(verPayload.getFathersNameRemarks());
	    	en.setDOBStatus(verPayload.getDOBStatus());
	    	en.setDOBRemarks(verPayload.getDOBRemarks());
	    	en.setMobileRemarks(verPayload.getMobileRemarks());
	    	en.setMobileStatus(verPayload.getMobileRemarks());
	    	en.setEmailStatus(verPayload.getEmailStatus());
	    	en.setGenderStatus(verPayload.getGenderStatus());
	    	en.setGenderRemarks(verPayload.getGenderRemarks());
	    	en.setEmailRemarks(verPayload.getEmailRemarks());
	    	en.setAddressLine1Remarks(verPayload.getAddressLine1Remarks());
	    	en.setAddressLine1Status(verPayload.getAddressLine1Status());
	    	en.setAddressLine2Remarks(verPayload.getAddressLine2Remarks());
	    	en.setAddressLIne2Status(verPayload.getAddressLIne2Status());
	    	en.setAddressLine3Remarks(verPayload.getAddressLine3Remarks());
	    	en.setAddressLine3Status(verPayload.getAddressLine3Status());
	    	en.setFamilyNumberStatus(verPayload.getFamilyNumberStatus());
	    	//20
	    	en.setFamilyNumberRemaks(verPayload.getFamilyNumberRemaks());
	    	en.setCityRemarks(verPayload.getCityRemarks());
	    	en.setCityStatus(verPayload.getCityStatus());
	    	en.setStateRemarks(verPayload.getStateRemarks());
	    	en.setStateStatus(verPayload.getStateStatus());
	    	en.setPinRemarks(verPayload.getPinRemarks());
	    	en.setPinStatus(verPayload.getPinStatus());
	    	en.setFamilyMemberRemarks(verPayload.getFamilyMemberRemarks());
	    	en.setFamilyMemberStatus(verPayload.getFamilyMemberStatus());
	    	en.setChildrenRemarks(verPayload.getChildrenRemarks());
	    	en.setChildrenStatus(verPayload.getChildrenStatus());
	    	en.setChildrenRemarks(verPayload.getChildrenStudyingRemarks());
	    	en.setChildrenStudyingStatus(verPayload.getChildrenStudyingStatus());
	    	en.setChildrenStudyingRemarks(verPayload.getChildrenStudyingRemarks());
	    	en.setEducationExpenseChildRemarks(verPayload.getEducationExpenseChildRemarks());
	    	en.setEducationExpenseChildstatus(verPayload.getEducationExpenseChildstatus());
	    	en.setEarningFamilyMemberRemarks(verPayload.getEarningFamilyMemberRemarks());
	    	en.setEarningFamilyMemebrStatus(verPayload.getEarningFamilyMemebrStatus());
	    	en.setSickMemberRemarks(verPayload.getSickMemberRemarks());
	    	en.setSickMemberStatus(verPayload.getSickMemberStatus());
	    	//40
	    	en.setJobRemarks(verPayload.getJobRemarks());
	    	en.setJobStatus(verPayload.getJobStatus());
	    	en.setFamilyCoveredAyushmanRemarks(verPayload.getFamilyCoveredAyushmanRemarks());
	    	en.setFamilyCoveredAyushmanStatus(verPayload.getFamilyCoveredAyushmanStatus());
	    	en.setEducationRemarks(verPayload.getEducationRemarks());
	    	en.setEducationStatus(verPayload.getEducationStatus());
	    	en.setTobaccoRemarks(verPayload.getTobaccoRemarks());
	    	en.setTobaccoStatus(verPayload.getTobaccoStatus());
	    	en.setAlcholic_smoking_chewingRemarks(verPayload.getAlcholic_smoking_chewingRemarks());
	    	//50
	    	en.setAlcholic_smoking_chewingStatus(verPayload.getAlcholic_smoking_chewingStatus());
	    	//verifyrepo.save(en);
	    	LOGGER.info("details saved of verification of applicant id"+verPayload.getApplicant_id());
	    	verifyrepo.save(en);
	    	return ResponseEntity.status(HttpStatus.OK)
					.body( new VerifyResponse("Verification Details saved of applicant id"+verPayload.getApplicant_id(), Boolean.TRUE));
					}
	    		else {
		    		LOGGER.info("Applicant Verification already exist, so updating the existing data with applicant id"+verPayload.getApplicant_id());
		    		System.out.println(verPayload.getChildrenRemarks());
		    		verifyrepo.updateVerification(verPayload.getVerified_By(),date,
		    				  verPayload.getNameStatus
		    				  (),verPayload.getName_remarks
		    				  (),verPayload.getFathersNameStatus
		    				  (),verPayload.getFathersNameRemarks
		    				  (),verPayload.getDOBStatus
		    				  (),verPayload.getDOBRemarks
		    				  (),verPayload.getGenderStatus
		    				  (),verPayload.getGenderRemarks
		    				  (),verPayload.getMobileStatus
		    				  (),verPayload.getMobileRemarks
		    				  (),verPayload.getEmailStatus
		    				  (),verPayload.getFamilyNumberStatus
		    				  (),verPayload.getEmailRemarks
		    				  (),verPayload.getFamilyNumberRemaks
		    				  (),verPayload.getAddressLine1Status
		    				  (),verPayload.getAddressLine1Remarks
		    				  (),verPayload.getAddressLIne2Status
		    				  (),verPayload.getAddressLine2Remarks
		    				  (),verPayload.getAddressLine3Status
		    				  (),verPayload.getAddressLine3Remarks
		    				  (),verPayload.getCityStatus
		    				  (),verPayload.getCityRemarks
		    				  (),verPayload.getStateStatus
		    				  (),verPayload.getStateRemarks
		    				  (),verPayload.getPinStatus
		    				  (),verPayload.getPinRemarks
		    				  (),verPayload.getFamilyMemberStatus
		    				  (),verPayload.getFamilyMemberRemarks
		    				  (),verPayload.getEarningFamilyMemebrStatus
		    				  (),verPayload.getEarningFamilyMemberRemarks
		    				  (),verPayload.getChildrenStatus
		    				  (),verPayload.getChildrenRemarks
		    				  (),verPayload.getChildrenStudyingStatus
		    				  (),verPayload.getChildrenStudyingRemarks
		    				  (),verPayload.getEducationExpenseChildstatus
		    				  (),verPayload.getEducationExpenseChildRemarks
		    				  (),verPayload.getSickMemberStatus(),verPayload.getSickMemberRemarks
		    				  (),verPayload.getFamilyCoveredAyushmanStatus(),verPayload.getFamilyCoveredAyushmanRemarks
		    				  (),verPayload.getEducationStatus(),verPayload.getEducationRemarks
		    				  (),verPayload.getJobStatus(),verPayload.getJobRemarks
		    				  (),verPayload.getTobaccoStatus(),verPayload.getAlcholic_smoking_chewingStatus
		    				  (),verPayload.getTobaccoRemarks(),verPayload.getAlcholic_smoking_chewingRemarks(),verPayload.getApplicant_id());
		    		System.out.println(verPayload.getAddressLine2Remarks());
		    		return ResponseEntity.status(HttpStatus.OK)
							.body( new VerifyResponse("Verification Details updated"+verPayload.getApplicant_id(), Boolean.TRUE));
		    		//verifyrepo.updateVerification(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null)
		    	}}
	    	
	    	catch (Exception e) {
	    		LOGGER.error("Error While verifying the Applicantof applicant id"+verPayload.getApplicant_id() + e.getMessage());
	    		return ResponseEntity.status(HttpStatus.BAD_REQUEST)
						.body( new VerifyResponse(e.getMessage(), Boolean.FALSE));
	    		
	    		}
	    	}
}