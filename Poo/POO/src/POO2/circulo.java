/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO2;

import javax.swing.*;

/**
 *
 * @author tigol
 */
public class circulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final double PI=3.14159273269;
        String s;
        double r;
        double perm;
        double area;
         
        s = JOptionPane.showInputDialog(null,"Introduza o raio: ");
        // o valor é lido como uma String
        r = Integer.parseInt(s);
        // a String é convertida para o tipo int
        perm = 2*PI*r;
        area = PI*r*r;
        
        JOptionPane.showMessageDialog(null,"Perimetro:"+perm);
        JOptionPane.showMessageDialog(null,"Área:"+area);
        
    }
    
}
