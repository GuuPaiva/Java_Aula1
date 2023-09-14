package Fundamentos;

public class TipoString {
    public static void main(String[] args) {

        var nome = "Gustavo";
        var sobrenome = "Paiva";
        var idade = 24;
        var salario = 12345.987;
        var casa = "Rua tal de tal";

        System.out.printf("O senhor %s %s tem %d anos e ganha R$%.2f. e mora na %s ", nome, sobrenome, idade, salario, casa);

    }
}
