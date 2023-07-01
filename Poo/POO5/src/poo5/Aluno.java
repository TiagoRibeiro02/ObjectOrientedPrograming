/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo5;

/**
 *
 * @author tigol
 */
public class Aluno {

    private static int ultimo = 0;
    private int numero;
    private String nome;
    private Disciplina[] lista; // array de objectos do tipo Disciplina (ver FP4, exerc. 1)
    
    public Aluno(String nome){
        numero = ultimo + 1;
        ultimo = numero;
        this.nome = nome;
        lista = new Disciplina[3];
        for(int i = 0; i<3; i++){
            lista[i] = new Disciplina();
        }
    }

    public static int getultimo(){
        return ultimo;
    }
    
    public int getnAluno(){
        return numero;
    }
    
    public String getNome(){
        return nome;
    }
    
    public Disciplina[] getlista(){
        return lista;
    }
    
    public void setultimo(int ultimo){
        Aluno.ultimo = ultimo;
    }
    
    public void setnAluno (int numero){
        this.numero = numero;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setLista(Disciplina[] lista){
        Disciplina Dnula = new Disciplina();
        for(int i = 0; i < lista.length; i++)
            if(lista[i] == null){
                this.lista[i] = Dnula;
            }
            else{
                this.lista[i] = lista[i];
            }
    }
    
    public void adcionarDisciplina(Disciplina d, int p){
        lista[p].setCodigo(d.getCodigo());
        lista[p].setNome(d.getNome());
        lista[p].setProf(d.getProf());
    }
    
    public String toString(){
        String s = "Ultimo: " + ultimo;
        s += "\nNúmero: " + numero + "\nNome do Aluno: "+ nome;
        for(int i = 0; i<3; i++){
            s = s + "\n" + lista[i] + "\n";
        }
        return s;
    }
    
    public boolean vrfDisciplina(int codigo){
        boolean verf = false;
        boolean sair = false;
        int controlo = 0;
        while(controlo < lista.length && sair == false){
            if(lista[controlo].getCodigo() == codigo){
                verf = true;
                sair = true;
            }
            controlo++;
        }
        return verf;
    }

}



