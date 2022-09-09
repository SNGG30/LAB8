/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author felip
 */
public class Vivos {
    
    private String Nombre;
    private long ID;
    private int Poder;
    private int Edad;
    private Universo Proce;
    private String Raza;

    public Vivos() {
    }
    public Vivos(String Nombre, long ID, int Poder, int Edad, Universo Proce, String Raza) {
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

    public long getID() {
        return ID;
    }
    public void setID(long ID) {
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
        return "Vivos{" + "Nombre=" + Nombre + ", ID=" + ID + ", Poder=" + Poder + ", Edad=" + Edad + ", Proce=" + Proce + ", Raza=" + Raza + '}';
    }
    
}
