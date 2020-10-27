package com.training.testcases;

import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.training.example.AvgNegValueException;
import com.training.example.Calculator;

class CalculatorTest {
	Calculator calculator;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Before all Testcases");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("After all Testcases");
	}

	@BeforeEach
	void setUp() throws Exception {
		calculator=new Calculator();
		System.out.println("Before each Testcases");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("After each Testcases");
	}

	@Test
	void testSum() {
		int actual=calculator.sum(7, 3);
	
		assertEquals(10, actual);
	}
	 @Test
	    void testSub() {
	        int actual = calculator.sub(20, 10);
	        assertEquals(10,actual);
	        //fail("Not yet implemented");
	    }
	    @Test
	    void testmul() {
	        int actual = calculator.mul(10, 20);
	        assertEquals(200,actual);
	        //fail("Not yet implemented");
	    }
	    @Test
	    void testdiv() {
	        int actual = calculator.div(20, 10);
	        assertEquals(2,actual);
	        //fail("Not yet implemented");
	    }
	    @Test
	    void testavg() {
	        double actual = calculator.avg(100,100,100);
	        assertEquals(100.0,actual);
	        //fail("Not yet implemented");
	    }
	    @Test
        void testAvgNeg() {
            assertThrows(AvgNegValueException.class, ()->calculator.avg(-20, 10, 5));
        }
	 
}
