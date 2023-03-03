package lab6p2_diegomaradiaga;

import java.util.ArrayList;

public class Playlist {
    private String nombre, creador;
    private int likes;
    private ArrayList <Cancion> listacancionesPlaylist = new ArrayList();
    
    public Playlist() {
    }

    public Playlist(String nombre, int likes) {
        this.nombre = nombre;
        this.likes = likes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public ArrayList<Cancion> getListacancionesPlaylist() {
        return listacancionesPlaylist;
    }

    public void setListacancionesPlaylist(ArrayList<Cancion> listacancionesPlaylist) {
        this.listacancionesPlaylist = listacancionesPlaylist;
    }

    @Override
    public String toString() {
        return nombre ;
    }
    
}
