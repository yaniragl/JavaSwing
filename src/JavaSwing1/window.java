/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaSwing1;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author ceduc
 */
public class window extends JFrame
{
   JPanel panel;
   JLabel label;
   JTextField text;
   JButton boton; 
   JCheckBox verificacion;
   JRadioButton presionar;
   
    public window()
    {
       
     panel =new JPanel();//Creo un objeto tipo JPanel
        panel = new JPanel();
        label = new JLabel();
        text = new JTextField(20);//20 es la cantidad de caracteres
        boton = new JButton();
        verificacion = new JCheckBox();
        presionar= new JRadioButton();
        
        
   }
    

    
        
    }