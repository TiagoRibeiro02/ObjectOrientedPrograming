/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author tigol
 */
public class POO2 {
    public static void main(String[] args){
        int x;
        int y = 10;
        x = 20;
        int resultado = x + y;
        
        char um = '1';
        char newline = '\n';
        boolean verdade;
        verdade = true;
        float f = 9.1234567f;
        double d = 9.123456789012345;
        
        System.out.format("A soma de %d com %d é: %d%n", x, y, resultado);
        System.out.format("%c  %c", um, newline);
        System.out.println(verdade);
        System.out.println(f);
        System.out.println(d);
    }
}
