package week11;

import java.util.ArrayList;

public class Task2 {
    public static <T extends Comparable> T max(ArrayList<T> a) {
        T Max = a.get(0);
        for (int i = 0; i < a.size(); i++) {
            if (Max.compareTo(a.get(i)) < 0) {
                Max = a.get(i);
            }
        }
        return Max;
    }
    public static void main(String []args){
        ArrayList<Character> Aarray = new ArrayList<Character>();
        Aarray.add('a');
        Aarray.add('d');
        Aarray.add('b');
        Aarray.add('c');
        Aarray.add('f');
        Aarray.add('g');
        Aarray.add(3,'y');
        System.out.println("Max : " + max(Aarray));
        ArrayList<Integer> Barray = new ArrayList<Integer>();
        Barray.add(4);
        Barray.add(6);
        Barray.add(7);
        Barray.add(9);
        Barray.add(10);
        Barray.add(45);
        Barray.add(3,5);
        System.out.println("Max : " + max(Barray));
        ArrayList<Double> Carray = new ArrayList<Double>();
        Carray.add(4.5);
        Carray.add(6.5);
        Carray.add(7.5);
        Carray.add(9.5);
        Carray.add(10.5);
        Carray.add(45.5);
        Carray.add(3,5.5);
        System.out.println("Max : " + max(Carray));

    }
}
