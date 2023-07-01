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
public class Valores {

    public static void Main(String[] args) {
        int numero;
        int p[] = new int[2];
        double decNum, rD;
        numero = -100000;
        decNum = 12345.6789;
        System.out.println("O valor da variável inteira é: " + numero);
        System.out.println("O valor da variável real é: " + decNum);
        char letra = 'A';
        System.out.println(letra);
        letra = 65;
        System.out.println(letra);
        letra = 97;
        System.out.println(letra);
        double z = -1;
        float x = (float) 12.5, y = 3E30F, zero = 0, rF;
        byte b = (byte) -129, rB;
        short xpto = -130, sht = 9, rS;
        long lng = 0, rL;
        System.out.println(lng);
        rL = lng * 10;
        System.out.println("rL: " + rL);
        rF = lng + 1;
        System.out.println("rF: " + rF);
        rF = (float) (x * y / decNum);
        System.out.println("rF: " + rF);
        rD = x * y / p[1];
        System.out.println("rD: " + rD);
        rF = 0 / 0;
        System.out.println("rF: " + rF);
        rF = sht + b * y * x * lng;
        System.out.println("rF: " + rF);
        rD = -b * (sht + zero + x * lng + y * decNum * -numero / letra);
        System.out.println("rD: " + rD);
        rD  *= 1E269;
        System.out.println("rD: " + rD);
    }
}
