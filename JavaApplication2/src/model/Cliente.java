/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import model.Endereco;

/**
 *
 * @author wagner
 */
public class Cliente {
    private String nome;
    private String cpf;
    private String estadoCivil;
    private String telefone;
    private String email;
    private Endereco endereco;

    public Cliente() {
        endereco = new Endereco();
    }

    public Cliente(String nome, String cpf, String estadoCivil, String telefone, String email, Endereco endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.estadoCivil = estadoCivil;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
    }
    public Cliente(Endereco endereco){
        this.endereco = endereco;
    }
    
    // metodos da classe 
    
    public String toString(){
        String str = "";
        str = str +"Nome"+nome;
        str = str +"Cpf"+cpf;
        str = str +"Estado Civil"+estadoCivil;
        str = str +"Telefone"+telefone;
        str = str +"Email"+email;
        str = str +"Endereço"+endereco;
        
        return str;
    }
    
    // metodos get e set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Endereco getEnderco() {
        return endereco;
    }

    public void setEnderco(Endereco endereco) {
        this.endereco = endereco;
    }

    
}
