
public class SimpleUser implements User
{
 private String name;
 private String email;
 private int age;
 
 public SimpleUser(final String name, final int age, final String email) {
     this.name = name;
     this.age = age;
     this.email = email;
 }
 
 public String getName() {
     return this.name;
 }
 
 public void setName(final String name) {
     this.name = name;
 }
 
 public String getEmail() {
     return this.email;
 }
 
 public void setEmail(final String email) {
     this.email = email;
 }
 
 public int getAge() {
     return this.age;
 }
 
 public void setAge(final int age) {
     this.age = age;
 }
}
