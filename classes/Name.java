package Class;

public class Name
{
   private String first, last;
   public Name(String first, String last) {
	   this.first=first;
	   this.last=last;
   }
   public String toString() { return first+" "+last; }
   
   public boolean equals(Object o) { 
	   if(o.toString()==this.toString()){
		   return true;
	   }
	   return false; 
   }
   
   public String getlast(){
	   return last;
   }
   
   public void setlast(String name){
	   this.last=name;
   }
   
   public String getfirst(){
	   return first;
   }
   
   public void setfirst(String name){
	   this.first=name;
   }
}
