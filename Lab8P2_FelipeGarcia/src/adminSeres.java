
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
public class adminSeres {
    
    private ArrayList<Vivos> listaV = new ArrayList();
    private File general = null;
    
    public adminSeres() {
    }
    public adminSeres(String path) {
        this.general = new File(path);
    }

    public ArrayList<Vivos> getListaV() {
        return listaV;
    }
    public void setListaV(ArrayList<Vivos> listaV) {
        this.listaV = listaV;
    }
 
    public File getGeneral() {
        return general;
    }
    public void setGeneral(File general) {
        this.general = general;
    }

    @Override
    public String toString() {
        return "adminSeres{" + "listaV=" + listaV + ", general=" + general + '}';
    }
    
    public void setSeres(Vivos v){
        this.listaV.add(v);
    }
    
    public void cargarArchivo(){
        try{
            listaV = new ArrayList();
            Vivos temp;
            if(general.exists()){
                FileInputStream entrada = new FileInputStream(general);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                
                try{
                    while ((temp = (Vivos) objeto.readObject()) != null){
                        listaV.add(temp);
                    }
                } catch(EOFException e){
                    
                }
            objeto.close();
            entrada.close();
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
    public void escribirArchivo(){
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        
        try{
            fw = new FileOutputStream(general);
            bw = new ObjectOutputStream(fw);
            for (Vivos t: listaV) {
                bw.writeObject(t);
            }
            bw.flush();
        }catch(Exception ex){
            
        }finally{
            try{
                bw.close();
                fw.close();
            }catch (Exception ex){
                
            }
        }
    }
}
