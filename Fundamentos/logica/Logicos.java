package Fundamentos.logica;

import java.util.Scanner;

public class Logicos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Voce trabalhou terça? ");
        boolean trabalhouTerca = scanner.nextBoolean();

        System.out.println("Voce trabalhou quinta? ");
        boolean trablhoQuinta = scanner.nextBoolean();

        if (trabalhouTerca && trablhoQuinta){
            System.out.println("compra a tv de 50");
        } else if (trabalhouTerca || trablhoQuinta) {
            System.out.println("compra a tv de 30");
        }


        scanner.close();
    }
}
