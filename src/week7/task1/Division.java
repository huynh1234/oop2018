package week7.task1;

/**
 * Created by CCNE on 31/10/2018.
 */
public class Division extends  BinaryExpression{
    Expression left;
    Expression right;
    public Division(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
    public Expression left(){
        return this.left;
    }
    public Expression  right(){
        return this.right;
    }
    public String toString(){
        return left.toString()+" / "+ right.toString();
    }
    public int evaluate(){
        return left.evaluate()/right.evaluate();
    }

}
