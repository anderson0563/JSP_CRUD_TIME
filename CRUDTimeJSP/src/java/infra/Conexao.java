/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infra;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author anderson
 */
public class Conexao {

    private String enderecoServidor, nomeBanco, loginUsuario, senhaUsuario;
    private int portaServidor;

    public Conexao(int status) {
        if (status == 0) {//dev
            this.enderecoServidor = "localhost";
            this.nomeBanco = "futebol";
            this.loginUsuario = "galvaobueno";
            this.senhaUsuario = "ronaldinho";
            this.portaServidor = 3306;
        }
    }

    public Connection conectarBanco() throws SQLException{
        String urlBanco, usuario, senha;
        urlBanco = "jdbc:mysql://" + this.getEnderecoServidor() + ":" +
                this.getPortaServidor() + "/" + this.getNomeBanco();
        usuario = this.getLoginUsuario();
        senha = this.getSenhaUsuario();
        
        return (Connection)DriverManager.getConnection(urlBanco, usuario, senha);
    }
    
    public String getEnderecoServidor() {
        return enderecoServidor;
    }

    public void setEnderecoServidor(String enderecoServidor) {
        this.enderecoServidor = enderecoServidor;
    }

    public String getNomeBanco() {
        return nomeBanco;
    }

    public void setNomeBanco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }

    public String getLoginUsuario() {
        return loginUsuario;
    }

    public void setLoginUsuario(String loginUsuario) {
        this.loginUsuario = loginUsuario;
    }

    public String getSenhaUsuario() {
        return senhaUsuario;
    }

    public void setSenhaUsuario(String senhaUsuario) {
        this.senhaUsuario = senhaUsuario;
    }

    public int getPortaServidor() {
        return portaServidor;
    }

    public void setPortaServidor(int portaServidor) {
        this.portaServidor = portaServidor;
    }
    
}
