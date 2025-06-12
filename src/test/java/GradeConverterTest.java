import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.assertEquals;


public class GradeConverterTest {

    private GradeConverter  converter;

    @Before
    public void setUp() throws Exception {
        converter  = new GradeConverter();
    }

    @Test
    public void testConvert1() throws Exception {
        String expected = "A";
        String actual = converter.convert(100);
        assertEquals(expected, actual);
    }

    @Test
    public void testConvert2() throws Exception {
        String expected = "A";
        String actual = converter.convert(90);
        assertEquals(expected,actual);
    }
    @Test
    public void testConvert3() throws Exception {
        String expected = "B";
        String actual = converter.convert(80);
        assertEquals(expected,actual);
    }
    @Test
    public void testConvert4() throws Exception {
        String expected = "C";
        String actual = converter.convert(70);
        assertEquals(expected, actual);
    }
    @Test
    public void testConvert5() throws Exception {
        String expected = "D";
        String actual = converter.convert(60);
        assertEquals(expected,actual);
    }
    @Test
    public void testConvert6() throws Exception {
        String expected = "E";
        String actual = converter.convert(50);
        assertEquals(expected,actual);
    }
    @Test
    public void testConvert7() throws Exception {
        String expected = "Invalid";
        String actual = converter.convert(101);
        assertEquals(expected,actual);
    }
    @Test
    public void testConvert8() throws Exception {
        String expected = "Invalid";
        String actual = converter.convert(-10);
        assertEquals(expected,actual);
    }
    @Test
    public void testConvert9() throws Exception {
        String expected = "Invalid";
        String actual = converter.convert(-5);
        assertEquals(expected, actual);
    }

    // Boundary value tests for grade ranges
    @Test
    public void testConvertBoundary89() throws Exception {
        String expected = "B";
        String actual = converter.convert(89);
        assertEquals(expected, actual);
    }

    @Test
    public void testConvertBoundary79() throws Exception {
        String expected = "C";
        String actual = converter.convert(79);
        assertEquals(expected, actual);
    }

    @Test
    public void testConvertBoundary69() throws Exception {
        String expected = "D";
        String actual = converter.convert(69);
        assertEquals(expected, actual);
    }

    @Test
    public void testConvertBoundary59() throws Exception {
        String expected = "E";
        String actual = converter.convert(59);
        assertEquals(expected, actual);
    }

    @Test
    public void testConvertBoundary0() throws Exception {
        String expected = "E";
        String actual = converter.convert(0);
        assertEquals(expected, actual);
    }

    @Test
    public void testConvertBoundary91() throws Exception {
        String expected = "A";
        String actual = converter.convert(91);
        assertEquals(expected, actual);
    }

    @Test
    public void testConvertBoundary81() throws Exception {
        String expected = "B";
        String actual = converter.convert(81);
        assertEquals(expected, actual);
    }

    @Test
    public void testConvertBoundary71() throws Exception {
        String expected = "C";
        String actual = converter.convert(71);
        assertEquals(expected, actual);
    }

    @Test
    public void testConvertBoundary61() throws Exception {
        String expected = "D";
        String actual = converter.convert(61);
        assertEquals(expected, actual);
    }

    @Test
    public void testConvertBoundary1() throws Exception {
        String expected = "E";
        String actual = converter.convert(1);
        assertEquals(expected, actual);
    }

}
