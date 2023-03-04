/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6p2_diegomaradiaga;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class administrarPlaylists{

    private ArrayList<Playlist> listaPlaylist = new ArrayList();//RAM
    private File archivo = null;//ROM

    public administrarPlaylists(String path) {
        archivo = new File(path);
    }

    public File getArchivo() {
        return archivo;
    }
    

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<Playlist> getListaPlaylist() {
        return listaPlaylist;
    }

    public void setListaPlaylist(ArrayList<Playlist> listaPlaylist) {
        this.listaPlaylist = listaPlaylist;
    }

    @Override
    public String toString() {
        return "lista Playlist=" + listaPlaylist;
    }

    //extra mutador
    public void setPersona(Playlist p) {
        this.listaPlaylist.add(p);
    }

    //metodos de administracion
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Playlist t : listaPlaylist) {
                bw.write(t.getNombre()+ ";");
                bw.write(t.getLikes()+ ";");
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        listaPlaylist = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    listaPlaylist.add(new Playlist(sc.next(), sc.nextInt()));
                }
            } catch (Exception ex) {
            }
            sc.close();
        }
    }

}//Fin clase
