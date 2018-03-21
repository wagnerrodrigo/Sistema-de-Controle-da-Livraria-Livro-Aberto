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
public class Usuário {
    public String nome;
    private String matricula;
    private String senha;
    
    // Construtor
    public Usuário(String nome, String matricula, String senha) {
        this.nome = nome;
        this.matricula = matricula;
        this.senha = senha;
        
        
        // esta faltando iniciar o objeto com parametros
        
    }
    // metodos get e set

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    // metodos da classes
    
    // metodo de validar senha
    private String validarSenha(String validarSenha){
        return validarSenha;
    }
    // metodo de validar matricula
    private String validarMatricula(String validarMatricula){
        return validarMatricula;
    }
    
    // metodo efetuar login
//    private void efetuarLogin(String validarSenha, String validarMatricula){
//        this.efetuarLogin(validarSenha, validarMatricula);
//    }
}

