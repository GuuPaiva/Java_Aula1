package lampidas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {

    public static void main(String[] args) {

        Consumer<Produto> imprimir = p -> System.out.println(p.nome +  "!!!!");
        Produto p1 = new Produto("Papel", 300, 0.21);
        imprimir.accept(p1);

        Produto p2 = new Produto("Caneta", 134, 0.23);
        Produto p3 = new Produto("Lapis", 152, 0.24);
        Produto p4 = new Produto("Apontador", 156, 0.24);
        Produto p5 = new Produto("Borracha", 553, 0.53);

        List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);

        produtos.forEach(imprimir);
        produtos.forEach(p -> System.out.println(p.preco));
    }
}
