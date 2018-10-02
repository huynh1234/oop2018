public class Week3 {

    public static int max(int m, int n) {

        if(m>=n) return m;
        else return n;
    }

    public static int minOfArray(int[] array) {

        int min=array[0];
        for(int i=1;i<array.length;i++){
            if(min>array[i]){
                min=array[i];
            }
        }

        return min;
    }

    public static String calculateBMI(double weight, double height) {

        double BMI= (weight/(height*height));
        if(BMI>=0 && BMI< 18.5) return "Thieu can";
        else if(BMI>=18.5 && BMI<23) return "Binh thuong";
        else if(BMI>=23 && BMI<=24.99) return "Thua can";
        else if(BMI>25) return "Beo phi";
	return null;
    }
    public static void main(String[] args){
        int [] mang = new int[5];
         mang[0]=3;
         mang[1]=10;
         mang[2]=1;
         mang[3]=19;
         mang[4]=99;
        System.out.println(max(3,10));
        System.out.println(minOfArray(mang));
        System.out.println(calculateBMI(55,1.69));
    }
}
