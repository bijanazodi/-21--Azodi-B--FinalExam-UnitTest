
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class StringCalculatorTest {

    private StringCalculator manipulatedstring;

    @BeforeEach
    public void setUp() {
        manipulatedstring = new StringCalculator();
    }

    @AfterEach
    public void tearDown() {
        manipulatedstring = null;
    }

    @Test
    public void testCount1() {
        manipulatedstring.setString("1,1,5"); //test for 3 numbers
        int length = manipulatedstring.add();
        assertEquals(7, length);
    }
      @Test
    public void testCount2() {
        manipulatedstring.setString("1,-1,-5"); //test for negative numbers
        int length = manipulatedstring.add();
        assertEquals(-5, length);
    }
    public void testCount3() {
        manipulatedstring.setString("1,10000"); //test for number greater than 1000
        int length = manipulatedstring.add();
        assertEquals(1, length);
    }
    
    public void testCount4() {
        manipulatedstring.setString("1,10000"); //test for number greater than 1000
        int length = manipulatedstring.add();
        assertEquals(10001, length);
    }
    
    

   