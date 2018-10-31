package week7.task1;

/**
 * Created by CCNE on 31/10/2018.
 */
public class Mutiplication extends BinaryExpression {
    Expression left;
    Expression right;

    public Mutiplication(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }


    public Expression left() {
        return left;
    }


    public Expression right() {
        return right;
    }


    public String toString() {
        return left.toString() + " * " + right.toString();
    }


    public int evaluate() {
        return left.evaluate() * right.evaluate();
    }
}