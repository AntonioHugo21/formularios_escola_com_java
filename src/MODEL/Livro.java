/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODEL;

import java.util.Date;

/**
 *
 * @author anton
 */
public class Livro {	 
    private int id_livro;
    private String titulo_livro;
    private String autor;
    private String editora;
    private Date ano_publicacao;
    private String isbn;
    private String genero;
    private int quantidade_estoque;
    
    public Livro(int id_livro, String titulo_livro, String autor, String editora, Date ano_publicacao, String isbn, String genero, int quantidade_estoque){
        this.id_livro = id_livro;
        this.titulo_livro = titulo_livro;
        this.autor = autor;
        this.editora = editora;
        this.ano_publicacao = ano_publicacao;
        this.isbn = isbn;
        this.genero = genero;
    }
    
    public Livro(){
        
    }
    
    public int getId_livro() {
        return id_livro;
    }
    
    public void setId_livro(int id_livro) {
        this.id_livro = id_livro;
    }

    public String getTitulo_livro() {
        return titulo_livro;
    }

    public void setTitulo_livro(String titulo_livro) {
        this.titulo_livro = titulo_livro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public Date getAno_publicacao() {
        return ano_publicacao;
    }

    public void setAno_publicacao(Date ano_publicacao) {
        this.ano_publicacao = ano_publicacao;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    public int getQuantidade_estoque() {
        return quantidade_estoque;
    }
    
    public void setQuantidade_estoque(int quantidade_estoque) {
        this.quantidade_estoque = quantidade_estoque;
    }
}
