package week7.task1;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * Created by CCNE on 31/10/2018.
 */
public class ExpressionTest {
    public static void main(String[] args) {
      //  System.out.println((10 ^ 2 - 1 + 2 * 3) ^ 2);

        Numeral Numera10 = new Numeral(10);
        Numeral Numera2 = new Numeral(2);
        Numeral Numera3 = new Numeral(3);
        Numeral Numera1 = new Numeral(1);
        Numeral Numera0 = new Numeral(0);
        Square Square = new Square(Numera10);
        Subtraction Subtraction = new Subtraction(Square, Numera1);
        Mutiplication Mutiplication = new Mutiplication(Numera2, Numera3);
        Addition add = new Addition(Subtraction, Mutiplication);
        Square Square2 = new Square(add);
        System.out.println(Square2.evaluate());
    }
}
