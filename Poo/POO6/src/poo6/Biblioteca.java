/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo6;
import java.util.ArrayList;
/**
 *
 * @author tigol
 */
public class Biblioteca {
    private String nome;
    private ArrayList<String> titulos;
    
    public Biblioteca(String nome){
        this.nome = nome;
        titulos = new ArrayList<String>();
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setnome(String nome){
       this.nome = nome;
    }
    
    public ArrayList<String> gettitulos(){
        return titulos;
    }
    
    public void settitulos(ArrayList<String> titulos){
        this.titulos = (ArrayList<String>) titulos.clone();
    }
    
    public String toString(){
        String s;
        s = "Nome da Biblioteca: " + nome + "\nTitulos: " + titulos;
        return s;
    }
    
    public boolean equals(Object obj){
        if(obj != null && this.getClass() == obj.getClass()){
            Biblioteca biblio = (Biblioteca) obj;
            boolean ig;
            ig = (this.nome.equals(biblio.nome)) && titulos.equals(biblio.titulos);
            return ig;
        }
        else{
            return false;
        }
            
    }
    
    public Object clone(){
        Biblioteca biblio = new Biblioteca(this.nome);
        biblio.titulos = (ArrayList<String>) this.titulos.clone();
        return biblio;
    }
    
    public boolean verLista(String nomelivro){
        boolean verificacao = false;
        int sair = 0;
        for(int i = 0; i < titulos.size() && sair == 0; i++){
            String titulo;
            titulo = titulos.get(i);
            if (titulo.equals(nomelivro)) {
                verificacao = true;
                sair = 1;
            } else {
                verificacao = false;
            }
        }
        return verificacao;
    }
    
    public ArrayList<String> verPalavra(String palavra){
        ArrayList<String> livro = new ArrayList<String>();
        for (int i = 0; i < titulos.size(); i++) {
            if(titulos.get(i).contains(palavra)){
                livro.add(titulos.get(i));
            }
        }
        return livro;
    }
    
    public void adicionarLivro(String nomeLivro){
        boolean verificacao1;
        verificacao1 = this.verLista(nomeLivro);
        System.out.println(verificacao1);
        if (verificacao1 == false){
            this.titulos.add(nomeLivro);
        }
    }
    
    public void removerLivro(String nomeLivro1){
        for(int i = 0; i < titulos.size(); i++){
            if(titulos.get(i).equals(nomeLivro1)){
                titulos.remove(i);
            }
        }
            
    }
    
    public void removerLivroPosicao(int pos){
        for(int i = 0; i < titulos.size(); i++){
            if(i == pos){
                titulos.remove(i);
            }
        }
    }
}
