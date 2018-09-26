    package week2.task2;


//import java.util.Scanner;

public class Fraction {

    // TODO: khai b�o c�c thu?c t�nh
    private int numerator;
    private int denominator;

    public Fraction() {

    }

    //ham tinh uoc trung lon nhat!
    public static int gcd(int a, int b) {

        int c = 0;
        if(a<0){
            a=-a;
        }
        for (int i = 1; i <= a; i++) {
            if (a % i == 0 && b % i == 0) {
                c = i;
            }
        }
        return c;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public Fraction(int numerator, int denominator) {
        // TODO: kh?i t?o gi� tr? cho c�c thu?c t�nh numberator (t? s?), denominator (m?u s?)
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction add(Fraction other) {
        Fraction res = new Fraction();
        res.numerator = other.denominator * this.numerator + this.denominator * other.numerator;
        res.denominator = this.denominator * other.denominator;
        if (res.numerator != 0) {
            int c = gcd(res.numerator, res.denominator);
            res.denominator = res.denominator / c;
            res.numerator = res.numerator / c;
        }

        // TODO: Ph��ng th?c c?ng hai ph�n2 5 s? (this v� other), tr? v? �?i t�?ng Fraction m?i
        return res;
    }

    public Fraction subtract(Fraction other) {
        // TODO: Ph��ng th?c tr? hai ph�n s? (this v� other), tr? v? �?i t�?ng Fraction m?i
        Fraction res = new Fraction();
        res.numerator = other.denominator * this.numerator - this.denominator * other.numerator;
        res.denominator = this.denominator * other.denominator;
        if (res.numerator != 0) {
            int c = gcd(res.numerator, res.denominator);
            res.denominator = res.denominator / c;
            res.numerator = res.numerator / c;
        }
        return res;
    }

    public Fraction multiply(Fraction other) {
        Fraction res = new Fraction();
        res.denominator = this.denominator * other.denominator;
        res.numerator = this.numerator * other.numerator;
        if (res.numerator != 0) {
            int c = gcd(res.numerator, res.denominator);
            res.denominator = res.denominator / c;
            res.numerator = res.numerator / c;
        }
        // TODO: Ph��ng th?c nh�n hai ph�n s? (this v� other), tr? v? �?i t�?ng Fraction m?i
        return res;
    }

    public Fraction divide(Fraction other) {
        // TODO: Ph��ng th?c chia hai ph�n s? (this v� other), tr? v? �?i t�?ng Fraction m?i
        Fraction res = new Fraction();
        res.denominator = this.denominator * other.numerator;
        res.numerator = this.numerator * other.denominator;
        if (res.numerator != 0) {
            int c = gcd(res.numerator, res.denominator);
            res.denominator = res.denominator / c;
            res.numerator = res.numerator / c;
        }
        return res;
    }

    public boolean equals(Fraction other) {
        Fraction res = new Fraction();
        res.denominator = this.denominator * other.numerator;
        res.numerator = this.numerator * other.denominator;

        if (res.denominator == res.numerator) {
            return true;
        } else {
            return false;

        }

    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
    public static void main(String[] args) {
        Fraction a = new Fraction(2, 5);
        Fraction b= new Fraction(2,5);
        System.out.println("tong hai phan so la :" + a.add(b).toString());
        System.out.println("hieu hai phan so la : " + a.subtract(b).toString());
        System.out.println("tich hai phan so la : " + a.multiply(b).toString());
        System.out.println("thuong hai phan so la : " + a.divide(b).toString());
        if (a.equals(b)) {
            System.out.println("hai phan so bang nhau");
        } else {
            System.out.println("hap phan so khac nhau");
        }
        /*
        Fraction a = new Fraction();//   Fraction b = new Fraction();
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap A: ");
        a.numerator = sc.nextInt();
        a.denominator = sc.nextInt();
        System.out.println("nhap B:");
        b.numerator = sc.nextInt();
        b.denominator = sc.nextInt();
        System.out.println("tong hai phan so la :" + a.add(b).toString());
        System.out.println("hieu hai phan so la : " + a.subtract(b).toString());
        System.out.println("tich hai phan so la : " + a.multiply(b).toString());
        System.out.println("thuong hai phan so la : " + a.divide(b).toString());
        if (a.equals(b)) {
            System.out.println("hai phan so bang nhau");
        } else {
            System.out.println("hap phan so khac nhau");
        }
        */
        }

}
