package Controle;

import java.util.Objects;
import java.util.Scanner;

public class DesafioEiElse {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o dia desejado: ");
        String DiaSemana = entrada.nextLine();

        if (Objects.equals(DiaSemana, "Domingo")) {
            System.out.println("Dia 1");
        } else if (Objects.equals(DiaSemana, "Segunda")) {
            System.out.println("Dia 2");
        } else if (Objects.equals(DiaSemana, "Terça-Feira")) {
            System.out.println("Dia 3");
        } else if (Objects.equals(DiaSemana, "Quarta-Feira")) {
            System.out.println("Dia 4");
        } else if (Objects.equals(DiaSemana, "Quinta-Feira")) {
            System.out.println("Dia 5");
        } else if (Objects.equals(DiaSemana, "Sexta-Feira")) {
            System.out.println("Dia 6");
        } else if (Objects.equals(DiaSemana, "Sabado")) {
            System.out.println("Dia 7");
        } else {
            System.out.println("ERRO");
        }

    }
}


