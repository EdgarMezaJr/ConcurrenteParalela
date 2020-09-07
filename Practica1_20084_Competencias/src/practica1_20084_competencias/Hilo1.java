
package practica1_20084_competencias;


import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextArea;

import javax.swing.JTextArea;
public class Hilo1 extends Thread{
    private JTextArea area;
    private boolean pause = false;
    private boolean stop = false;
    
    public Hilo1(JTextArea area){
        this.area = area;
        this.stop = false;
    }
    
    public void parar(){
        this.stop = true; 
    }

    int i = 0;
    public void run(){

            
            while(stop != true){
                area.append(i+"\n");
                i++;
                try {
                    sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Hilo1.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            
    }
        
    
}
