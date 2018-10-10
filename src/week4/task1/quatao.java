
package week4.task1;

public class quatao extends hoaqua{ // cam cao phong ke thua hoa qua
        private String vi;
    public quatao(){
            this.vi=vi;
        }
    public quatao(String vi){
            this.vi="";
        }
    public String getvi(){
        return vi;
    }
    public void setquatao(String vi){
        this.vi=vi;
    }
    public void quataonhuthenao(quatao sc){
        System.out.print("Qua Tao co ten "+ sc.getten());
        System.out.print("Qua tao nhap tai "+ sc.getmadin());
        System.out.print("khoi luong Tao "+ sc.getsoluong());
        System.out.print("Qua Tao co vi"+ sc.getvi());
    }



}

