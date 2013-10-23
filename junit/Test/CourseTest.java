package junit.Test;

import junit.framework.TestCase;

import org.junit.BeforeClass;
import org.junit.Test;

import pojo.Course;
import pojo.Professor;
import pojo.Student;

public class CourseTest extends TestCase{
	Course course1;
	Course course2;
	Professor p;
	Student s;
	
	@BeforeClass
	public void testSetup(){
		course1= new Course("3010", "SYSC");
		course2= new Course("3010", "SYSC");
		p=new Professor("jack",	"sparrow");
		s= new Student("john", "TheStudent");
		
	}
	
	@Test
	public void testCourseEqual() {
		assertTrue("Equal failed", course1.equals(course2));
	}
	
	
	@Test
	public void testSetProf(){
		course1.setProfessor(p);
		assertTrue(course1.getProfessor().equals(p));
	}
	
	@Test 
	public void testAddStudent(){
		course1.addStudent(s);
		assertEquals(1, course1.getStudents().length);
	}
	public void testRemoveStudent(){
		course1.removeStudent(s);
		assertEquals(0, course1.getStudents().length);
	}
	
}
