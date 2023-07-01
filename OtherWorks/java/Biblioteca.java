
package biblioteca;
import java.util.ArrayList;

public class Biblioteca {
    private String nome;
    private ArrayList<String> títulos;
    
    public Biblioteca(String nome){
        this.nome = nome;
        títulos = new ArrayList<String>();
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public ArrayList<String> getTítulos(){
        return títulos;
    } 
    
    public void setTítulos(ArrayList<String> títulos){
        this.títulos = (ArrayList<String>) títulos.clone();
    }
    
    public String toString(){
        String s;
        s = "Nome da Biblioteca: " + nome + "\nTítulos: " + títulos;
        return s;
    }
    
    
    public boolean equals(Object obj){
        if(obj != null && this.getClass() == obj.getClass()){
            Biblioteca biblio = (Biblioteca) obj;
            boolean ig;
            ig = (this.nome.equals(biblio.nome)&& títulos.equals(biblio.títulos));
            return ig;
        }else{
            return false;
        }
    }
    
    public Object clone(){
        Biblioteca biblio = new Biblioteca(this.nome);
        biblio.títulos = (ArrayList<String>) this.títulos.clone();
        return biblio;
    }
    
    public boolean verLista(String nomelivro){
        boolean verificacao = false;
        int sair = 0;
        for (int i = 0; i < títulos.size() && sair == 0; i++){
            String título;
            título = títulos.get(i);
            if (título.equals(nomelivro)) {
                verificacao = true;
                sair = 1;
            } else {
                verificacao = false;
            }
        }
        
        return verificacao;
    }
    
    public ArrayList<String> verPalavra(String palavra){
        String selecao = "";
        ArrayList<String> livro = new ArrayList<String>();
        for (int i = 0; i < títulos.size(); i++) {
            if(títulos.get(i).contains(palavra)){
                livro.add(títulos.get(i));
            }
        }
        return livro;
    }
    
    public void adicionarLivro(String nomelivro1){
        boolean verificacao1;
        verificacao1 = this.verLista(nomelivro1);
        System.out.println(verificacao1);
        if (verificacao1 == false){
            this.títulos.add(nomelivro1);
        }
    }
    
    public void removerLivro(String nomelivro){
        for (int i = 0; i < títulos.size(); i++) {
            if(títulos.get(i).equals(nomelivro)){
                títulos.remove(i);
            }
        }
        
    }
    
    public void removerLivroPosicao(int pos){
        for(int i = 0; i < títulos.size(); i++){
            if(i == pos){
                títulos.remove(i);
            }
        }
    }
        
       
        
       

       
  
}

