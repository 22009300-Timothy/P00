import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}
	// code executed before all test methods
	
	@Before
	public void setUp() throws Exception {
	// code executed before each test method
	}
	
	@Test
	public void testAdd() {
		//fail("Not yet implemented"); // TODO
		// Arrange
		int a = 1234;
		int b = 8765;
		Calculator cal = new Calculator();
		
		// Act
		int actual = cal.add(a, b);
		
		// Assert
		int expected = 9999;
		assertEquals (actual, expected);
	}
	
	@Test
	public void testSubtract() {
		//fail("Not yet implemented"); // TODO
		// Arrange
		int a = 9876;
		int b = 4321;
		Calculator cal = new Calculator();
		int actual = cal.subtract(a,b);
		
		// Act
		int expected = 5555;
		
		// Assert
		assertEquals(actual, expected);
	}
	
	@Test
	public void testMultiply() {
		//fail("Not yet implemented"); // TODO
		// Arrange
		int a = 1234;
		int b = 8765;
		Calculator cal = new Calculator();
		
		// Act
		int actual = cal.multiply(a,b);
		
		// Assert
		int expected = 10816010;
		assertEquals(actual, expected);
	}
	
	@Test
	public void testDivide() {
		//fail("Not yet implemented"); // TODO
		// Arrange
		int a = 9000;
		int b = 3000;
		Calculator cal = new Calculator();
		
		// Act
		int actual = cal.divide(a,b);
		
		// Assert
		int expected = 3;
		assertEquals(actual, expected);
	}
	
	@After
	public void tearDown() throws Exception {
	// code executed after each test method
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	// code executed after each test method
	}

}