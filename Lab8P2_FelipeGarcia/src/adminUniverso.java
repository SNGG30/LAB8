
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
public class adminUniverso {
    
    private ArrayList<Universo> listaU = new ArrayList();
    private File general = null;

    public adminUniverso() {
    }
    public adminUniverso(String path) {
        this.general = new File(path);
    }

    public ArrayList<Universo> getListaU() {
        return listaU;
    }
    public void setListaU(ArrayList<Universo> listaU) {
        this.listaU = listaU;
    }

    public File getGeneral() {
        return general;
    }
    public void setGeneral(File general) {
        this.general = general;
    }

    @Override
    public String toString() {
        return "adminUniverso{" + "listaU=" + listaU + ", general=" + general + '}';
    }
    
    public void setUniverso(Universo u){
        this.listaU.add(u);
    }
    
    public void cargarArchivo(){
        try{
            listaU = new ArrayList();
            Universo temp;
            if(general.exists()){
                FileInputStream entrada = new FileInputStream(general);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try{
                    while ((temp = (Universo) objeto.readObject()) != null){
                        listaU.add(temp);
                    }
                } catch(EOFException e){
                    
                }
                objeto.close();
                entrada.close();
            }
        } catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
    public void escribirArchivo(){
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        
        try{
            fw = new FileOutputStream(general);
            bw = new ObjectOutputStream(fw);
            for(Universo t: listaU){
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
