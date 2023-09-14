package lampidas;

import java.util.function.Predicate;

public class Predicado {
    public static void main(String[] args) {

        Predicate<Produto> itCaro =  prod -> (prod.preco * (1 - prod.desconto)) >= 513;

        Produto produto = new Produto("Placa de Video", 1500.00, 0.41);
        System.out.println(itCaro.test(produto));
    }
}
