package junit.Test;

import static org.junit.Assert.*;
import junit.framework.TestCase;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import pojo.Address;

public class AddressTest extends TestCase{

	Address addressLongRight;
	Address addressShortRight2;
	Address addressShortRight1;

  @BeforeClass
  public void TestSetup(){
	  try {
		addressShortRight1 = new Address("225 altavista","Ottawa","K1gG1K");
		addressShortRight2 = new Address("225 altavista","Ottawa","K1gG1K");
		addressLongRight= new Address(12, "225 Altavista", "Ottawa", "K1G0G1");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
	  
	  
  }

	@Test
	public void testShortAddressEqual() {
		
		

		assertTrue(addressShortRight1.equals(addressShortRight2));
	}
	@Test
	public void testLongAddressEqual() {
		assertTrue(addressShortRight1.equals(addressShortRight2));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testLongAddressInvalidPC() {
		@SuppressWarnings("unused")
		Address wrongAddress = new Address("helloStreet", "london", "K1g1g1g1g");
	}
	

}
