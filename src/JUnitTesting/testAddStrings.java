package JUnitTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testAddStrings {

	@Test
	public void test() {
		jUnitFunction junitstring = new jUnitFunction();
		String result = junitstring.addString("capstone", "project");
		assertEquals ("capstoneproject",result);
	}

}
//E19CSE039
//Jangala S M V Vishnu Vardhan
