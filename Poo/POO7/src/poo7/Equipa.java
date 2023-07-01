package poo7;
import java.util.ArrayList;

/**
 *
 * @author tigol
 */
public class Equipa {
    private String equipa;
    private ArrayList<Jogador> listajogadores;
    
    public Equipa(String nequipa){
        this.equipa = nequipa;
        listajogadores = new ArrayList<Jogador>();
    }
    
    public void addJogador(Jogador novoJogador){
        this.listajogadores.add(novoJogador);
    }
    
    public void remJogador(int pos){
        this.listajogadores.remove(pos);
    }
    
    public int numJogEquipa(){
        int n;
        n = this.listajogadores.size();
        return n;
    }
    
    public boolean verifJogador(String nomej) {
        boolean verif = false;
        for(int i = 0; i <  listajogadores.size(); i++){
            if(this.listajogadores.get(i).getNome() == nomej){
                verif = true;
            }
        }
        return verif;
    }
    
    public String melhorMarcador(){
        int maiornGolos = 0;
        String melhorMarcador = "";
        for (int i = 0; i < listajogadores.size(); i++) {
            if(i == 1){
                maiornGolos = listajogadores.get(i).totGolos();
            }
            else{
                if(maiornGolos < listajogadores.get(i).totGolos()){
                    melhorMarcador = listajogadores.get(i).getNome();
                }
            }    
        }
        return melhorMarcador;
    }
           
    public String toString(){
        String s;
        s = "\nNome da Equipa: " + equipa;
        s += " " + listajogadores;
        return s;
    }
    
    public boolean equals(Object obj){
        Equipa equipa1 = (Equipa) obj;
        boolean ig = false;
        if(obj != null && this.getClass() ==  equipa1.getClass()){
            ig = ((this.equipa.equals(equipa1.equipa)) && (this.listajogadores.equals(equipa1.listajogadores)));
            return ig;
        }
        return ig;
    }
    
    public Object clone(){
        Equipa copia = new Equipa("");
        copia.equipa = this.equipa;
        copia.listajogadores = (ArrayList<Jogador>) this.listajogadores.clone();
        return copia;
    }
}
