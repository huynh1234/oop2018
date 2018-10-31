package week7.task1;

public class Addition extends BinaryExpression {
    Expression left;
    Expression right;
    public Addition(Expression left, Expression right){
            this.left=left;
            this.right=right;
    }
    public Expression left(){
        return this.left;
    }
    public Expression  right(){
        return this.right;
    }
    @Override
    public String toString(){
        return left.toString()+" + "+ right.toString();
    }

    public int evaluate(){
        return left.evaluate()+ right.evaluate();
    }
}
