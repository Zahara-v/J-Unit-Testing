// C SOLUTION 




public class CheckedUser implements User {
	
	String name; 
	int age; 
	String email; 
	


	public void nameChecker (String name) {
		String i[]= name.split(" ");

		if(i.length > 2) { 
			throw new IllegalArgumentException("invalid name");
		}
		
		if(i[0] == "Mr" || i[0] == "Mrs" || i[0] == "Ms" || i[0] == "Miss" || i[0] == "Dr") {
			throw new IllegalArgumentException("invalid name");
		}
		
	}
	
	public void validEmail (String email) { 
		
		

		
		String[] z = this.email.split("@");
		String[] y = this.name.split(" "); 
		
		switch (y.length) {
			
		case 1:
			if(!this.name.equalsIgnoreCase(z[0])) {
				throw new IllegalArgumentException("invalid email");
			}
			break;
		case 2: 
			String[] x = z[0].split("\\."); 
			
			if(x.length != 2) {
				throw new IllegalArgumentException("invalid email");
			}
			
			else if(!y[0].equalsIgnoreCase(x[0]) || !y[1].equalsIgnoreCase(x[1])) {
				throw new IllegalArgumentException("invalid email");
			}
			break;
			
			default:
				throw new IllegalArgumentException("Invalid email"); 
				
		}
	}
		
		


	public CheckedUser (String name) {
		
		age = 0;
		email = "" ;
		
		nameChecker(name); 
		this.name = name; 
		
	}
	
	public CheckedUser (String name, int age) {
		
		email = "" ;
		nameChecker(name); 
		

		this.name = name; 
		this.age = age; 
	}
	
	public CheckedUser (String name, int age, String email) {
		
		nameChecker(name); 

		
		this.name = name; 
		this.age = age; 
		this.email = email; 

		
		
		validEmail(email); 
		 
	}
	
	public String toString() {
		String answer = " ";
		
		if(age == 0 && email == "" ) {
			
			answer = this.name; 
		}
		
		else if (email == "") {
			
			answer = this.name + " " + "(" + this.age + ")"; 
		}
		
		else {
			
			answer = this.name + " " + "(" + this.age + "), "  + this.email; 
		}
		
		return "CheckedUser:" + answer; 
	}


	public String getName() {
	
		return name;
	}

	@Override
	public int getAge() {
		
		return age;
	}

	@Override
	public String getEmail() {
		
		return email;
	}

	public static void main(String[] args) {
		
		CheckedUser a = new CheckedUser ("Zahara Vazir", 40, "ZAhara.vazir"); 
	
		System.out.println(a); 
}

}
