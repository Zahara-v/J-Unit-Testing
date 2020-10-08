import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Assert;
import org.junit.Test;



public class JavaTest9 {
	
	
	
	@Test(expected = IllegalArgumentException.class)
	public void testNoName() {
		CheckedUser a = new CheckedUser("");
	}
	
	
	@Test(expected = IllegalArgumentException.class)
	public void testTooManyNames() {
		CheckedUser a = new CheckedUser("a b c");
	}
	
	@Test(expected = IllegalArgumentException.class) 
	public void testPrefix() {
		CheckedUser a = new CheckedUser("Mr"); 
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testAgeAboveExpected() {
		CheckedUser a = new CheckedUser("Zahara Vazir" , 60);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testAgeBelowExpected() {	
		CheckedUser a = new CheckedUser("Zahara Vazir" , 1);
	}
	

	@Test(expected = IllegalArgumentException.class)
	public void testDifferentNameForEmail(){
		CheckedUser a = new CheckedUser("Zahara Vazir", 19, "Mr@gmail.com"); 
		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testWrongEmailFormat(){
		CheckedUser a = new CheckedUser("Zahara Vazir", 19, "zahara.vazir@gmail"); 
		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testTooManyNamesEmail(){
		CheckedUser a = new CheckedUser("Zahara Vazir", 19, "zahara.noor.vazir@gmail.com"); 
		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testOneNameForEmail(){
		CheckedUser a = new CheckedUser("Zahara Vazir", 19, "zahara@gmail.com"); 
		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testTwoNamesForEmail(){
		CheckedUser a = new CheckedUser("Zahara", 19, "zahara.vazir@gmail.com"); 
		
	}
	
	@Test
	public void testNameGetter() {
		CheckedUser a = new CheckedUser("Zahara Vazir");
		assertEquals ("Zahara Vazir", a.getName());
	}
	

	@Test
	public void testAgeGetter() {
		CheckedUser a = new CheckedUser("Zahara Vazir", 18);
		assertEquals (18, a.getAge());
	}
	
	
	
	@Test
	public void testEmailGetter() {
		CheckedUser a = new CheckedUser("Zahara Vazir", 18, "zahara.vazir@gmail.com");
		assertEquals ("zahara.vazir@gmail.com", a.getEmail());
	}
	
	
	
	@Test
	public void testNameToString() {
		CheckedUser a = new CheckedUser("Zahara Vazir");
		String w = a.toString();
		assertEquals ("CheckedUser:Zahara Vazir", w);
	}
	
	@Test
	public void testNameAgeToString() {
		CheckedUser a = new CheckedUser("Zahara Vazir", 20);
		String w = a.toString();
		assertEquals ("CheckedUser:Zahara Vazir (20)", w);
	}
	
	@Test
	public void testNameAgeEmailToString() {
		CheckedUser a = new CheckedUser("Zahara Vazir", 20, "zahara.vazir@gmail.com");
		String w = a.toString();
		assertEquals ("CheckedUser:Zahara Vazir (20), zahara.vazir@gmail.com", w);
	}
	
	@Test
	public void testLowerCase() {
		CheckedUser a = new CheckedUser("Zahara Vazir", 20, "ZAHARA.VAZIR@gmail.com");
		String w = a.toString();
		assertEquals ("CheckedUser:Zahara Vazir (20), zahara.vazir@gmail.com", w);
	}

	@Test
	public void testNameConstrucor(){
		try {
		new CheckedUser ("Zahara Vazir"); 
	}
		catch(IllegalArgumentException e) {
		fail("Exception accepted"); 
	}
	}
	
	@Test
	public void testNameAgeConstrucor(){
		try {
		new CheckedUser ("Zahara Vazir", 21); 
	}
		catch(IllegalArgumentException e) {
		fail("Exception accepted"); 
	}
	}
	
	@Test
	public void testNameAGeEmailConstrucor(){
		try {
			new CheckedUser ("Zahara Vazir", 21, "zahara.vazir@gmail.com"); 
		}
			catch(IllegalArgumentException e) {
			fail("Exception accepted"); 
		}
		}
	
	
	

	
	
	
	
	
	
	
	
	
	
}




