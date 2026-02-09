/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODEL;

/**
 *
 * @author anton
 */
public class Login {
        private int id_login;
	 
	private String usuario_login;
	 
	private String senha_login;
        // construtor 
        public Login(String usuarioLogin, String senhaLogin){
            this.usuario_login = usuarioLogin;
            this.senha_login = senhaLogin;
        }

    public int getId_login() {
        return id_login;
    }

    /**
     * @param id_login the id_login to set
     */
    public void setId_login(int id_login) {
        this.id_login = id_login;
    }

    /**
     * @return the usuario_login
     */
    public String getUsuario_login() {
        return usuario_login;
    }

    /**
     * @param usuario_login the usuario_login to set
     */
    public void setUsuario_login(String usuario_login) {
        this.usuario_login = usuario_login;
    }

    /**
     * @return the senha_login
     */
    public String getSenha_login() {
        return senha_login;
    }

    /**
     * @param senha_login the senha_login to set
     */
    public void setSenha_login(String senha_login) {
        this.senha_login = senha_login;
    }
        
        
}
