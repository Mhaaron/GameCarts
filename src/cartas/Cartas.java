/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cartas;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
//import org.jvnet.substance.SubstanceLookAndFeel;

/**
 *
 * @author Mercado-Pc
 */
public class Cartas extends JFrame{

    JPanel Panel = new JPanel();
    
    int itt=30;
    
    JButton[] Botones = new JButton[30];
    JLabel Label = new JLabel("INTENTOS:");
    JLabel LabelS = new JLabel();
    JLabel LabelS1 = new JLabel();
    JLabel LabelS2 = new JLabel();
    JLabel LabelS3 = new JLabel();
    JLabel LabelS4 = new JLabel();
    JLabel ER = new JLabel(""+itt);
    
    int al, al2;
    int c1=0;
    int arr[] = new int[30];
    int arr2[] = new int[30];
    int arrR1[] = new int[30];
    int fin=15;
    
    ImageIcon[] im= new ImageIcon[30];
    String im2[] = new String[15];
    
    
    public Cartas(){
        Cuadros();
        
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(600, 600);
        this.setLocationRelativeTo(null);
        
        /*JFrame.setDefaultLookAndFeelDecorated(true);
        SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.MagmaSkin");*/
        
        
            im2[0]= new String("C:\\Users\\Mercado-Pc\\Pictures\\Albums\\The dark side of the moon.jpg");
            im2[1]= new String("C:\\Users\\Mercado-Pc\\Pictures\\Albums\\A Momentary Lapse of Reason.jpg");
            im2[2]= new String("C:\\Users\\Mercado-Pc\\Pictures\\Albums\\A saucerful of secrets.jpg");
            im2[3]= new String("C:\\Users\\Mercado-Pc\\Pictures\\Albums\\Animals.jpg");
            im2[4]= new String("C:\\Users\\Mercado-Pc\\Pictures\\Albums\\The wall.jpg");
            im2[5]= new String("C:\\Users\\Mercado-Pc\\Pictures\\Albums\\Atom heart mother.jpg");
            im2[6]= new String("C:\\Users\\Mercado-Pc\\Pictures\\Albums\\Delicate sound of thunder.jpg");
            im2[7]= new String("C:\\Users\\Mercado-Pc\\Pictures\\Albums\\Meddle.jpg");
            im2[8]= new String("C:\\Users\\Mercado-Pc\\Pictures\\Albums\\Osbcured by clouds.jpg");
            im2[9]= new String("C:\\Users\\Mercado-Pc\\Pictures\\Albums\\Relics.jpg");
            im2[10]= new String("C:\\Users\\Mercado-Pc\\Pictures\\Albums\\The division bell.jpg");
            im2[11]= new String("C:\\Users\\Mercado-Pc\\Pictures\\Albums\\The endless river.jpg");
            im2[12]= new String("C:\\Users\\Mercado-Pc\\Pictures\\Albums\\The final cut.jpg");
            im2[13]= new String("C:\\Users\\Mercado-Pc\\Pictures\\Albums\\Ummagumma.jpg");
            im2[14]= new String("C:\\Users\\Mercado-Pc\\Pictures\\Albums\\Wish you where here.jpg");
            
        this.setVisible(true);
        
        for(int j=0; j < arr.length;j++){
            arr[j]=j;
            
             }
        
        for(int i=0; i < im2.length;){
            al2=(int) (Math.random()*30);
            if(al2==arr[al2]){
                arr[al2]=-1;
                im[al2]=new ImageIcon(im2[i]);
                arrR1[al2]=i;
            i++;
            }}
        
        for(int i=0; i < im2.length;){
            al2=(int) (Math.random()*30);
            if(al2==arr[al2]){
                arr[al2]=-1;
                im[al2]=new ImageIcon(im2[i]);
                arrR1[al2]=i;
            i++;
            }}
        }
    
    public void Cuadros(){
        Panel.setLayout(new GridLayout(7, 5, 8, 8));
        for(int i=0; i<Botones.length; i++){
            Panel.add(Botones[i]= new JButton());
            Botones[i].addActionListener(Imagenes);
        }
        
        Panel.add(LabelS);
        Panel.add(LabelS1);
        Panel.add(Label);
        Panel.add(ER);
        
        this.getContentPane().add(Panel,BorderLayout.CENTER);
    }
    
    
    
    ActionListener Imagenes = new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent ae) {            
            JButton Boton = (JButton) ae.getSource(); 
            
                  for(int i=0; i < Botones.length;i++){
                    if(Boton==Botones[i]){
                    Botones[i].setIcon(im[i]); 
                    
                    arr2[c1]=i;
                    c1++;
                   
                    }}
                  
                if(c1==3){
                    
                       if(arrR1[arr2[0]]==arrR1[arr2[1]]& arr2[0]!=arr2[1]){
                           for(int l=0; l<2;l++){
                       Botones[arr2[l]].setEnabled(false);
                       }
                           if(arr2[1]!=arr2[2]){
                               Botones[arr2[2]].setIcon(null);
                           }else{
                               Botones[arr2[2]].setEnabled(false);
                           }
                           fin--;
                            
                       }else{
                           
                           for(int y=0; y < 3;y++){
                               Botones[arr2[y]].setIcon(null);
                           }
                           
                           itt--;
                           ER.setText(""+itt);
                           }
                       
                       c1=0;
                }
                
                if(fin==0){
                    JOptionPane.showMessageDialog(null, "¡¡BIEN HECHO CAMPEON!!");
                    setVisible(false);
                }
                if(itt==0){
                    JOptionPane.showMessageDialog(null, "¡¡JAH PERDEDOR!!");
                    setVisible(false);
                }
                
         }
        
        
    };
    
    public static void main(String[] args) {
        Cartas objCartas = new Cartas();
    }
    
}
