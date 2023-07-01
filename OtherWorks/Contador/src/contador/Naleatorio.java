/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contador;
import myinputs.Ler;
/**
 *
 * @author tigol
 */
public class Naleatorio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int min = -100;
        int max = 100;
        Contador p = new Contador();
        Contador n = new Contador();
        System.out.println("Introduza o Número de valores aleatorios que deseja: ");
        int N = Ler.umInt();
        for(int i = 0; i<N; i++){
            int b = (int)(Math.random()*(max-min+1)+min);
            if (b > 0){
                p.incConta();
            }
            else{
                n.incConta();
            }
        }
        
        System.out.println("Positivo: " +p.getConta());
        System.out.println("Negativo: " +n.getConta());
    }
    
    
}
