package Class;

import java.util.ArrayList;
public class Person
{
   private Name name;
   private Address address;
   private ArrayList<Course> courses;
   
   public Person( String first, String last) {
	   this.name=new Name(first,last);
   };
   
   public void setLastName( String name) {
	  this.name.setlast(name);  
   };
   
   public String getLastName() { return this.name.getlast(); };
   
   public String getFirstName() { return this.name.getfirst(); };
   public String getFullName() { return this.name.getfirst()+this.name.getlast(); };

   public void setAddress(Address address) {
	   this.address=address;
   };
   public Address getAddress() { return address; };

   public Course[] getCourses() { return (Course[]) courses.toArray(); }
   
   public void addCourse( Course course ) {
	   courses.add(course);
   };
   
   public void remove(Course course) {
	   courses.remove(course);

   };

    public String toString() { 
    	return "Name is"+this.getFullName()+"Address is"+address.toString()+"Courses are"+courses.toString();
    }
    
    public boolean equals(Object o) { 
    	if(o.equals(this.toString())){
    		return true;
    	}
    	
    	
    	return false; 
    }

}     

