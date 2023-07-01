
package jogadorf08;
import java.util.ArrayList;

public class Equipa {
    private String equipa;
    private ArrayList<JogadorF08> listajogadores;
    
    public Equipa(String nequipa){
        this.equipa = nequipa;
        listajogadores = new ArrayList<JogadorF08>();
    }
    
    public void addNovoJogador(JogadorF08 novojogador){
        this.listajogadores.add(novojogador);
    }
    
    public void removeJogador(int pos){
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
    
    public String melhorMarcador() {
        int maiorngolos = 0;
        String melhormarcador = "";
        for (int i = 0; i < listajogadores.size(); i++) {
            if (i == 1) {
                maiorngolos = listajogadores.get(i).totGolos();
            } else {
                if (maiorngolos < listajogadores.get(i).totGolos()) {
                    melhormarcador = listajogadores.get(i).getNome();
                }
            }
        }
        return melhormarcador;
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
        copia.listajogadores = (ArrayList<JogadorF08>) this.listajogadores.clone();
        return copia;
    }
    
    
    
    
    
}


