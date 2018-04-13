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
    
    private List<Cliente> lista = null; // coleções de objetos meu banco de dados
    
    /**
     * Construtor adiciona um objeto na coleção
     * @param lista iniciando minha lista de objtos
     * 
     */
    public ClienteDao(){
        lista = new ArrayList<Cliente>(); // iniciando minha lista de objetos
        
    }
    /**
     * Adiciona um objeto cliente na coleção
     * @param inserirCliente
     * 
     */
    
    public void inserirCliente(Cliente cliente)
    {
        lista.add(cliente);
    }
    
    /**
     * Retorna um objeto cliente da coleção, mediante o cpf informado por parâmetro
     * ou null caso não ache
     * @param buscarCliente
     * @return 
     */
    
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
    
    
    /**
     * procura o clientee pelo Cpf na coleção (lmbrese de usar o método acima )
     * e o remove
     * @param removerCliente 
     */
    public void removerCliente(String cpf)
    {   
        Cliente cli = buscarCliente(cpf);
        if(cli != null)
        {
            lista.remove(cli);
        }
    }
            
    /**
     * retorna a própria coleção de clientes
     * @return 
     */
    public List<Cliente> todosClientes()
    {
        return lista;
    }
    public void atualizarCliente(String cpf)
    {
        Cliente cli = buscarCliente(cpf);
        if(cli !=null)
        {
            int idx = lista.indexOf(cli);
            lista.set(idx, cli);
        }
    }
}
