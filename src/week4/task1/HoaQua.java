package week4.task1;

public class HoaQua {
    private String tenqua;
    private String noinhap;

    public HoaQua(){
        this.tenqua = "";
        this.noinhap = "";
    }

    public HoaQua(String ten, String n){
        this.tenqua = ten;
        this.noinhap = n;
    }

    public String getTenqua() {
        return tenqua;
    }

    public void setTenqua(String tenqua) {
        this.tenqua = tenqua;
    }

    public String getNoinhap() {
        return noinhap;
    }

    public void setNoinhap(String noinhap) {
        this.noinhap = noinhap;
    }
    public boolean soSanhnoi(HoaQua hq1, HoaQua hq2){
        return hq1.getNoinhap() == hq2.getNoinhap();

    }
}