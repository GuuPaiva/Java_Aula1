package Controle;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a média: ");
        double media = scanner.nextDouble();

        if(media <= 10 && media >= 7){
            System.out.println("Aprovado");
            System.out.println("Parabéns");
        } else if (media >= 4.5 && media <= 7){
            System.out.println("Recuperação");
            System.out.println("Estude mais");
        } else if (media < 4.5 && media >= 0){
            System.out.println("Reprovado");
        }


        scanner.close();
    }
}
