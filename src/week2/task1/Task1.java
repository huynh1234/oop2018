package week2.task1;

import java.util.Scanner;

public class Task1 {

    public static int gcd(int a, int b) {
        int c=0;    
        for(int i=1;i<=a;i++){
            if(a%i==0&&b%i==0){
                c=i;
            }
        }
        return c;
    }
    
    public static int test(int a){
        return 1;
    }

    public static int fibonacci(int n) {
        // TODO: Tìm số fibonacci ở vị trí n
       if(n==0)
           return 0;
       else if(n==1)
           return 1;
       else
           return (fibonacci(n-1)+fibonacci(n-2));
    }
    
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap A: ");
        a= sc.nextInt();
        System.out.println("nhap B:");
        b= sc.nextInt();     
        
        
        System.out.println("uoc trung lon nhat la: "+ gcd(a,b) );
        System.out.println(fibonacci(a));
    }

    
}
