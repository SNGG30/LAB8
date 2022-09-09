
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author felip
 */
public class Universo {
    
    private String NombreU;
    private ArrayList<Vivos> Register = new ArrayList();

    public Universo() {
    }
    public Universo(String NombreU) {
        this.NombreU = NombreU;
    }

    
    public String getNombreU() {
        return NombreU;
    }
    public void setNombreU(String NombreU) {
        this.NombreU = NombreU;
    }

    public ArrayList<Vivos> getRegister() {
        return Register;
    }
    public void setRegister(ArrayList<Vivos> Register) {
        this.Register = Register;
    }

    @Override
    public String toString() {
        return "Nombre del universo: " + NombreU;
    }
    
}
