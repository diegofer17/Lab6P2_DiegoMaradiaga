package lab6p2_diegomaradiaga;

import java.util.ArrayList;

public class Oyente extends Usuarios{
    private ArrayList <Cancion> listaCancionesfavs = new ArrayList();
    private ArrayList <Playlist> listaPlaylist = new ArrayList();
    private ArrayList <Playlist> listaPlaylistfavs = new ArrayList();

    public Oyente() {
        super();
    }

    public Oyente(String username, String contra, int edad) {
        super(username, contra, edad);
    }

    public ArrayList<Cancion> getListaCancionesfavs() {
        return listaCancionesfavs;
    }

    public void setListaCancionesfavs(ArrayList<Cancion> listaCancionesfavs) {
        this.listaCancionesfavs = listaCancionesfavs;
    }

    public ArrayList<Playlist> getListaPlaylist() {
        return listaPlaylist;
    }

    public void setListaPlaylist(ArrayList<Playlist> listaPlaylist) {
        this.listaPlaylist = listaPlaylist;
    }

    public ArrayList<Playlist> getListaPlaylistfavs() {
        return listaPlaylistfavs;
    }

    public void setListaPlaylistfavs(ArrayList<Playlist> listaPlaylistfavs) {
        this.listaPlaylistfavs = listaPlaylistfavs;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
}
