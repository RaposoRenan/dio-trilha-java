package main.java.list.OperacoesBasicas.CarrinhoDeCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itemList;
    public CarrinhoDeCompras(){
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        Item item = new Item(nome, preco, quantidade);
        itemList.add(item);
    }

    public void removerItem(String nome){
        List<Item> itemsParaRemover = new ArrayList<>();
        for (Item i : itemList){
            if (i.getNome().equalsIgnoreCase(nome)){
                itemsParaRemover.add(i);
            }
        }
        itemList.removeAll(itemsParaRemover);
    }

    public double calcularValorTotal(){
        double soma = 0d;
        for (Item i : itemList){
            double valorItem = (i.getPreco() * i.getQuantidade());
            soma += valorItem;
        }
        return soma;
    }

    public void exibirItens(){
        System.out.println(itemList);
    }
}



