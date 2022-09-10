
import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author felip
 */
public class Vivos implements Serializable{
    
    private String Nombre;
    private int ID;
    private int Poder;
    private int Edad;
    private Universo Proce;
    private String Raza;
    
    private static final long SerialVersionUID=888L;

    public Vivos() {
    }
    public Vivos(String Nombre, int ID, int Poder, int Edad, Universo Proce, String Raza) {
        this.Nombre = Nombre;
        this.ID = ID;
        this.Poder = Poder;
        this.Edad = Edad;
        this.Proce = Proce;
        this.Raza = Raza;
    }

    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getID() {
        return ID;
    }
    public void setID(int ID) {
        this.ID = ID;
    }

    public int getPoder() {
        return Poder;
    }
    public void setPoder(int Poder) {
        this.Poder = Poder;
    }

    public int getEdad() {
        return Edad;
    }
    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public Universo getProce() {
        return Proce;
    }
    public void setProce(Universo Proce) {
        this.Proce = Proce;
    }

    public String getRaza() {
        return Raza;
    }
    public void setRaza(String Raza) {
        this.Raza = Raza;
    }

    @Override
    public String toString() {
        return "Nombre: " + Nombre;
    }
    
}
