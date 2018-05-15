/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author wagner
 */
public class Item {
    private Livro livro; // agregação
    private int numero;
    private float valorItem;
    private int quantidade;

    public Item() {
    }

    public Item(Livro livro) {
        this.livro = livro;
    }
    public void calcularValorItem(){
        valorItem = livro.getValorUnitario() * quantidade;
    }
    
    public String toString(){
        String str = "";
        str += "\nTitulo do livro:" + livro.getTitulo();
        str += "\nValor unitario" + livro.getValorUnitario();
        str += "\nEm estoque"+ livro.getQuantidadeEst();
        str += "\nQuntidade: "+ quantidade;
        str += "\nvalor do item" + valorItem;
        str += "\n ##################### \n";
        
        return str;

    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public float getValorItem() {
        return valorItem;
    }

    public void setValorItem(float valorItem) {
        this.valorItem = valorItem;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
}
