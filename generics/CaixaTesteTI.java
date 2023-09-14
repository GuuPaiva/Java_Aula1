package generics;

public class CaixaTesteTI {
    public static void main(String[] args) {

        Caixa<String> caixaA = new Caixa<>();
        caixaA.aguardar("Teste segredos...");


        String coisaA = caixaA.abrir();
        System.out.println(coisaA);
    }
}
