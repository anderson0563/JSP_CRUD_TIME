/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author anderson
 */
public class Time {
    private int indice;
    private String nome, atleta;

    public Time(String nome, String atleta) {
        this.nome = nome;
        this.atleta = atleta;
    }

    public Time(int indice, String nome, String atleta) {
        this.indice = indice;
        this.nome = nome;
        this.atleta = atleta;
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAtleta() {
        return atleta;
    }

    public void setAtleta(String atleta) {
        this.atleta = atleta;
    }

    @Override
    public String toString() {
        return "Time{" + "indice=" + indice + ", nome=" + nome + ", atleta=" + atleta + '}';
    }
    
    
}
