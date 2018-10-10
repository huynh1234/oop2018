package week4.task1;

public class Main {
    public static void main(String[] args) {
        hoaqua Qua=new hoaqua();
        hoaqua Qua1=new hoaqua("Cam Cao phong","Ha Noi",10);
        hoaqua Qua2=new hoaqua("Cam Sanh","Hai Duong",15);
        hoaqua Qua3=new hoaqua("cam","Hai Phong",20);
        hoaqua Qua4=new hoaqua("Tao","Ho Chi Minh",25);
        System.out.println("\n");

        camcaophong camcaophong=new camcaophong();
        camcaophong camcaophong1=new camcaophong("thom");
        camcaophong1.setten("Cao Cao Phong dac san");
        camcaophong1.setmadine("Ha Noi");
        camcaophong1.setsoluong(10);
        camcaophong.camcaophongnhuthenao(camcaophong1);

        System.out.println("\n");
        quatao quatao=new quatao();
        quatao quatao1=new quatao("ngot");
        quatao1.setten("tao do");
        quatao1.setmadine("Ho Chi Minh");
        quatao1.setsoluong(25);
        quatao.quataonhuthenao(quatao1);


    }

}
