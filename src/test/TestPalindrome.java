package test;
import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class TestPalindrome {

	@Test
	public void test() {
		Palindrome p = new Palindrome(); 
		assertEquals(true, p.testing());
	}
	
	

}
