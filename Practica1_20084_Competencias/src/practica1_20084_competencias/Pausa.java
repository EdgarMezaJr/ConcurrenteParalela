/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1_20084_competencias;

import java.awt.Component;
import static java.lang.Thread.sleep;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author edgar
 */
public class Pausa  extends Thread{
   private boolean pause=false;
    
    public void Pausa(){
        this.pause=false;
        
    }
   
   public void activar(){
        this.pause=true;
    }
    
     
   @Override
    public void run(){
        int i = 0;
        
        try{
             Scanner respuesta = new Scanner (System.in);
             System.out.println("Deseas salir");
             int res= respuesta.nextInt();
             
             if (res == 0){
                 System.out.println("Saliste");
             }
        }catch(Exception e){}
       
        
    }
}

