package fizzbuzz;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import fizzBuzz.FizzBuzz;

class FizzBuzzTest {
	//private FizzBuzz fizzBuzz;
	
	/*@BeforeEach
	public void initialiser() {
		fizzBuzz = new FizzBuzz();
	}*/
	
	@Test
	public void testFizzBuzz() {
		//fail("Not yet implemented");
		assertEquals(FizzBuzz.fizzBuzz(1),"1");
	}

}
