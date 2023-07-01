/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tigol
 */
public class Disciplina {
    
    private int codigo;
    private String nome;
    private String prof;
    
    public Disciplina ( ){
 
        codigo = 0;
        nome =" ";
        prof = " ";
    }
 
    public Disciplina (int codigo, String nome){
        this.codigo = codigo;
        this.nome = nome;
        this.prof = " ";
    }
    
    public void setCodigo(int c){
        codigo = c;
    }
    
    public int getCodigo(){
        return codigo;
    }
    
    public void setNome(String s){
        nome = s;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setProf(String p){
        prof = p;
    }
    
    public String getProf(){
        return prof;
    }
    
    @Override
    public String toString(){
        String s;
        s = ("Nome: " + nome + " Código: " + codigo + " Prof: " + prof);
        return s;
    }
    
    public boolean verifnome(String stringu) {
        return nome.contains(stringu);
    }
    
    public boolean verifnum(int i, int f) {
        if (codigo >= i && codigo < f) {
            return true;
        }
        else {
            return false;
        }
    }

}
