/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cartas;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Mercado-Pc
 */
public class Carta extends JFrame {
    JButton boton;
    int valor;
    
    Carta(ImageIcon img,int a){
        boton=new JButton();
        boton.setIcon(img);
        valor=a;
    }
}
