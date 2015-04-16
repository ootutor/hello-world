import junit.framework.TestCase;



public class MultiPurposeCalculatorTest extends TestCase {

	private MultiPurposeCalculator cal;
	
		public void setUp(){
			cal = new MultiPurposeCalculator();
	}
		
		public void testGCD(){
			int expected=1;
			assertEquals(expected, cal.gcd(17,23));
			expected=4;
			assertEquals(expected, cal.gcd(12, 4));
			expected=3;
			assertEquals(expected, cal.gcd(51,57));
			expected=17;
			assertEquals(expected, cal.gcd(17,34));
			expected=4;
			assertEquals(expected, cal.gcd(12,8));
			expected=5;
			assertEquals(expected, cal.gcd(15,25));
		}		
}