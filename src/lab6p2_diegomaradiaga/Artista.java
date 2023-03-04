package lab6p2_diegomaradiaga;

import java.util.ArrayList;

public class Artista extends Usuarios{
    private String NameArtistico;
    private ArrayList <Cancion> listacanciones = new ArrayList();
    private ArrayList <Album> listaAlbumes = new ArrayList();

    public Artista() {
        super();
    }

    public Artista(String username, String contra, String tipo, int edad) {
        super(username, contra, tipo, edad);
    }
    
    public String getNameArtistico() {
        return NameArtistico;
    }

    public void setNameArtistico(String NameArtistico) {
        this.NameArtistico = NameArtistico;
    }

    public ArrayList<Cancion> getListacanciones() {
        return listacanciones;
    }

    public void setListacanciones(ArrayList<Cancion> listacanciones) {
        this.listacanciones = listacanciones;
    }

    public ArrayList<Album> getListaAlbumes() {
        return listaAlbumes;
    }

    public void setListaAlbumes(ArrayList<Album> listaAlbumes) {
        this.listaAlbumes = listaAlbumes;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return NameArtistico ;
    }
    
}
