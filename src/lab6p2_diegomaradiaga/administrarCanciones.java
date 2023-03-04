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

public class administrarCanciones {

    private ArrayList<Cancion> listaCancion = new ArrayList();//RAM
    private File archivo = null;//ROM

    public administrarCanciones(String path) {
        archivo = new File(path);
    }

    public File getArchivo() {
        return archivo;
    }
    

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<Cancion> getListaCanciones() {
        return listaCancion;
    }

    public void setListaCanciones(ArrayList<Cancion> listaCancion) {
        this.listaCancion = listaCancion;
    }

    @Override
    public String toString() {
        return "lista Canciones=" + listaCancion;
    }

    //extra mutador
    public void setCancion(Cancion c) {
        this.listaCancion.add(c);
    }

    //metodos de administracion
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Cancion t : listaCancion) {
                bw.write(t.getTitulo()+ ";");
                bw.write(t.getDuracion()+ ";");
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        listaCancion = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    listaCancion.add(new Cancion(sc.next(),sc.nextInt()));
                }
            } catch (Exception ex) {
            }
            sc.close();
        }
    }

}//Fin clase