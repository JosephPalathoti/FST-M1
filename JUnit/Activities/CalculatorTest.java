import static org.junit.jupiter.api.Assertions.assertEquals;
	import org.junit.jupiter.api.BeforeEach;
	import org.junit.jupiter.api.DisplayName;

	import org.junit.jupiter.api.Test;
public class CalculatorTest {
	

	// The Test class should start or end with "Test"
	

	    private Calculator calculator;

	    @BeforeEach
	    public void setUp() throws Exception {
	        calculator = new Calculator();
	    }

	    @Test
	    @DisplayName("Simple multiplication should work")
	    public void testMultiply() {
	        assertEquals(20, calculator.multiply(4, 5));
	    }
	}


