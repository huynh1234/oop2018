package week3;

public class Week3 {

    public static int max(int m, int n) {
        // TODO: Tìm giá trị lớn nhất của hai số nguyên, giá trị trả về của hàm là số lớn nhất
        if(m>n) return m;
        else return n;
    }

    public static int minOfArray(int[] array) {
        // TODO: Tìm giá trị nhỏ nhất của của một mảng số nguyên (kích thước mảng <= 100 phần tử)

        for(int i =0; i<=array.length; i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]>array[j]){
                    int temp =array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }


        return array[0];
    }

    /**
     * Chương trình tính chỉ số BMI và in ra kết quả đánh giá
     * @param weight cân nặng
     * @param height chiều cao
     * @return Thiếu cân, Bình thường, Thừa cân, Béo phì
     */
    public static String calculateBMI(double weight, double height) {
        // TODO: Viết chương trình tính chỉ số BMI và in ra kết quả đánh giá
        double BMI = weight/(height*height);
        if(BMI < 18.5)
            System.out.println("Thiếu cân");
        else if(BMI >= 18.5 && BMI<=22.99)
            System.out.println("Bình thường");
        else if(BMI >=23 && BMI<=24.99)
            System.out.println("Thừa cân");
        else
            System.out.println("Béo phì");
        return null;
    }
//    public static void main(String [] args){
//        int[] a=new int[5];
//        a[0]=125;
//        a[1]=323;
//        a[2]=12;
//        a[3]=45;
//        a[4]=56;
//            System.out.println(minOfArray(a));
//            calculateBMI(10,20);
//            max(5,6);
//    }

}
