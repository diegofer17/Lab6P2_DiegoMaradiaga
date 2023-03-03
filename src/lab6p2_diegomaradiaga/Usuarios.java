package lab6p2_diegomaradiaga;

import java.util.Date;

public class Usuarios {
    protected String username, contra;
    protected int edad;
    
    public Usuarios() {
    }

    public Usuarios(String username, String contra, int edad) {
        this.username = username;
        this.contra = contra;
        this.edad = edad;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Usuario> "+username ;
    }
    
}
