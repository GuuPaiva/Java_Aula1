package Fundamentos.logica;

public class atribuicao {
    public static void main(String[] args) {

        int a = 5;
        int b = a;
        int c = 24;

        b -= c;
        c %= 2;

        System.out.println(c);
    }
}
