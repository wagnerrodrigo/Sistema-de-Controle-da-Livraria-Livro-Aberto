/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import java.util.ArrayList;
import java.util.List;
import model.Cliente;
import model.Livro;
import model.Venda;

/**
 *
 * @author wagner
 */
public class VendaDAO {
    private List<Venda> lista=null;
    
    public VendaDAO(){
        lista = new ArrayList<Venda>();
    }
    
    public void inserirVenda(Venda venda)
    {   
        lista.add(venda);
    }
    public Venda buscarVenda(int codigo)
    {
       Venda v = null;
       for(Venda venda: lista)
       {
           if(venda.getNumero()== codigo)
               v =venda;
       }
       return v;
    }
    
    public void alterarVenda(int numero)
    {   
        Venda venda = buscarVenda(numero);
        if(venda != null)
        {
            int pos = lista.indexOf(venda);
            lista.set(pos,venda);
        }
    }
    
    public List<Venda> todosVenda()
    {   
        return lista;   
    }
    
}
