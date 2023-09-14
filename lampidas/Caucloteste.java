package lampidas;

public class Caucloteste {
    public static void main(String[] args) {

        Calculo soma = new Soma();
        Calculo multiplicacao = new Multiplicar();



        System.out.println(soma.executar(2, 4));
        System.out.println(multiplicacao.executar(2,4));
    }
}
