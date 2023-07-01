/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tigol
 */
public class Str {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s = "The competent programmer is fully aware of the limited size of his own skull. He therefore approaches his task with full humility, and avoids clever tricks like the plague.";
        int tamanhostring = s.length();
        System.out.println("tamanho string : " + tamanhostring);
        
        String[] words = s.split(" ");
        int quantpalavras = words.length;
        System.out.println("quantpalavras: " + quantpalavras);
        
      
    }
    
}
