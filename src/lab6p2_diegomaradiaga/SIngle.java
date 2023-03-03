package lab6p2_diegomaradiaga;

import java.util.Date;

public class SIngle extends Lanzamiento{
    private Cancion CancionS;

    public SIngle() {
        super();
    }

    public SIngle(String titulo, Date fechaL, int conteolikes) {
        super(titulo, fechaL, conteolikes);
    }

    public Cancion getCancionS() {
        return CancionS;
    }

    public void setCancionS(Cancion CancionS) {
        this.CancionS = CancionS;
    }

    @Override
    public String toString() {
        return "SIngle{" + "CancionS=" + CancionS + '}';
    }
    
}
