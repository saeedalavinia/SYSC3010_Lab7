package junit.Test;

import junit.framework.TestCase;

import org.junit.Assert;
import org.junit.Test;

import pojo.Name;

public class NameTest extends TestCase {

	@Test
	public void nameEqualtest() {
		Assert.assertTrue(new Name("SAEED","ALAVINIA").equals(new Name("saeed","alavinia")));
	}

}
