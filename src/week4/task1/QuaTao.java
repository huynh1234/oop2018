package week4.task1;

public class QuaTao extends HoaQua {
    private int soluong;
    private String mausac;

    public QuaTao(){
        this.mausac = "";
        this.soluong = 0 ;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public String getMausac() {
        return mausac;
    }

    public void setMausac(String mausac) {
        this.mausac = mausac;
    }

    public void gioiThieutao(){
        System.out.println("Tao co rat nhieu loai:");
    }

    public void kiemTraten(HoaQua t1, HoaQua t2){
        if (t1.getTenqua().equals(t2.getTenqua()))
            System.out.println("Cung loai");
        else System.out.println("Khac loai");

    }
}
