package pl.sda;

import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Clculator2 {

    private Calculator1 Calculator1;
    @Before
    //Given         // Given when then to komentarze ułatwiające czytanie testów
    public void setup(){
        Calculator1 = new Calculator1();
    }
    
    @Test
    public void testAdding(){
        //When
        int result = Calculator1.add(4,4);
        //Then
        assertEquals(8, result);

    }
    @Test
    public void testAdding1(){
        int result = Calculator1.add(9,9);

        assertEquals(18, result);
    }
    @Test
    public void testSubstract(){
        int result = Calculator1.subtract(9,7);

        assertEquals(2, result);
    }
    @Test
    public void testSubstract1(){
        int result = Calculator1.subtract(8,8);

        assertEquals(0, result);
    }
    @Test
    public void testMultiply(){
        int result = Calculator1.multiply(2,4);

        assertEquals(8, result);
    }
    @Test
    public void testMultiply1(){
        int result = Calculator1.multiply(3,10);

        assertEquals(30, result);
    }
    @Test
    public void testDivide(){
        Double result = Calculator1.divide(new Double(9),new Double(1));

        assertEquals(new Double(9), result);
    }
    @Test
    public void testDivide1(){
        Double result = Calculator1.divide(new Double(8),new Double(2));

        assertEquals(new Double(4), result);
    }
}
