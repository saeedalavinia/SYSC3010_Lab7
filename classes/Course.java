package Class;

import java.util.ArrayList;

public class Course
{
    private String id;
    private String name;
    private Professor professor;
    private ArrayList<Student>students;
    
    public Course( String id, String name) {};
    
    public String getId() { return id; }
    public String getName( ) { return name; }

    public String toString() { return "ID is"+id+"Name is"+name+"Professor is"+professor+"Students are"+students.toString(); }
    
    public boolean equals(Object o) {
    	if(o.toString()==this.toString()){
    		return true;
    	}
    	return false;
    }

    public void setProfessor(Professor professor) {
    	this.professor=professor;
    };
    public Professor getProfessor() { return professor; }

    public void addStudent( Student student ) {
    	students.add(student);
    };
    
    public void removeStudent( Student student ) {
    	students.remove(student);
    };
    
    public Student[] getStudents() { return (Student[]) students.toArray(); }
    
    
}
