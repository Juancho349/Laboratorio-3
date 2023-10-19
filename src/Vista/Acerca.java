/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Controlador.Controladoracerca;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;

/**
 *
 * @author USER
 */
public class Acerca extends JDialog {
    public JButton jbvolver;
    public MenuPrincipal mp;
    public  Acerca(MenuPrincipal obj){
        super(obj, "Acerca de", true);
        this.mp=obj;
        setSize(700, 500);
        setLocationRelativeTo(null);
        setLayout(null);
        crearGUI();
        
        
        setVisible(true);
    }

    private void crearGUI() {
        Controladoracerca btnm = new Controladoracerca(this);
    
        JLabel jlnombre1 = new JLabel("Cristian Martinez tez");
        JLabel jlcodigo1 = new JLabel("2264431");
        jlcodigo1.setBounds(40, 10, 250, 120);
        jlcodigo1.setHorizontalAlignment(JLabel.CENTER);
        jlnombre1.setBounds(40, 10, 250, 90);
        jlnombre1.setHorizontalAlignment(JLabel.LEFT);
        ImageIcon img = new ImageIcon("src/Imagenes/Cm.png");
        jlnombre1.setIcon(img);
        
        add(jlnombre1);
        add(jlcodigo1);
        
        
        JLabel jlnombre2 = new JLabel("Juan José Bedoya");
        JLabel jlcodigo2 = new JLabel("2264364");
        jlcodigo2.setBounds(260, 10, 250, 120);
        jlcodigo2.setHorizontalAlignment(JLabel.CENTER);
        jlnombre2.setBounds(260, 10, 250, 90);
        jlnombre2.setHorizontalAlignment(JLabel.LEFT);
        ImageIcon img1 = new ImageIcon("src/Imagenes/JJ.png");
        jlnombre2.setIcon(img1);
        
        add(jlnombre2);
        add(jlcodigo2);
        
        JLabel jlnombre3 = new JLabel("Nicolas Peña");
        JLabel jlcodigo3 = new JLabel("2264304");
        jlcodigo3.setBounds(490, 10, 250, 120);
        jlcodigo3.setHorizontalAlignment(JLabel.CENTER);
        jlnombre3.setBounds(500, 10, 250, 90);
        jlnombre3.setHorizontalAlignment(JLabel.LEFT);
        ImageIcon img2 = new ImageIcon("src/Imagenes/Nc.png");
        jlnombre3.setIcon(img2);
        
        add(jlnombre3);
        add(jlcodigo3);
        
        jbvolver = new JButton("volver");
        jbvolver.setBounds(250, 110, 200, 30);
        jbvolver.setMnemonic('y');
        jbvolver.addActionListener(btnm);
        
            
        add(jbvolver);
    
        }
        
    }

    
    


