package week3;

import org.junit.Assert;
import org.junit.Test;

public class Week3Test {

    // TODO: Viết 5 testcase cho phương thức max()
    @Test
    public void testMax(){
        Assert.assertEquals(11,Week3.max(11,-1));
        Assert.assertEquals(6,Week3.max(4,6));
        Assert.assertEquals(7,Week3.max(7,3));
        Assert.assertEquals(10,Week3.max(2,10));
        Assert.assertEquals(0,Week3.max(-3,0));
    }

    // TODO: Viết 5 testcase cho phương thức minOfArray()
    @Test
    public void testMinOfArray(){
        int[] mang1 = {5,5,9,4,-1};
        Assert.assertEquals(-1,Week3.minOfArray(mang1));
        int[] mang2 = {-2,7,9,45,9};
        Assert.assertEquals(-2,Week3.minOfArray(mang2));
        int[] mang3 = {-3,5,0,2,4};
        Assert.assertEquals(-3, Week3.minOfArray(mang3));
        int[] mang4 = {-4,-1,9,5,6};
        Assert.assertEquals(-4,Week3.minOfArray(mang4));
        int[] mang5 = {2,-5,6,11,0};
        Assert.assertEquals(-5,Week3.minOfArray(mang5));
    }

    // TODO: Viết 5 testcase cho phương thức calculateBMI()
    @Test
    public void testCalculateBMI(){
        Assert.assertEquals("Thieu can",Week3.calculateBMI(30,1.3));
        Assert.assertEquals("Binh thuong",Week3.calculateBMI(40,1.4));
        Assert.assertEquals("Binh thuong",Week3.calculateBMI(50,1.5));
        Assert.assertEquals("Thua can",Week3.calculateBMI(60,1.6));
        Assert.assertEquals("Thua can",Week3.calculateBMI(70,1.7));
    }
}
