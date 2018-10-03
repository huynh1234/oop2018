package week3;
import org.junit.Test;
import static org.junit.Assert.*;
public class Week3Test {

    // TODO: Viết 5 testcase cho phương thức max()
    @Test
    public void testmax() {
        assertEquals(5, week3.max(3, 5));
        assertEquals(6, week3.max(2, 6));
        assertEquals(3, week3.max(1, 3));
        assertEquals(7, week3.max(0, 7));
        assertEquals(1, week3.max(0, 1));
    }

    // TODO: Viết 5 testcase cho phương thức minOfArray()
    @Test
    public void testminOfArray(){
        int[] b={1, 5, 4, 7, 8, 5, 6};
        assertEquals(1, week3.minOfArray(b));
        int[] c={1, 5, 4, 7, 8, 5, 0, -1, -2};
        assertEquals(-2, week3.minOfArray(c));
        int[] d={1, 5, 4, 7, 8, 5, 6, 0};
        assertEquals(0, week3.minOfArray(d));
        int[] e={1, 5, 4, 7, 8, 5, -5};
        assertEquals(-5, week3.minOfArray(e));
        int[] f={1, 5, 4, -10, 7, 8, 5};
        assertEquals(-10, week3.minOfArray(f));
    }


    // TODO: Viết 5 testcase cho phương thức calculateBMI()
    @Test
    public void testmax() {
        assertEquals("Thiếu cân", week3.calculateBMI(10, 2));
        assertEquals("Bình thường", week3.calculateBMI(60, 1.7));
        assertEquals("Thừa cân", week3.calculateBMI(70, 1.7));
        assertEquals("Béo phì", week3.calculateBMI(90, 1.7));
        assertEquals("Bình thường", week3.calculateBMI(48, 1.5));
    }

}
