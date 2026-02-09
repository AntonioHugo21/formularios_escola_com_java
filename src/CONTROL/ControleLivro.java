/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONTROL;

import DAO.ConexaoDAO;
import MODEL.Livro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.ResultSet;

/**
 *
 * @author henzo
 */
public class ControleLivro {
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<Livro> lista = new ArrayList<>();
    
    public void cadastrarLivro(Livro objLivro){
        // CORRETO: 7 campos = 7 parâmetros
        String sql = "INSERT INTO livro(titulo_livro, autor, editora, ano_publicacao, isbn, genero, quantidade_estoque) VALUES (?,?,?,?,?,?,?)";
        conn = new ConexaoDAO().conectaBD();
        
        try {
            pstm = conn.prepareStatement(sql);
            
            pstm.setString(1, objLivro.getTitulo_livro());
            pstm.setString(2, objLivro.getAutor());
            pstm.setString(3, objLivro.getEditora());
            pstm.setDate(4, new java.sql.Date(objLivro.getAno_publicacao().getTime()));
            pstm.setString(5, objLivro.getIsbn());
            pstm.setString(6, objLivro.getGenero());
            pstm.setInt(7, objLivro.getQuantidade_estoque()); // AGORA É 7
            
            pstm.execute();
            pstm.close();
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro na classe ControleLivro no método cadastrarLivro: " + erro);
        }
    }
    
    public ArrayList<Livro> consultarLivro(){
        String sql = "SELECT * FROM livro";
        conn = new ConexaoDAO().conectaBD();
        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            while(rs.next()) {
                Livro objLivro = new Livro();
                objLivro.setId_livro(rs.getInt("id_livro"));
                objLivro.setTitulo_livro(rs.getString("titulo_livro"));
                objLivro.setAutor(rs.getString("autor"));
                objLivro.setEditora(rs.getString("editora"));
                objLivro.setAno_publicacao(rs.getDate("ano_publicacao"));
                objLivro.setIsbn(rs.getString("isbn"));
                objLivro.setGenero(rs.getString("genero"));
                objLivro.setQuantidade_estoque(rs.getInt("quantidade_estoque"));
                
                lista.add(objLivro);
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Falha ao Consultar os Livros: " + erro);
        }
        return lista;
    }
    
    public void alterarLivro(Livro objLivro){
        String sql = "UPDATE livro SET titulo_livro = ?, autor = ?, editora = ?, ano_publicacao = ?, isbn = ?, genero = ?, quantidade_estoque = ? WHERE id_livro = ?";
        conn = new ConexaoDAO().conectaBD();
        
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objLivro.getTitulo_livro());
            pstm.setString(2, objLivro.getAutor());
            pstm.setString(3, objLivro.getEditora());
            pstm.setDate(4, new java.sql.Date(objLivro.getAno_publicacao().getTime()));
            pstm.setString(5, objLivro.getIsbn());
            pstm.setString(6, objLivro.getGenero());
            pstm.setInt(7, objLivro.getQuantidade_estoque()); // AGORA É 7
            pstm.setInt(8, objLivro.getId_livro()); // AGORA É 8
            
            pstm.executeUpdate();
            pstm.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro na classe ControleLivro ao alterar os dados do livro: " + erro);
        }
    }
    
    public void excluirLivro(Livro objLivro){
        String sql = "DELETE FROM livro WHERE id_livro = ?";
        conn = new ConexaoDAO().conectaBD();
        
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, objLivro.getId_livro());
            pstm.executeUpdate();
            pstm.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir livro: " + erro);
        }
    }
    
    // Método adicional para consultar livro por título (opcional)
    public ArrayList<Livro> consultarLivroPorTitulo(String titulo){
        String sql = "SELECT * FROM livro WHERE titulo_livro LIKE ?";
        conn = new ConexaoDAO().conectaBD();
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, "%" + titulo + "%");
            rs = pstm.executeQuery();
            
            while(rs.next()) {
                Livro objLivro = new Livro();
                objLivro.setId_livro(rs.getInt("id_livro"));
                objLivro.setTitulo_livro(rs.getString("titulo_livro"));
                objLivro.setAutor(rs.getString("autor"));
                objLivro.setEditora(rs.getString("editora"));
                objLivro.setAno_publicacao(rs.getDate("ano_publicacao"));
                objLivro.setIsbn(rs.getString("isbn"));
                objLivro.setGenero(rs.getString("genero"));
                objLivro.setQuantidade_estoque(rs.getInt("quantidade_estoque"));
                
                lista.add(objLivro);
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Falha ao Consultar Livros por Título: " + erro);
        }
        return lista;
    }
}