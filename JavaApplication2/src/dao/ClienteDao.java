/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import model.Cliente;

/**
 *
 * @author wagner
 */
public class ClienteDao {
    
    private List<Cliente> lista = null;
    
    public ClienteDao(){
        lista = new ArrayList<Cliente>();
        
    }
    
    public void inserirCliente(Cliente cliente)
    {
        lista.add(cliente);
    }
    
    public Cliente buscarCliente(String cpf)
    {
        Cliente cli = null;
        for(int i=0; i< lista.size(); i++){
            if(cpf.equals(lista.get(i).getCpf()))
            {
                cli = lista.get(i);
            }
        }
        return cli;
    } 
}
