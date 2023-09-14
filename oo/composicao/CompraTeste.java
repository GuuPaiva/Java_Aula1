package oo.composicao;

public class CompraTeste {
    public static void main(String[] args) {

        Compra c1 = new Compra();
        c1.cliente = "Gustavo";
        c1.adicionarItem(new Item("Notebook", 3,4329.02));
        c1.adicionarItem(new Item("Placa de video", 1,14329.02));
        c1.adicionarItem(new Item("Processador", 8,5329.02));

        System.out.println(c1.itens.size());
        System.out.println(c1.getValorTotal());

    }
}