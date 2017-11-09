/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 package javaswing;
  import JavaSwing1.window;
  import javax.swing.JFrame;
/**
 *
 * @author ceduc
 */
public class JavaSwing {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {    
    
         window ventana = new window();
        ventana.setVisible(true);
        ventana.setBounds(0, 0, 600,800);
       
        ventana.setTitle("Mi primer Interfaz Grafica");
        
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}
