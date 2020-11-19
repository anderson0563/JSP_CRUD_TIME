/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import infra.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Time;

/**
 *
 * @author anderson
 */
public class TimeDAO {

    private Connection banco;
    
    public TimeDAO() throws SQLException {
        banco = (new Conexao(0)).conectarBanco();
    }
    
    public int inserir(Time time) throws SQLException {
        String sql = "INSERT INTO time (`nome`, `atleta`) VALUES (?, ?);";
        
        PreparedStatement comando = banco.prepareStatement(sql);
        comando.setString(1, time.getNome());
        comando.setString(2, time.getAtleta());
        
        int resultado = comando.executeUpdate();
        
        return resultado;
    }
    
    public int remover(Time time) throws SQLException {
        String sql = "DELETE FROM time WHERE nome LIKE ?;";
        
        PreparedStatement comando = banco.prepareStatement(sql);
        comando.setString(1, "%" + time.getNome() + "%");
        
        int resultado = comando.executeUpdate();
        
        return resultado;
    }
    
    public int atualizar(Time time, String atleta) throws SQLException {
        String sql = "UPDATE time SET atleta = ? WHERE nome LIKE ?;";
        
        PreparedStatement comando = banco.prepareStatement(sql);
        comando.setString(1, atleta);
        comando.setString(2, "%" + time.getNome() + "%");
        
        int resultado = comando.executeUpdate();
        
        return resultado;
    }
    
    public ArrayList listar() throws SQLException{
        String sql = "SELECT * FROM time;";
        ArrayList lista = new ArrayList();
        Time time;
        int indice;
        String nome, atleta;
        
        
        PreparedStatement comando = banco.prepareStatement(sql);
        
        ResultSet resultado = comando.executeQuery();
        
        while(resultado.next()){
            indice = resultado.getInt("indice");
            nome = resultado.getString("nome");
            atleta = resultado.getString("atleta");
            
            time = new Time(indice, nome, atleta);
            
            lista.add(time);
        }
        
        return lista;
    }
}
