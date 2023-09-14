package lampidas;

import java.util.function.Function;

public class Funcao {
    public static void main(String[] args) {

        Function<Integer, String> parOuImpar = numero -> numero % 2 == 0 ? "Par" : "Impar";

        System.out.println(parOuImpar.apply(33));

        Function<String, String> oResultadoE = valor -> "o resultado é " + valor;

        Function<String, String> empolgado = valor -> valor + "!!!";

        String ResultadoFinal = parOuImpar.andThen(oResultadoE).andThen(empolgado).apply(33);
        System.out.println(ResultadoFinal);

    }
}
