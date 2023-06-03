import java.util.Scanner;

public class AdhaarValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String scr="241078786613";
		VerhoeffAlgorithm va=new VerhoeffAlgorithm();
		
		
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
		System.out.println("Enter the Adhaar no.");
	    String sc = myObj.nextLine(); 
		//System.out.println(sc);
		Boolean res = va.validateVerhoeff(sc);
		System.out.println("Result is :"+" " +res+ " "+"That means");
		if(res==true) {

			System.out.println("Adhaar no. is valid!!!");
		}
		else {
			System.out.println("Adhaar no. is not valid !!!");
		}
	}

}
