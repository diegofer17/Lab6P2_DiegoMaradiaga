package lab6p2_diegomaradiaga;

import java.util.ArrayList;
import java.util.Date;

public class Album extends Lanzamiento{
    private ArrayList <Cancion> listacancionesPlaylist = new ArrayList();
    private int cantidadCanciones;

    public Album() {
        super();
    }

    public Album(String titulo, Date fechaL, int conteolikes) {
        super(titulo, fechaL, conteolikes);
    }

    public ArrayList<Cancion> getListacancionesPlaylist() {
        return listacancionesPlaylist;
    }

    public void setListacancionesPlaylist(ArrayList<Cancion> listacancionesPlaylist) {
        this.listacancionesPlaylist = listacancionesPlaylist;
    }

    public int getCantidadCanciones() {
        return cantidadCanciones;
    }

    public void setCantidadCanciones(int cantidadCanciones) {
        this.cantidadCanciones = cantidadCanciones;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
}
