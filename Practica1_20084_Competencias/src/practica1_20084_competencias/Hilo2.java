/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1_20084_competencias;

import javax.swing.JTextArea;

public class Hilo2 extends Thread{
    private JTextArea area;
    private boolean bandera=false;
    
    public Hilo2(JTextArea area){
        this.area = area;
    }
    

    
    public void run(){
        int i = 0;
        try{
            while(true){
                area.append(i+"\n");
                i++;
                
            }
           
        }catch(Exception e){e.printStackTrace();}
    }
}