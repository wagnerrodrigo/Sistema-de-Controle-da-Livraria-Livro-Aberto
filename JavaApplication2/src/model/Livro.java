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
public class Livro {
    public String codigo;
    public String titulo;
    public String fornecedor;
    public String quantidadeEst;
    public String valorUnitario;
    public String dataPublic;

    /**
     * Construtor vazio
     */
    public Livro() {
    }
    
    /**
     * Construtor com parâmetros
     * @param codigo
     * @param titulo
     * @param fornecedor
     * @param quantidadeEst
     * @param valorUnitario
     * @param dataPublic 
     */
    public Livro(String codigo, String titulo, String fornecedor, String quantidadeEst, String valorUnitario, String dataPublic) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.fornecedor = fornecedor;
        this.quantidadeEst = quantidadeEst;
        this.valorUnitario = valorUnitario;
        this.dataPublic = dataPublic;
    }

    /**
     * métodos get e set
     * @return 
     */
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String getQuantidadeEst() {
        return quantidadeEst;
    }

    public void setQuantidadeEst(String quantidadeEst) {
        this.quantidadeEst = quantidadeEst;
    }

    public String getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(String valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public String getDataPublic() {
        return dataPublic;
    }

    public void setDataPublic(String dataPublic) {
        this.dataPublic = dataPublic;
    }
    
    public String toString(){
        String str = "";
        str = str + "Codigo"+codigo;
        str = str +"Titulo"+titulo;
        str = str +"Fornecedor"+fornecedor;
        str = str +"Quantidade em estoque"+quantidadeEst;
        str = str +"valor unitário"+valorUnitario;
        str = str +"data de publicação"+dataPublic;
        return str;
    }
    
}
