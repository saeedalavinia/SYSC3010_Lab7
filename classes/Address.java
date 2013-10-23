package Class;
public class Address
{
    private int unit;
    private String street;
    private String city;
    private String postalCode;
    boolean hasUnit=false;
    public Address (String street, String city, String postalCode) throws Exception
    { 
    	this.city=city;
    	if(isValidPostalCode(postalCode)){
    		this.postalCode=postalCode;
    	}
    	this.street=street;
    };
    public Address (int unit, String street, String city, String postalCode) throws Exception
    { 
    	this.unit=unit;
    	this.city=city;
    	if(isValidPostalCode(postalCode)){
    		this.postalCode=postalCode;
    	}else{
    		throw new Exception();
    	}
    	this.street=street;
    	hasUnit=true;
    };

     public String toString() { 
    	 if(hasUnit){
    		 return Integer.toString(unit)+street+city+postalCode;
    	 }else{
    		 return street+city+postalCode;
    	 }
     }
     public boolean equals(Object o) { 
    	 if(o.toString()==this.toString()){
    		 return true;
    	 }
    	 return false; 
    }
     
     private boolean isValidPostalCode( String postalCode ) { 
    	 if(postalCode.length()==6){
    		 return true;
    	 }
    	 return false; 
     }
 
} 
