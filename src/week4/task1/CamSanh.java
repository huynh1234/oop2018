package week4.task1;

public class CamSanh extends CamCaoPhong{
    private String soluong;

    public String getSoluong() {
        return soluong;
    }

    public void setSoluong(String soluong) {
        this.soluong = soluong;
    }

    public void gioiThieucamsanh(CamCaoPhong c1){
        System.out.println("Noi nhap" + c1.getNoinhap() + ", So luong nhap: " + getSoluong()
                +", Gia ban: " + c1.getGiaban() + ", Noi ban: " + c1.getNoiban() );
    }
}