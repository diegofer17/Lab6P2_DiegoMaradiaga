package lab6p2_diegomaradiaga;

import java.util.Date;

public class Lanzamiento {
    protected String titulo;
    protected Date fechaL;
    protected int conteolikes;

    public Lanzamiento() {
    }

    public Lanzamiento(String titulo, Date fechaL, int conteolikes) {
        this.titulo = titulo;
        this.fechaL = fechaL;
        this.conteolikes = conteolikes;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getFechaL() {
        return fechaL;
    }

    public void setFechaL(Date fechaL) {
        this.fechaL = fechaL;
    }

    public int getConteolikes() {
        return conteolikes;
    }

    public void setConteolikes(int conteolikes) {
        this.conteolikes = conteolikes;
    }

    @Override
    public String toString() {
        return titulo;
    }
    
}
