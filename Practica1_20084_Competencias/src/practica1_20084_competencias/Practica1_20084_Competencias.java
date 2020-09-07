
package practica1_20084_competencias;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


 

public class Practica1_20084_Competencias extends JFrame{
    
    private JButton bRun, bPause,bStop; 
    private JLabel etiHilo1,etiHilo2;
    private JTextArea areaHilo1, areaHilo2; 
    private JScrollPane jspHilo1, jspHilo2;
   
    
    public Practica1_20084_Competencias(){
       setSize(400,400);
       setTitle("Condiciones de competencias");
       MisComponentes();
    }
    private void MisComponentes(){
    
        
    
        
        bRun = new JButton("Run");
        bPause = new JButton("Pause");
        bStop = new JButton("Stop");
        etiHilo1 = new JLabel("Hilo1");
        etiHilo2 = new JLabel("Hilo2");
        areaHilo1 = new JTextArea();
        areaHilo2 = new JTextArea();
        jspHilo1 = new  JScrollPane(areaHilo1);
        jspHilo2 = new  JScrollPane(areaHilo2);
        
        Hilo1 t1 = new Hilo1(areaHilo1);
        Hilo2 t2 = new Hilo2(areaHilo2);
        
        bRun.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                
               try{ 
                    t1.start();
                } catch (Exception ex) {
                    System.out.println("Reinicia la aplicacion");
                }
            }
        
        });
        
        
        bPause.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                
                         
                Pausa t3 = new Pausa();
                t3.start();
                try {
                    t3.join();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Practica1_20084_Competencias.class.getName()).log(Level.SEVERE, null, ex);
                }
               
            }
        
        });
      
        

                
        bStop.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                t1.parar();
               
            }
        
        });
        
        setLayout(null);
        bRun.setBounds(10,100,100,25);
        bPause.setBounds(10,150,100,25);
        bStop.setBounds(10,200,100,25);
        etiHilo1.setBounds(150,10,100,25);
        etiHilo2.setBounds(250,10,100,25);
        jspHilo1.setBounds(150,50,100,300);
        jspHilo2.setBounds(250,50,100,300);
        
        add(bRun);
        add(bPause);
        add(bStop);
        add(etiHilo1);
        add(etiHilo2);
        add(jspHilo1);
        add(jspHilo2);
        
        
    }
    public static void main(String[] args) {
        
        Practica1_20084_Competencias fr = new Practica1_20084_Competencias();
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}


