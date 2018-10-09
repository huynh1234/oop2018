package week4.task1;

public class CamSanh extends CamCaoPhong{
    private double can;
    private String soluong;

    public double getCan() {
        return can;
    }

    public void setCan(double can) {
        this.can = can;
    }

    public String getSoluong() {
        return soluong;
    }

    public void setSoluong(String soluong) {
        this.soluong = soluong;
    }

    public void gioiThieucamsanh(CamCaoPhong c1){
        System.out.println("Ngay nhap" + c1.getNoinhap() + ", So luong nhap: " + getSoluong());
    }
}