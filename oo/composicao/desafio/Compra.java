package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {

    List<Item> itens = new ArrayList<>();

    void AdicionarItem(Produto p,int quantidade){
        this.itens.add(new Item(p, quantidade));
    }

    double getValorTotal(){
        double total = 0;

        for (Item item: itens) {
            total += item.quantidade * item.produto.preco;

        }
        return total;
    }

}
