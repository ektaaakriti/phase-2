import java.util.Map;

public class ApplicantResponseMapping {

	private Long Applicant_id;
	private Map<String,String> response;
	public Long getApplicant_id() {
		return Applicant_id;
	}
	public void setApplicant_id(Long applicant_id) {
		Applicant_id = applicant_id;
	}
	public Map<String, String> getResponse() {
		return response;
	}
	public void setResponse(Map<String, String> response) {
		this.response = response;
	}
	public ApplicantResponseMapping(Long applicant_id, Map<String, String> response) {
		super();
		Applicant_id = applicant_id;
		this.response = response;
	}
	public ApplicantResponseMapping() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
