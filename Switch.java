/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VariabelTipeData;

import javax.swing.JOptionPane;

/**
 *
 * @author umum
 */
public class Switch {
    
    static String prodi;
    
    public static void main(String[] args) {
        
    prodi = JOptionPane.showInputDialog("Isikan jurusan");
    
    switch(prodi){
        case "TI" :
            JOptionPane.showMessageDialog(null,"Teknik Informatika");
            break;
        case "TE" :
            JOptionPane.showMessageDialog(null,"Teknik Elektro");
            break;
        case "TM" :
            JOptionPane.showMessageDialog(null,"Teknik Mesin");
            break;
        case "TS":
            JOptionPane.showMessageDialog(null,"Teknik Sipil");
            break;
        default:
            JOptionPane.showMessageDialog(null,"Input Anda Salah, Anda kurang beruntung");
                   
    }
        
        
        
    }
          
}
