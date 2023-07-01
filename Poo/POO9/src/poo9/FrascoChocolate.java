/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo9;

/**
 *
 * @author tigol
 */
public class FrascoChocolate {
    int capacidade, conteudo;

    public FrascoChocolate(int cap, int cont) {
        capacidade = cap;
        conteudo = cont;
    }
    
    public void retira(int qnt) throws FrascoVazio{
        if(this.conteudo - qnt >= 0){
            conteudo -= qnt;
        }
        else{
            throw new FrascoVazio("OH! OH! guloso, queres demais " + qnt + " " + conteudo);
        }
    }
    
    public void enche(int qnt) throws FrascoCheio{
        if(this.conteudo + qnt < this.capacidade){
            conteudo += qnt;
        }
        else{
            throw new FrascoCheio("OH! OH! já chega, estou de dieta " + qnt + " " + conteudo);
        }
    }
}
