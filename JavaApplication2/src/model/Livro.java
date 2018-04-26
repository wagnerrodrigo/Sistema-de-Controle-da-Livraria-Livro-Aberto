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
    public int codigo;
    public String titulo;
    public String fornecedor;
    public int quantidadeEst;
    public float valorUnitario;
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
    public Livro(int codigo, String titulo, String fornecedor, int quantidadeEst, int valorUnitario, String dataPublic) {
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
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
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

    public int getQuantidadeEst() {
        return quantidadeEst;
    }

    public void setQuantidadeEst(int quantidadeEst) {
        this.quantidadeEst = quantidadeEst;
    }

    public float getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(float valorUnitario) {
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
