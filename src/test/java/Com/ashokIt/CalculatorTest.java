package Com.ashokIt;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.ashokIt.Calculator;

public class CalculatorTest {
	
	@Test
	public void addTest() {
		Calculator calc = new Calculator();
		int actualResult = calc.add(20, 30);
		int expectedResult = 50;
		assertEquals(expectedResult, actualResult);
	}

}
