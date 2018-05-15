/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author wagner
 */
public class Venda {
    private static int numero = 0;
    private Cliente cliente; // agregação
    private List<Item> lista;
    private float valorTotal;
    private Date dataVenda; // SimplesDateFormat com 

    public Venda() {
        numero++;
        lista = new ArrayList<Item>(); // coleção de itens vacio 
        dataVenda = new Date();// a venda ja esta com a dada e a hora porque estou iniciando nesse momento
    }
    
    public void inserirItem(Item item)
    {
        lista.add(item);
    }
    
    public Item buscarItem(int codigo)
    {
        Item it = null;
        for(Item item: lista)
        {   
            if(item.getLivro().getCodigo() == codigo)
                it = item;
        }
        return it;
    }
    public void removerItem(int codigo){
        Item item = buscarItem(codigo);
        if(item != null)
        {
            lista.remove(item);
        }
    }
    
    public float calcularValorToral(){
        float soma = 0;
        for(Item item: lista)  
        {   
            soma += item.getValorItem();
        }
        return soma;
    }
    
    public String toString(){
    String str = "";
    str += cliente.toString();
    str += "\n --------------- \n";
    for(Item item: lista)
    {   
        str += item.toString();
    }
    str += "\n --------------- \n";

    str +="\n Data da Venda = " + dataVenda;
    
    str += "\n --------------- \n";

    str +="\n Valor Total = " + valorTotal;

    return str;
    }

    public static int getNumero() {
        return numero;
    }

    public static void setNumero(int numero) {
        Venda.numero = numero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Item> getLista() {
        return lista;
    }

    public void setLista(List<Item> lista) {
        this.lista = lista;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }
    
    
    
    
}
