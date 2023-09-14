package streamns;


import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Mapis {
    public static void main(String[] args) {
        Consumer<String> print = System.out::print;

        List<String> marcas = Arrays.asList("BMW ", "Porshe ","Civic\n");

        marcas.stream().map(m -> m.toUpperCase()).forEach(print);
        marcas.stream().map(m -> m.toLowerCase()).forEach(print);

        UnaryOperator<String> maiuscula = n -> n.toUpperCase();
        UnaryOperator<String> grito = n -> n + "!!!";

    }
}
