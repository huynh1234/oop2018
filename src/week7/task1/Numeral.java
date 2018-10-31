package week7.task1;

public class Numeral extends  Expression {
    private int value;
    public void setValue(int val){
        this.value=val;
    }
    public int getValue(){
        return value;
    }
    public Numeral(int val){
        this.value= val;
    }
    public Numeral(){
        value=0;
    }
    public String toString(){
        return value+ " ";
    }
    public int evaluate(){
        return value;
    }
}
