/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package DAO; 
// conexão do sql para o java
import java.sql.Connection; 
// driver de conexão Sql para o java
import java.sql.DriverManager; 
//painel de mensagem
import javax.swing.JOptionPane;
// tratamento de exceções
import java.sql.SQLException; 
/**
 *
 * @author anton
 */
public class ConexaoDAO {
    // metodo público conectaBd ();
    public Connection conectaBD(){
        // Variavel do tipo Connection chamada conn
        Connection conn = null;
        
        try {// try faz a verificação p/ gerar algo
            // 1° parametro refere-se ao drive conexão jdbc:mysql://
            // 2° parametro onde esta nossa base de dados
            // 3° parametro nome da base de dados
            // 4° parametro usuario e a senha de acesso ao banco
            String url = "jdbc:mysql://localhost:3306/eeepaluno?user=root&password=root";
            // Armazenar o drive de gerenciamento na variavel conn
            // conn usando metodo getConnection
            conn = DriverManager.getConnection(url);
            // Classe de exceção
            // catch se não gerar terá exceção, objeto erro
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,"Erro na classe ConexãoDAO" + erro.getMessage());
        }
        return conn;
    }
}
