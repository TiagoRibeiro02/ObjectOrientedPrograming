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
public class Espetaculo {
    
    private String Nome;
    private int capacidade;
    private int espetadores;
    private float custo;
    
    public Espetaculo(String n, int c, int nespect, float cust){
        this.Nome = n;
        this.capacidade = c;
        this.espetadores = nespect;
        this.custo = cust;
    }
    
    public String getNome(){
        return Nome;
    }
    
    public int getcapacidade(){
        return capacidade;
    }
    
    public int getespetadores(){
        return espetadores;
    }
    
    public float getcusto(){
        return custo;
    }
    
    public void setnome(String nom){
        Nome = nom;
    }
    
    public void setcapacidade(int n){
        capacidade += n;
    }
    
    public void setespetadores(int n){
        espetadores = n;
    }
    
    public void setcusto(float n){
        custo = n;
    }
    
    @Override
    public String toString(){
        return("Nome: " + Nome + "\nCapacidade: " + capacidade + "\nNumero de espetadores: " + espetadores + "\ncusto: " + custo);
    }
    
    public void comprarBilhete(){
        if (capacidade > espetadores){
            espetadores += 1;
            System.out.println("Compra de bilhete\n");
            System.out.println("Preço a pagar: " + custo);
            System.out.println("Obrigado!\n");
        }
        else{
            System.out.println("Bilhetes Esgotados");
        }
    }
    
            
    
 
    
}
