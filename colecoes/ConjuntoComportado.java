package colecoes;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ConjuntoComportado {
    public static void main(String[] args) {

        Set<String> Lista = new TreeSet<String>();
        Lista.add("Gustavo");
        Lista.add("Fatima");
        Lista.add("Beatriz");
        Lista.add("Larissa");

        for(String candidatos: Lista){
            System.out.println(candidatos);
        }



    }
}
