package Fundamentos.logica;

import java.util.Scanner;

public class  Ternario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua nota n1: ");
        String media1 = scanner.nextLine();

        System.out.println("Digite sua nota n2: ");
        String media2 = scanner.nextLine();

        double n1 = Double.parseDouble(media1);
        double n2 = Double.parseDouble(media2);

        double parcial = n1 + n2;
        double media = parcial /2;

        if (media >= 7.0){
            System.out.println("Você está aprovado");
        } else if (media <= 7.0) {
            System.out.println("Você está reprovado");

            scanner.close();

        }
    }
}
