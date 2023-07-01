/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contador;

/**
 *
 * @author tigol
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // criar instâncias da classe
        Contador c1, c2;
        c1 = new Contador();
        c2 = new Contador(10);
        // enviar mensagens às instâncias criadas
        
        // obter o valor do contador
        int i1, i2;
        i1 = c1.getConta();
        i2 = c2.getConta();
        
        // verificar os resultados
        System.out.println("c1 = " + i1);
        System.out.println("c2 = " + i2);
        
        // alterar valores
        c1.incConta();
        c2.incConta(10);
        System.out.println("c1 = " + c1.getConta() + "\n" + "c2 = " + c2.getConta() );
        c1.decConta();
        c2.decConta(2);

        // converter para String
        String s = c1.toString();
        System.out.println(s);
        System.out.println(c2.toString());
        System.out.println(c2);
    } // main
} // class TesteContador

