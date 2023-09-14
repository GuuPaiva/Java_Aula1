package Controle;

import javax.swing.*;

public class IfElse {
    public static void main(String[] args) {

        String valor = JOptionPane.showInputDialog("Informe um número: ");
        int numero = Integer.parseInt(valor);

        if (numero % 2 == 0){
            System.out.println("Numero Par");
        } else {
            System.out.println("Numero Impar");
        }
    }
}
