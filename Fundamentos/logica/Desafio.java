package Fundamentos.logica;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero");
        Double num1 = scanner.nextDouble();

        System.out.println("Digite o segundo numero");
        Double num2 = scanner.nextDouble();

        System.out.println("Informe a operação: ");
        String op = scanner.next();

        double resultado = "+".equals(op) ? num1 + num2 :0;
        resultado = "-".equals(op) ? num1 - num2 : resultado;
        resultado = "*".equals(op) ? num1 * num2 : resultado;

        System.out.printf("%.2f %s %.2f = %.2f", num1, op, num2, resultado );




    }
}
