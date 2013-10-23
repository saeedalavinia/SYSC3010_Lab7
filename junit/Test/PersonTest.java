package junit.Test;

import junit.framework.TestCase;

import org.junit.Test;

import pojo.Address;
import pojo.Course;
import pojo.Person;

public class PersonTest extends TestCase {
	Person p1 =new Person("chimere", "lastname");
	
	


	@Test
	public void toStringTest() {
		String s="chimierelastname";
		assertEquals(p1.toString(), s);
	}
	
	@Test
	public void testPersonAddress(){
		Address a= new Address("steer", "ottawa", "k1g2re");
		p1.setAddress(a);
		assertEquals("Set address went bad", p1.getAddress(), a);
	}
	
	@Test
	public void testGetFullName(){
		
		String s="chimiere lastname";
		assertEquals(p1.getFullName(), s);
	}
	
	@Test
	public void testAddCourse(){
		Course c= new Course("3010", "SYSC");
		p1.addCourse(c);
		assertEquals(1, p1.getCourses().length);
	}
	
	@Test
	public void testRemoveCourse(){
		Course c= new Course("3010", "SYSC");
		p1.remove(c);;
		assertEquals(0, p1.getCourses().length);
	}
	
	@Test 
	public void testPersonEqual(){
		Person p2= new Person("RAD", "lastname");
		assertTrue(!p1.equals(p2));
		
	}

}
