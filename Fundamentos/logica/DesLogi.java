package Fundamentos.logica;

public class DesLogi {
    public static void main(String[] args) {

        boolean trabalhouQuinta = true;
        boolean trabalhoouTerca = true;

        if (trabalhoouTerca && trabalhouQuinta == true){
            System.out.println("Voce pode comprar a tv de 32 e tomar sorvete");
        } else {
            System.out.println("Voce pode comprar apenas uma tv");
        }
    }
}
