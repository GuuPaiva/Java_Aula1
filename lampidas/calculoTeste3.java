package lampidas;

import java.util.function.BinaryOperator;

public class calculoTeste3 {

    public static void main(String[] args) {

        BinaryOperator<Double> calc = ( x, y) -> {return x + y; };
        System.out.println(calc.apply(2.0 ,2.3));

        calc = (x, y) -> x * y;
        System.out.println(calc.apply(2.5, 3.5));

    }

}
