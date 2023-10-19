/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Persona;
import Vista.MenuRegistro;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author Estudiante
 */
public class ControlMenuR implements ActionListener{
    MenuRegistro fm;

    
   
    public ControlMenuR(MenuRegistro obj){

        this.fm= obj;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(fm.jbreturnm)){
            volver();
        }
        if(e.getSource().equals(fm.jblimp)){
            limpiar();
            
        }
        if(e.getSource().equals(fm.jbGuardar)){

            guardar();
            int resp = JOptionPane.showConfirmDialog(fm,"Se guardo corretamente.\nDesea Agregar otra persona?  ","confirmacion",  JOptionPane.YES_NO_OPTION);
            if (resp== JOptionPane.YES_OPTION) {
                limpiar();
                
                
            }else{
                volver();
            }

            
        }
    }
    
    private void guardar (){
        FileWriter fw = null;
        boolean error = false;
       
        try {
            fw = new FileWriter(
               "src/personas.csv", true);
        } catch (Exception e) {
            error = true;
            JOptionPane.showMessageDialog(null, 
                e + "\n\nError al tratar de crear/abrir el archivo");            
        }
        if(!error){
            
            String ape = fm.jtApe.getText();
            String nom = fm.jtnam.getText();
            String contra = fm.jtcontra.getText();
            String correo= fm.jtcorreo.getText();
            String genero = fm.jtgenero.getText();
            int edad = Integer.parseInt(fm.jtedad.getText());
            int tlf = Integer.parseInt(fm.tlf.getText());
            int cod = Integer.parseInt(fm.jtCod.getText());
            String cargo = (String) fm.jcargo.getSelectedItem();

            
            try {
                   fw.write(cod + ";" + ape + ";" + nom + ";" + correo + ";" + tlf + ";" + contra + ";" + cargo + ";"+edad+";"+genero+"\r\n");
                    JOptionPane.showMessageDialog(null, 
                        "Se guardo con exito el registro");    
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, 
                       e + "\n\nError al guardar en el archivo"); 
                }
                try {
                    fw.close();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, 
                       e + "\n\nError al cerrar el archivo"); 
                }
            
        }
    }

    private void limpiar() {
        fm.jtApe.setText("");
        fm.jtCod.setText("");
        fm.jtnam.setText("");
        fm.jtcorreo.setText("");
        fm.tlf.setText("");
        fm.jtcontra.setText("");
        fm.jtgenero.setText("");
        fm.jtedad.setText("");
        fm.jcargo.setSelectedItem("Administrador");
        fm.jtApe.requestFocus();
       
    }

    private void volver() {
        fm.setVisible(false);
        fm.dispose();
        fm.mp.setVisible(true); 
    }
   
   }
   
        
    



