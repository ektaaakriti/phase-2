import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Prediction {

	public static void update(String prediction, String ID, Statement stmt1) {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/arthavedika_v1", "root",
					"br313348");
			String query = "Update applicant_table set prediciton='" + prediction + "',submited=1 where applicant_id = "
					+ ID;
			Statement statement = con.createStatement();
			int resultSet = statement.executeUpdate(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws ClassNotFoundException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/kosh_db_v1", "root",
					"br313348");
			Statement statement = connection.createStatement();
//			ResultSet resultSet = statement.executeQuery("Select id,crrct_ans_opt from psycho_qstn where q_phy_applicable !=0");
//			HashMap<String, String> correctAnsMap = new HashMap<>();
//			while (resultSet.next()) {
//
//				long q_id = resultSet.getLong("id");
//				String qstn_id = Long.toString(q_id);
//				String ans = resultSet.getString("crrct_ans_opt");
//				correctAnsMap.put(qstn_id, ans);
//
//			}
	

			ResultSet resultSet1 = statement.executeQuery("Select distinct applicant_id from psycho_ans");
			List<String> uniqueApplicantId = new ArrayList<>();
			while (resultSet1.next()) {
				resultSet1.getString("applicant_id");
				uniqueApplicantId.add(resultSet1.getString("applicant_id"));

			}
			List<ApplicantResponseMapping> allApplicantDetails = new ArrayList<>();

			// Gettiong details for all applicant id
			Map<String, Float> finalAnsRepsonse = new HashMap<>();
			for (String a : uniqueApplicantId) {
				ApplicantResponseMapping arm = new ApplicantResponseMapping();
				arm.setApplicant_id(Long.parseLong(a));
				//ResultSet resultSet2 = statement.executeQuery("Select que_id,ans from psycho_ans where applicant_id = '" + a + "' and que_id in (Select id from psycho_qstn where q_phy_applicable !=0)");
				ResultSet resultSet2 = statement.executeQuery("select c.applicant_id,round(sum(qth_wght),2),round(sum(qth_wght),2)*100/5 as sucrslt from (select a.*,b.q_weigh*b.optn_value as qth_wght from kosh_db_v1.psycho_ans a ,psycho_qstn_opt_grad b\r\n"
						+ "where a.que_id= b.q_id and a.ans= b.optn_id and   a.applicant_id = " + a +") c  ");
				Map<String, String> eachReponse = new HashMap<>();
				while (resultSet2.next()) {
					System.out.println("applicant id is"+a+resultSet2.getString("applicant_id")+resultSet2.getString("sucrslt"));
					eachReponse.put(resultSet2.getString("applicant_id"), resultSet2.getString("sucrslt"));
					finalAnsRepsonse.put(resultSet2.getString("applicant_id"), Float.parseFloat(resultSet2.getString("sucrslt")));

				}
				
				arm.setResponse(eachReponse);

				allApplicantDetails.add(arm);
			}
//
//			Map<Long, Integer> finalAnsRepsonse = new HashMap<>();
//			allApplicantDetails.forEach(eachApplicantResponseDetails -> {
//				int correctAnsCount = 0;
//				Map<String, String> eachResponse = eachApplicantResponseDetails.getResponse();
//			
//				for (String id : eachResponse.keySet()) {
//					if (eachResponse.get(id).equals(correctAnsMap.get(id))) {
//						correctAnsCount++;
//					}
//				}
//				finalAnsRepsonse.put(eachApplicantResponseDetails.getApplicant_id(), correctAnsCount);
//			});
//			System.out.println(finalAnsRepsonse);
			//Map<Long, Integer> finalAnsRepsonse = new HashMap<>();
			for (String s_id : finalAnsRepsonse.keySet()) {
				float value = finalAnsRepsonse.get(s_id);
				if (value > 30) {
					System.out.println("High Probability of willful default");
					update("High ", String.valueOf(s_id), statement);
				} else if (value >= 30 && value <= 60) {

					System.out.println("Moderate Probability Of Default");
					update("Moderate", String.valueOf(s_id), statement);
				} else if (value >60) {
					System.out.println("low Probability Of Default");
					update("low", String.valueOf(s_id), statement);
				}
//				} else if (value >= 5 && value <= 8) {
//
//					System.out.println("High Probability Of Default");
//					update("High", String.valueOf(s_id), statement);
//				} else if (value >= 1 && value <= 4) {
//
//					System.out.println("Very High Probability Of Default");
//					update("Very High", String.valueOf(s_id), statement);
//				} else if (value == 0) {
//					System.out.println("Highest probability of default");
//					update("Highest", String.valueOf(s_id), statement);
//				} else {
//					System.out.println("Error!!");
//				}
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
