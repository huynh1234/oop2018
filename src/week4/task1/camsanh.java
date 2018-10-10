package week4.task1;

public class camsanh extends quacam{ // cam cao phong ke thua hoa qua
    private String muihuong;
    public camsanh(){
        this.muihuong=muihuong;
    }
    public camsanh(String muihuong){
        this.muihuong="";
    }
    public String getmuihuong(){
        return muihuong;
    }
    public void setmuihuong(String muihuong){
        this.muihuong=muihuong;
    }
    public void quacamsanhnhuthenao(camsanh sc){
        System.out.print("Cam Sanh co ten "+ sc.getten());
        System.out.print("Cam Sanh nhap tai "+ sc.getmadin());
        System.out.print("so luong Cam Sanh "+ sc.getsoluong());
        System.out.print(" Cam Sanh co mui "+ sc.getmui());
        System.out.print("Cam Cao Phong co khoi luong "+ sc.getmuihuong());
    }



}

