package JUnitTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testAddNumbers {

	@Test
	public void test() 
	{
		jUnitFunction junit = new jUnitFunction();
		int result = junit.addNumbers(100, 200);
		assertEquals (300,result);
		}

}
//E19CSE039
//Jangala S M V Vishnu Vardhan
