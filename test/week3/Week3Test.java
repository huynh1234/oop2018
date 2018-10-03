package week3;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class Week3Test {

    // TODO: Viết 5 testcase cho phương thức max()
    @Test
    public void testMax1(){
        int a=10;
        int b=9;
        int c= Week3.max(a, b);
       assertEquals(c, a);
    }
    @Test
    public void testMax2(){
        int a=7;
        int b=8;
        int c = Week3.max(a, b);

        assertEquals(c, b);
    }
    @Test
    public void testMax3(){
        int a=5;
        int b=6;
        int c = Week3.max(a, b);

        assertEquals(c, b);
    }
    @Test
    public void testMax4(){
        int a=3;
        int b=4;
        int c = Week3.max(a, b);

        assertEquals(c, b);
    }
    @Test
    public void testMax5(){
        int a=2;
        int b=1;
        int c = Week3.max(a, b);

        assertEquals(c, a);
    }
    
    // TODO: Viết 5 testcase cho phương thức minOfArray()
    @Test
    public void testMin0fArray1(){
        int[] mang = new int[100];
        mang[0] = 5;
        mang[1] = 4;
        mang[2] = 3;
        mang[3] = 2;

        int min = Week3.minOfArray(mang);
        assertEquals(min, 2);
    }
    @Test
    public void testMin0fArray2(){
        int[] mang = new int[100];
        mang[0] = 6;
        mang[1] = 10;
        mang[2] = 3;
        mang[3] = 5;

        int min = Week3.minOfArray(mang);
        assertEquals(min, 3);
    }
    @Test
    public void testMin0fArray3(){
        int[] mang = new int[100];
        mang[0] = 9;
        mang[1] = 4;
        mang[2] = 2;
        mang[3] = 10;

        int min = Week3.minOfArray(mang);
        assertEquals(min, 2);
    }
    @Test
    public void testMin0fArray4(){
        int[] mang = new int[100];
        mang[0] = 9;
        mang[1] = 5;
        mang[2] = 2;
        mang[3] = 0;

        int min = Week3.minOfArray(mang);
        assertEquals(min, 0);
    }
    @Test
    public void testMin0fArray5(){
        int[] mang = new int[100];
        mang[0] = 99;
        mang[1] = 11;
        mang[2] = 66;
        mang[3] = 10;

        int min = Week3.minOfArray(mang);
        assertEquals(min, 10);
    }
    // TODO: Viết 5 testcase cho phương thức calculateBMI()
    @Test
    public void testCalculateBMI1(){
        double weight = 30;
        double height = 1.3;
        String BMI = Week3.calculateBMI(weight, height);
        assertEquals(BMI, "Thieu can");
    }
    
    @Test
    public void testCalculateBMI2(){
        double weight = 40;
        double height = 1.4;
        String BMI = Week3.calculateBMI(weight, height);
        assertEquals(BMI, "Binh thuong");
    }
    @Test
    public void testCalculateBMI3(){
        double weight = 50;
        double height = 1.5;
        String BMI = Week3.calculateBMI(weight, height);
        assertEquals(BMI, "Binh thuong");
    }
    @Test
    public void testCalculateBMI4(){
        double weight = 60;
        double height = 1.6;
        String BMI = Week3.calculateBMI(weight, height);
        assertEquals(BMI, "Thua can");
    }
    @Test
    public void testCalculateBMI5(){
        double weight = 70;
        double height = 1.7;
        String BMI = Week3.calculateBMI(weight, height);
        assertEquals(BMI, "Thua can");
    }


}
