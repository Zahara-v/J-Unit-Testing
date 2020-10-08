// B OR HIGHER SOLUTION 




public class CheckedUser implements User {
	
	String name; //declaring the variable name
	int age; //declaring variable age 
	String email; //declaring the variable email 
	

	public void toLowerCase(String email) { //method to convert the email to lower case using the toLowerCase() function 
		email = email.toLowerCase(); 
	} //void as it doesn't return anything 
	
	public void nameChecker (String name) { //method created to check if name inputed is valid
		String i[]= name.split(" "); //firstly splits the name into an array, and stores it in i, in respect to the space between the words. 
		//first name = i[0] , surname = i[1]
		if (name == "") { //if statement checking if name is equal to null. if so, throw an IllegalArgumentException
			throw new IllegalArgumentException("No name provided");
		}
		if(i.length > 2) { //if statement checking if length of array is greater than 2, if so, IllegalArgumentException is thrown. 
			throw new IllegalArgumentException("invalid name");
		}
		
		if(i[0] == "Mr" || i[0] == "Mrs" || i[0] == "Ms" || i[0] == "Miss" || i[0] == "Dr") {
			throw new IllegalArgumentException("invalid name");
		} // if statement checking if the first element of the array, i[0], equals to a prefix. if it does, an IllegalArgumentException is thrown. 
		
	}
	
	public void validEmail (String email) { //method to check if email is valid 
		
		
		String check = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
		//variable named check, that stories the general expression for the email. 
		
		if(!email.matches(check)) { //if statement checking if the email given matches the general format for the email. if it doesn't, an IllegalArgumentException is thrown.
			throw new IllegalArgumentException("invalid email");
		}
		
		String[] z = this.email.split("@"); //split email in respect to the @ and store in z
		String[] y = this.name.split(" "); //split name in respect to the space and store in y
		
		switch (y.length) { //expression for switch statement is the length of the array y
			
		case 1:
			if(!this.name.equalsIgnoreCase(z[0])) { //case 1: length is 1, if the name doesn't equal the name of the email (z[0]), IllegalArgumentException is thrown.
				throw new IllegalArgumentException("invalid email"); //ignore if it is upper case or lower case.
			}
			break;
		case 2: 
			String[] x = z[0].split("\\.");  //split name of email, before the @ sign, in respect to the . between the words, and store in x
			
			if(x.length != 2) { //checking if there are two words and if the length of array x is not equal two, throw an IllegalArgumentException
				throw new IllegalArgumentException("invalid email");
			}
			
			else if(!y[0].equalsIgnoreCase(x[0]) || !y[1].equalsIgnoreCase(x[1])) {  //checking if the first name (y[0]), does not equal the first name of the email (x[0]), or the second name (y[1])doesn't equal the second name of the email (x[1]), IllegalArgumentException is thrown.  
				throw new IllegalArgumentException("invalid email");
			}
			break;
			
		default:
			throw new IllegalArgumentException("Invalid email"); 
			// if the length of array is greater than 2, throw IllegalArgumentException
				
		}
	}
		
		


	public CheckedUser (String name) { // constructor for name. parameter is String name.  
		
		age = 0; // initialize age to 0  
		email = "" ; // initialize email to null  
		
		nameChecker(name); //call nameChecker method 
		this.name = name; 
		
	}
	
	public CheckedUser (String name, int age) { //constructor for name and age. parameters are name and age 
		
		email = "" ; // initialize email to null  
		nameChecker(name);  //call nameChecker method 
		
		if(age < 18 || age > 30) { //check if the age is between 18 and 30, if not throw an IllegalArgumentException
			throw new IllegalArgumentException("invalid age");
		}
		this.name = name; 
		this.age = age; 
	}
	
	public CheckedUser (String name, int age, String email) { //constructor for name, age and email. parameters are name, age and email. 
		
		nameChecker(name); //call nameChecker method 
		
		if(age < 18 || age > 30) { //check if the age is between 18 and 30, if not throw an IllegalArgumentException
			throw new IllegalArgumentException("invalid age");
		}
		
		this.name = name; 
		this.age = age; 
		this.email = email.toLowerCase(); //converting email to lower case. 
		
		
		validEmail(email); //call validEmail method 
		 
	}
	
	public String toString() { // toString() method. 
		String answer = " "; //declaring a variable called answer and initialize to null. 
		
		if(age == 0 && email == "" ) { //if there's no input for name and age, we will return the name only. 
			
			answer = this.name; 
		}
		
		else if (email == "") { //if there is no email, return name and age. 
			
			answer = this.name + " " + "(" + this.age + ")"; 
		}
		
		else { // return all three. 
			
			answer = this.name + " " + "(" + this.age + "), "  + this.email; 
		}
		
		return "CheckedUser:" + answer; //how we want the output returned. 
	}

	@Override
	public String getName() { // accessor for name 
	
		return name;
	}

	@Override
	public int getAge() { // accessor for age 
		
		return age;
	}

	@Override
	public String getEmail() { // accessor for email 
		
		return email;
	}

	
	
	
	
	public static void main(String[] args) {
		
		CheckedUser a = new CheckedUser ("Zahara", 40 , "ZAHARA@gmail.com"); 
	
		System.out.println(a); 
}

}
