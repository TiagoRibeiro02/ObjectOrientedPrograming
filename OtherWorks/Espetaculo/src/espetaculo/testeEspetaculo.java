/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package espetaculo;



/**
 *
 * @author tigol
 */
public class testeEspetaculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Espetaculo e1 = new Espetaculo("Boas",30,35,6);
        
        e1.setcapacidade(5);
        e1.getcapacidade();
        
        String specs = "";
        specs = e1.toString();
        System.out.println(specs);
        
        e1.comprarBilhete();
        
        
    }
    
}
