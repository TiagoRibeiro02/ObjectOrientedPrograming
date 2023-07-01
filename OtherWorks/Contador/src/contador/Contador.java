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
public class Contador {

    private int conta;

    public Contador() {
        conta = 0;
    }

    public Contador(int conta) {
        this.conta = conta;
    }

    public int getConta() {
        return conta;
    }

    public void incConta() {
        conta++;
    }

    public void incConta(int inc) {
        conta = conta + inc;
    }

    public void decConta() {
        conta--;
    }

    public void decConta(int dec) {
        conta = conta - dec;
    }

    @Override
    public String toString() {
        return ("Contador: " + conta);
} 
    
}
