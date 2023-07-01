
package exemplo1;


public class FrascoChocolate {

    int capacidade, conteudo;

    public FrascoChocolate(int cap, int cont) {
        capacidade = cap;
        conteudo = cont;
    }
    
    public void retira(int qtd) throws FrascoVazio{
        if(this.conteudo - qtd >= 0){
            conteudo -= qtd;
        }
        else{
            throw new FrascoVazio("OH! OH! guloso, queres demais "  + qtd + "conteudo" + " " + this.conteudo);
            
        }
    }
    
    public void enche(int qtd) throws FrascoCheio{
        if(qtd + this.conteudo <= this.capacidade){
            this.conteudo += qtd;
        }
        else{
            throw new FrascoCheio("OH! OH! já chega, estou de dieta " + qtd + " " + this.conteudo);
        }
    }
}
