package Fundamentos;

import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int f = 32;
        double c = 5.0/9.0;

        int faren = scanner.nextInt();

        double resultado = (faren - f) * c;

        System.out.println(resultado);


    }
}
