/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo6;

/**
 *
 * @author tigol
 */
public class TesteTel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Telefone tel = new Telefone();
        Telefone tel1 = new Telefone();
        Object tel2 = new Object();
        String conteudotel;
        boolean igualdade;
        tel.setnumero(456);
        tel.settipo("João");
        tel1.setnumero(456);
        tel1.settipo("João");
        conteudotel = tel.toString();
        System.out.println(tel);
        System.out.println(tel1);
        igualdade = tel.equals(tel1);
        System.out.println("Igualdade: " + igualdade);
        tel2 = tel1.clone();
        System.out.println(tel2);
    }
    
}
