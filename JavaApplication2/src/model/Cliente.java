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
    public String nome;
    public String cpf;
    public String estadoCivil;
    public String telefone;
    public String email;
    public String endereco;

    public Cliente() {
        endereco = new Endereco();
    }

    public Cliente(String nome, String cpf, String estadoCivil, String telefone, String email, String endereco) {
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

    public String getEnderco() {
        return endereco;
    }

    public void setEnderco(String endereco) {
        this.endereco = endereco;
    }

    
}
