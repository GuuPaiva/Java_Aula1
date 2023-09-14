package generics;

public class CaixaTeste {
    public static void main(String[] args) {

        CaixaObjeto caixaA = new CaixaObjeto();
        caixaA.aguardar(2.3);


        Double coisa = (Double) caixaA.abrir();
        System.out.println(coisa);
    }
}
