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
public class nomeut {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nome;
        String s;
        int i;
        nome = JOptionPane.showInputDialog(null,"Introduza o seu nome"); 
        s = JOptionPane.showInputDialog(null,"Introduza o seu numero: ");
        // o valor é lido como uma String
        i = Integer.parseInt(s);
        // a String é convertida para o tipo int
        JOptionPane.showMessageDialog(null,"Nome:"+nome);
        JOptionPane.showMessageDialog(null,"Numero:"+i);
    }
    
}
