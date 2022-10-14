import static org.junit.Assert.*;

public class RomanToDecimalTest {

    @org.junit.Test
    public void romanToDecimal() {
        assertEquals(RomanToDecimal.romanToDecimal("I"), 1);
        assertEquals(RomanToDecimal.romanToDecimal("II"), 2);
        assertEquals(RomanToDecimal.romanToDecimal("III"), 3);
        assertEquals(RomanToDecimal.romanToDecimal("IV"), 4);
        assertEquals(RomanToDecimal.romanToDecimal("V"), 5);
        assertEquals(RomanToDecimal.romanToDecimal("VI"), 6);
        assertEquals(RomanToDecimal.romanToDecimal("VII"), 7);
        assertEquals(RomanToDecimal.romanToDecimal("VIII"), 8);
        assertEquals(RomanToDecimal.romanToDecimal("IX"), 9);
        assertEquals(RomanToDecimal.romanToDecimal("X"), 10);
        assertEquals(RomanToDecimal.romanToDecimal("pleaseGiveMeAGoodGradeOnThis"), -1);
        assertEquals(RomanToDecimal.romanToDecimal("unit1TestWillKickMyAss"), -1);
        assertEquals(RomanToDecimal.romanToDecimal("Hello"), -1);
        assertEquals(RomanToDecimal.romanToDecimal("iHateJuniorYear"), -1);
        assertEquals(RomanToDecimal.romanToDecimal("IXIX"), 20);
        assertEquals(RomanToDecimal.romanToDecimal("XLXL"), 100);
        assertEquals(RomanToDecimal.romanToDecimal("XCXC"), 200);
        assertEquals(RomanToDecimal.romanToDecimal("CDCD"), 1000);
        assertNotEquals(RomanToDecimal.romanToDecimal("IV"), 14);
        assertNotEquals(RomanToDecimal.romanToDecimal("III"), 14);
    }
}