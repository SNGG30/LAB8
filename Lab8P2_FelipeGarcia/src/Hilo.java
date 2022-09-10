
import java.util.ArrayList;
import javax.swing.JProgressBar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author felip
 */
public class Hilo extends Thread{
    private JProgressBar barra;
    private ArrayList<Vivos> V = new ArrayList();

    public Hilo(JProgressBar barra, ArrayList<Vivos> V) {
        this.barra = barra;
        barra.setMaximum(V.size());
        this.V = V;
    }
    
    
    
    public void run(){
        for (int i = 0; i < V.size(); i++) {
            try{
                 barra.setValue(barra.getValue() + 1);
            
            Thread.sleep(1000);
            }catch(Exception e){
                
         }
       }
    }
}
