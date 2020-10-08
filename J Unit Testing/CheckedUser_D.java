// D SOLUTION 




public class CheckedUser implements User {
	
	String name; 
	int age; 
	String email; 

		


	public CheckedUser (String name) {
		
		age = 0;
		email = "" ;
		
		this.name = name; 
		
	}
	
	public CheckedUser (String name, int age) {
		
		email = "" ;
		
		this.name = name; 
		this.age = age; 
	}
	
	public CheckedUser (String name, int age, String email) {
		

		
		this.name = name; 
		this.age = age; 
		this.email = email; 

		 
	}
	
	public String toString() {
		String answer = " ";
		
		if(age == 0 && email == "" ) {
			
			answer = this.name; 
		}
		
		else if (email == "") {
			
			answer = this.name + " "  + this.age; 
		}
		
		else {
			
			answer = this.name + " "+ this.age + ","+ this.email; 
		}
		
		return  answer; 
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
		
		CheckedUser a = new CheckedUser ("Zahara Vazir", 5678, "noor"); 
	
		System.out.println(a); 
}

}
