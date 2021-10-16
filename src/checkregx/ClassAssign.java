package checkregx;

import java.util.regex.Pattern;

public class ClassAssign {

	public static void main(String[] args) {
		
		//Email Id Validation
		System.out.println (Pattern.matches("^[A-Za-z]+@[A-Za-z](.+[com])", "firstname@gmail.com"));
		System.out.println (Pattern.matches("^[A-Za-z]+@[A-Za-z](.+[com])", "krishna@gmail.com"));
		System.out.println (Pattern.matches("^[A-Za-z0-9+_.-]+@(.+)$", "test123prepare@co.edu.com")); 
		
		//Phone number with +91 country code
		System.out.println (Pattern.matches("[+]91+\\s\\d{10}", "+91 9000000000")); 
		
		

	//	System.out.println (Pattern.matches("[A-Z]+\\d{3}[a-zA-Z]*", "A123iidfgb")); 
	//	System.out.println (Pattern.matches("[A-Z][A-Za-z]{6}\\d{3}", "Aasdfgh123")); 
		//^[A-Z][A-Za-z]+([0-9]{3}?)+\w\w[A-Za-z]
		System.out.println (Pattern.matches("^([A-Z])|([A-Za-z]{6})|(\\d{3})", "Aasd123fgh")); 
	

	}

}
