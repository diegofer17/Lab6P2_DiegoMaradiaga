package lab6p2_diegomaradiaga;

import java.util.Date;

public class Usuarios {
    protected String username, contra, tipo;
    protected int edad;
    
    public Usuarios() {
    }

    public Usuarios(String username, String contra, String tipo, int edad) {
        this.username = username;
        this.contra = contra;
        this.tipo = tipo;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Usuario> "+username ;
    }
    
}
