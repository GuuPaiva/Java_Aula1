package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
    public static void main(String[] args) {

        HashSet conjunto = new HashSet();

        conjunto.add(1.2);
        conjunto.add (false);
        conjunto.add("Teste");
        conjunto.add(1);
        conjunto.add('x');

        System.out.println("tamanho é " + conjunto.size());
        
        conjunto.add("Teste");
        conjunto.remove('x');
        System.out.println("Tamanho é " + conjunto.size());

        Set nums = new HashSet();

        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);
        System.out.println(conjunto);

        conjunto.retainAll(nums);
        System.out.println(conjunto);
    }
}
