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

public class administrarUsuarios{

    private ArrayList<Usuarios> listaUsuario = new ArrayList();//RAM
    private File archivo = null;//ROM

    public administrarUsuarios(String path) {
        archivo = new File(path);
    }

    public File getArchivo() {
        return archivo;
    }
    

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<Usuarios> getListaUsuarios() {
        return listaUsuario;
    }

    public void setListaUsuarios(ArrayList<Usuarios> listaUsuarios) {
        this.listaUsuario = listaUsuarios;
    }

    @Override
    public String toString() {
        return "lista Usuarios=" + listaUsuario;
    }

    //extra mutador
    public void setUsuarios(Usuarios u) {
        this.listaUsuario.add(u);
    }

    //metodos de administracion
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Usuarios t : listaUsuario) {
                bw.write(t.getUsername()+ ";");
                bw.write(t.getContra()+ ";");
                bw.write(t.getEdad()+ ";");
                bw.write(t.getTipo()+ ";");
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        listaUsuario = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    listaUsuario.add(new Usuarios(sc.next(), sc.next(), sc.next(), sc.nextInt()));
                }
            } catch (Exception ex) {
            }
            sc.close();
        }
    }

}//Fin clase
