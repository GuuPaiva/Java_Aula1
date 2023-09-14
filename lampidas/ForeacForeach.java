package lampidas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForeacForeach {
    public static void main(String[] args) {

        List<String> aprovados = Arrays.asList("Gustavo", "Fatima", "Bruna", "Beatriz", "Richele");

        System.out.println("Forma tradicional...");
        for (String nome: aprovados){
            System.out.println(nome);
        }

        System.out.println("\nLambida #01..." );

        aprovados.forEach((nome) -> {
            System.out.println(nome + "!!!");
        });

        aprovados.forEach(nome -> meuImprimir(nome));
    }


   static void meuImprimir(String nome){
        System.out.println("Olá, meu nome é " + nome);
    }
}
