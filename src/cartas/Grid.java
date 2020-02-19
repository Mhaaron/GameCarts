/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cartas;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Mercado-Pc
 */
public class Grid extends JFrame{
    JPanel panel= new JPanel();
    ImageIcon img = new ImageIcon("C:\\Users\\Mercado-Pc\\Pictures\\Albums\\The dark side of the moon.jpg");
    ImageIcon img2 = new ImageIcon("C:\\Users\\Mercado-Pc\\Pictures\\Albums\\The wall.jpg");
     int par;
     Icon presionados[];
    public void llenarPanel(){
        Carta arr[]= new Carta[4];
        for (int i = 0; i < arr.length; i++) {
           if (i%2==0){
            arr[i]=new Carta(img, 3);
            panel.add(arr[i].boton);
            arr[i].boton.addActionListener(evento);
        }else{
             arr[i]=new Carta(img2, 0);
            panel.add(arr[i].boton);  
             arr[i].boton.addActionListener(evento);
           }
        }
    }
    
    Grid(){
        setSize(200, 300);
        panel.setLayout(new GridLayout(1, 4, 3, 3));
        llenarPanel();
        add(panel);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
   ActionListener evento = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {             
            if(par==0){
               presionados= new Icon[2]; 
               JButton boton=(JButton) ae.getSource();
                presionados[par]=boton.getIcon();
               // System.out.println(presionados[par].valor);
                par++;
            }else if(par==1){
                JButton boton =(JButton) ae.getSource();
                 presionados[par]=boton.getIcon();
                //  System.out.println(presionados[par].valor);
                 if(presionados[0]==presionados[1]){
                     JOptionPane.showMessageDialog(panel, "PAR");
                 }else{
                     JOptionPane.showMessageDialog(panel, "NO");
                 }
                par=0;
            }             
            
        }
    };
    
    public static void main(String[] args) {
        new Grid();
    }
        
    }