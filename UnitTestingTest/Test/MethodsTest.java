import static org.junit.Assert.*;

public class MethodsTest {

    Methods meth = new Methods();

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void isPrimeNumber() {
        assertFalse(meth.isPrimeNumber(-5)); //test passed
        assertFalse(meth.isPrimeNumber(1)); //test passed
        assertFalse(meth.isPrimeNumber(90)); //test passed
        assertTrue(meth.isPrimeNumber(89)); //test passed
        assertFalse(meth.isPrimeNumber(6)); //test passed
        assertTrue(meth.isPrimeNumber(37)); //test passed
        assertFalse(meth.isPrimeNumber(65));//test passed
        assertFalse(meth.isPrimeNumber(25)); // test failed method received int 25 and returned true expected false bacasue 25 isn't primary number
        assertTrue(meth.isPrimeNumber(29));//test passed
    }

    @org.junit.Test
    public void removeVowels() {
        assertEquals("HJ",meth.removeVowels("ahoooj")); //test passed
        assertEquals("85SSK",meth.removeVowels("85sasek")); //test passed
        assertEquals("JLNK?",meth.removeVowels("Jelinek?")); //test passed
        assertEquals("DV+45=4SDM",meth.removeVowels("DVA+45=4sedem")); //test passed
        assertEquals("N!$%",meth.removeVowels("aaaano!$%")); //test passed
        assertEquals("/*8JJ",meth.removeVowels("/*8jooooj")); //test passed
        assertEquals("@TRSM",meth.removeVowels("@turSIM")); //test passed
    }

    @org.junit.Test
    public void maxPrimeNumberBetweenAandB() {
        assertEquals(13,meth.maxPrimeNumberBetweenAandB(2,15)); //test passed
        assertEquals(23,meth.maxPrimeNumberBetweenAandB(-1,23)); //test passed
        assertEquals(-1,meth.maxPrimeNumberBetweenAandB(50,15)); //test passed
        assertEquals(-1,meth.maxPrimeNumberBetweenAandB(33,36)); //test passed
        assertEquals(47,meth.maxPrimeNumberBetweenAandB(47,48)); //test passed
        assertEquals(89,meth.maxPrimeNumberBetweenAandB(84,89)); //test passed
        assertEquals(89,meth.maxPrimeNumberBetweenAandB(83,96)); //test passed
        assertEquals(83,meth.maxPrimeNumberBetweenAandB(83,84)); //test passed
    }

    @org.junit.Test
    public void convertHHMMtoHH() {
        assertEquals(5.0097,meth.convertHHMMtoHH(5,0),0.0098); //test passed
        assertEquals(1.5005,meth.convertHHMMtoHH(1,30),0.0006); //test passed
        assertEquals(3.0833,meth.convertHHMMtoHH(3,5),0.0033); //test passed
        assertEquals(0.0,meth.convertHHMMtoHH(0,1),0.0166); //test passed
    }
}