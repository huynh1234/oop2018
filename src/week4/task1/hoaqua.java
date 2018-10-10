package week4.task1;
public class hoaqua{
    private String ten;
    private String madin;
    private int soluong;

    public hoaqua(){
        this.ten="";
        this.madin="";
        this.soluong=0;
    }
    public hoaqua(String ten,String m,int s){
        this.ten=ten;
        this.madin=m;
        this.soluong=s;
    }
    public String getten(){
             return ten;
         }
    public void setten(String ten){
            this.ten = ten;
     }
    public String getmadin(){
        return madin;
    }
    public void setmadine(String madin){
        this.madin = madin;
    }

    public String getsoluong(){
        return ten;
    }
    public void setsoluong(int  soluong){
        this.soluong = soluong;
    }



}

