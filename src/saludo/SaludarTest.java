package saludo;

import static org.junit.Assert.*;

import org.junit.Test;


/**
 * @author Bad Taste 
 * test class for a rubbish class
 */
public class SaludarTest {

	@Test
	public void testGreetMethod() {
		Saludar saludo = new Saludar();

		String expected = "hola";
		String target = Saludar.greet_method(0, 1);
		assertEquals("Testing spanish greet once", expected, target);

		expected = "hellohello";
		target = Saludar.greet_method(1, 2);
		assertEquals("Testing english greet twice", expected, target);

		expected = "kaixokaixokaixokaixo";
		target = Saludar.greet_method(2, 4);
		assertEquals("Testing basque greet four times", expected, target);
	}

}
