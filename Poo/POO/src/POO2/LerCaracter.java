/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO2;

/**
 *
 * @author tigol
 */
public class LerCaracter {
    public static void main(String[]args) throws java.io.IOException//!!!!
    {
        char c; int i;
        System.out.print("Introduza um carácter pelo teclado:");
        i=System.in.read();
        System.out.println("O código ASII do caráter que introduziu é:"+i);
        c=(char)i;
        System.out.println("O caráter que introduziu foi:"+c);
    }
}
