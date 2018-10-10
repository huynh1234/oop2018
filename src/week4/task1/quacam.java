package week4.task1;

public class quacam extends hoaqua{ // cam cao phong ke thua hoa qua
    private String mui;
    public quacam(){
        this.mui=mui;
    }
    public quacam(String mui){
        this.mui="";
    }
    public String getmui(){
        return mui;
    }
    public void setmui(String mui){
        this.mui=mui;
    }
    public void quacamnhuthenao(camcaophong sc){
        System.out.print("Cam Cao Phong co ten "+ sc.getten());
        System.out.print("Cam Cao Phong nhap tai "+ sc.getmadin());
        System.out.print("so luong Cam Cao Phong  "+ sc.getsoluong());
        System.out.print("Cam Cao Phong co khoi luong "+ sc.getmui());
    }



}


