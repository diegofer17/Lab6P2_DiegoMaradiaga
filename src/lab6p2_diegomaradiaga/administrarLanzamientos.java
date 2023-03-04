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

public class administrarLanzamientos{

    private ArrayList<Lanzamiento> listaLanzamientos = new ArrayList();//RAM
    private File archivo = null;//ROM

    public administrarLanzamientos(String path) {
        archivo = new File(path);
    }

    public File getArchivo() {
        return archivo;
    }
    

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<Lanzamiento> getListaLanzamiento() {
        return listaLanzamientos;
    }

    public void setListaLanzamiento(ArrayList<Lanzamiento> listaLanzamientos) {
        this.listaLanzamientos = listaLanzamientos;
    }

    @Override
    public String toString() {
        return "lista Lanzamiento=" + listaLanzamientos;
    }

    //extra mutador
    public void setLanzamiento(Lanzamiento l) {
        this.listaLanzamientos.add(l);
    }

    //metodos de administracion
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Lanzamiento t : listaLanzamientos) {
                bw.write(t.getTitulo()+ ";");
                bw.write(t.getFechaL()+ ";");
                bw.write(t.getConteolikes()+ ";");
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        listaLanzamientos = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    listaLanzamientos.add(new Lanzamiento(sc.next(), sc.nextInt()));
                }
            } catch (Exception ex) {
            }
            sc.close();
        }
    }

}//Fin clase
