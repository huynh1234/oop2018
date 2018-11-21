package week11;

public class Task1 {
    public static <T extends Comparable> void sort(T[] a){
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[j].compareTo(a[i])<0){
                    T temp = a[i];
                    a[i]=a[j];
                    a[j]= temp;
                }
            }
        }
    }
    public static <T> void Show(T[] a){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void main (String []args){
        Character []a= {'b','c','d','g','r','t'};
        Double []b={1.2,1.2,3.2,5.3,3.4,4.4,2.6};
        Integer []c={1,4,3,6,7,5,4,6,3,2,3};
        System.out.println("\nchar :");
        sort(a);
        Show(a);
        System.out.println("\ndouble :");
        sort(b);
        Show(b);
        System.out.println("\nint :");
        sort(c);
        Show(c);
    }
}

