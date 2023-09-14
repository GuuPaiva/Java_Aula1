package Controle;

import java.util.Scanner;

public class DoWHile {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String txt = "";

        do {
            System.out.println("Voce precisa falar as palavras magicas");
            System.out.println("Quer sair?");
            txt = entrada.nextLine();
        }while (!txt.equalsIgnoreCase("por favor"));


        System.out.println("Obrigado");
        entrada.close();
    }
}
