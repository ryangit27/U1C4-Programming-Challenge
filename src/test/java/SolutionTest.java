
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Grading test file for the U1C4 Programming Challenge.

public class SolutionTest {

    // endsLy

    @Test
    public void testEndsLyOddly() {
        Solution sol = new Solution();
        assertTrue(sol.endsLy("oddly"));
    }

    @Test
    public void testEndsLySingleY() {
        Solution sol = new Solution();
        assertFalse(sol.endsLy("y"));
    }

    @Test
    public void testEndsLyOddy() {
        Solution sol = new Solution();
        assertFalse(sol.endsLy("oddy"));
    }

    // Hidden

    @Test
    public void testEndsLyExactlyLy() {
        Solution sol = new Solution();
        assertTrue(sol.endsLy("ly"));
    }

    @Test
    public void testEndsLyEmpty() {
        // An empty string must not crash.
        Solution sol = new Solution();
        assertFalse(sol.endsLy(""));
    }

    @Test
    public void testEndsLyLyAtFront() {
        // Catches checking for "ly" anywhere instead of at the end.
        Solution sol = new Solution();
        assertFalse(sol.endsLy("lyre"));
    }

    @Test
    public void testEndsLyBackwards() {
        Solution sol = new Solution();
        assertFalse(sol.endsLy("fly yl"));
    }

    @Test
    public void testEndsLyCapital() {
        // "LY" is not the same as "ly".
        Solution sol = new Solution();
        assertFalse(sol.endsLy("ITALY"));
    }

    @Test
    public void testEndsLyLonger() {
        Solution sol = new Solution();
        assertTrue(sol.endsLy("quickly"));
    }

    // conCat

    @Test
    public void testConCatDoubleChar() {
        Solution sol = new Solution();
        assertEquals("abcat", sol.conCat("abc", "cat"));
    }

    @Test
    public void testConCatNoDouble() {
        Solution sol = new Solution();
        assertEquals("dogcat", sol.conCat("dog", "cat"));
    }

    @Test
    public void testConCatSecondEmpty() {
        Solution sol = new Solution();
        assertEquals("abc", sol.conCat("abc", ""));
    }

    // Hidden

    @Test
    public void testConCatFirstEmpty() {
        // An empty first string must not crash.
        Solution sol = new Solution();
        assertEquals("cat", sol.conCat("", "cat"));
    }

    @Test
    public void testConCatBothEmpty() {
        Solution sol = new Solution();
        assertEquals("", sol.conCat("", ""));
    }

    @Test
    public void testConCatSingleChars() {
        Solution sol = new Solution();
        assertEquals("a", sol.conCat("a", "a"));
    }

    @Test
    public void testConCatSecondSingleChar() {
        Solution sol = new Solution();
        assertEquals("pig", sol.conCat("pig", "g"));
    }

    @Test
    public void testConCatCaseMatters() {
        // 'c' and 'C' are different chars.
        Solution sol = new Solution();
        assertEquals("abcCat", sol.conCat("abc", "Cat"));
    }

    @Test
    public void testConCatOnlyFirstOfSecond() {
        Solution sol = new Solution();
        assertEquals("aba", sol.conCat("ab", "ba"));
    }

    // withoutX

    @Test
    public void testWithoutXBothEnds() {
        Solution sol = new Solution();
        assertEquals("Hi", sol.withoutX("xHix"));
    }

    @Test
    public void testWithoutXFront() {
        Solution sol = new Solution();
        assertEquals("Hi", sol.withoutX("xHi"));
    }

    @Test
    public void testWithoutXMiddleKept() {
        Solution sol = new Solution();
        assertEquals("Hxi", sol.withoutX("Hxix"));
    }

    // Hidden

    @Test
    public void testWithoutXNone() {
        Solution sol = new Solution();
        assertEquals("Hello", sol.withoutX("Hello"));
    }

    @Test
    public void testWithoutXEndOnly() {
        Solution sol = new Solution();
        assertEquals("Hi", sol.withoutX("Hix"));
    }

    @Test
    public void testWithoutXOnlyOneEachEnd() {
        // Only one x comes off each end.
        Solution sol = new Solution();
        assertEquals("xHix", sol.withoutX("xxHixx"));
    }

    @Test
    public void testWithoutXJustTwoX() {
        Solution sol = new Solution();
        assertEquals("", sol.withoutX("xx"));
    }

    @Test
    public void testWithoutXCapital() {
        // 'X' is not 'x'.
        Solution sol = new Solution();
        assertEquals("XboX", sol.withoutX("XboX"));
    }

    // fizzString

    @Test
    public void testFizzStringFizz() {
        Solution sol = new Solution();
        assertEquals("Fizz", sol.fizzString("fig"));
    }

    @Test
    public void testFizzStringBuzz() {
        Solution sol = new Solution();
        assertEquals("Buzz", sol.fizzString("dib"));
    }

    @Test
    public void testFizzStringFizzBuzz() {
        Solution sol = new Solution();
        assertEquals("FizzBuzz", sol.fizzString("fib"));
    }

    // Hidden

    @Test
    public void testFizzStringUnchanged() {
        Solution sol = new Solution();
        assertEquals("dog", sol.fizzString("dog"));
    }

    @Test
    public void testFizzStringLongFizzBuzz() {
        // Catches checking "f" before checking both.
        Solution sol = new Solution();
        assertEquals("FizzBuzz", sol.fizzString("football club"));
    }

    @Test
    public void testFizzStringSingleF() {
        Solution sol = new Solution();
        assertEquals("Fizz", sol.fizzString("f"));
    }

    @Test
    public void testFizzStringSingleB() {
        Solution sol = new Solution();
        assertEquals("Buzz", sol.fizzString("b"));
    }

    @Test
    public void testFizzStringCapitalF() {
        // "F" is not "f".
        Solution sol = new Solution();
        assertEquals("Buzz", sol.fizzString("Fab"));
    }

    @Test
    public void testFizzStringBInMiddle() {
        Solution sol = new Solution();
        assertEquals("abc", sol.fizzString("abc"));
    }

    // fizzString2

    @Test
    public void testFizzString2One() {
        Solution sol = new Solution();
        assertEquals("1!", sol.fizzString2(1));
    }

    @Test
    public void testFizzString2Two() {
        Solution sol = new Solution();
        assertEquals("2!", sol.fizzString2(2));
    }

    @Test
    public void testFizzString2Three() {
        Solution sol = new Solution();
        assertEquals("Fizz!", sol.fizzString2(3));
    }

    // Hidden

    @Test
    public void testFizzString2Five() {
        Solution sol = new Solution();
        assertEquals("Buzz!", sol.fizzString2(5));
    }

    @Test
    public void testFizzString2Fifteen() {
        // Catches checking 3 or 5 before checking both.
        Solution sol = new Solution();
        assertEquals("FizzBuzz!", sol.fizzString2(15));
    }

    @Test
    public void testFizzString2Nine() {
        Solution sol = new Solution();
        assertEquals("Fizz!", sol.fizzString2(9));
    }

    @Test
    public void testFizzString2Ten() {
        Solution sol = new Solution();
        assertEquals("Buzz!", sol.fizzString2(10));
    }

    @Test
    public void testFizzString2Thirty() {
        Solution sol = new Solution();
        assertEquals("FizzBuzz!", sol.fizzString2(30));
    }

    @Test
    public void testFizzString2Seven() {
        Solution sol = new Solution();
        assertEquals("7!", sol.fizzString2(7));
    }

    @Test
    public void testFizzString2Large() {
        Solution sol = new Solution();
        assertEquals("101!", sol.fizzString2(101));
    }
}

