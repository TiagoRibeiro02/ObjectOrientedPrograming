package jogadorf08;


public class JogadorF08 {
    private int numJ;
    private static int ultimo;
    private String nome;
    private double salarioJ;
    private int[] ngolosJ;
    
    public JogadorF08(String nome){
        ultimo++;
        numJ = ultimo;
        this.nome = nome;
        salarioJ = 0.0;
        ngolosJ = new int[34];
        for(int i = 0; i < ngolosJ.length; i++){
            ngolosJ[i] = 0;
        }
    }
    
    public JogadorF08(String nome, double salarioJ){
        ultimo++;
        numJ = ultimo;
        this.nome = nome;
        this.salarioJ = salarioJ;
        ngolosJ = new int[34];
        for(int i = 0; i < ngolosJ.length; i++){
            ngolosJ[i] = 0;
        }
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public double getSalario(){
        return salarioJ;
    }
    
    public void setSalario(double salarioJ){
        this.salarioJ = salarioJ;
    }
    
    public int[] getArrayGolos(){
        return ngolosJ;
    }
    
    public void setArrayGolos(int[] ngolosJ){
        for(int i = 0; i < ngolosJ.length; i++){
            this.ngolosJ[i] = ngolosJ[i];
        }
    }
    
    public void aumentaSal(double percentagem){
        double convpercentagem = percentagem / 100;
        double novosal = salarioJ * convpercentagem + salarioJ;
        salarioJ = novosal;
    }
    
    public void setGolos(int pos, int numgolos){
        for(int i = 0; i < ngolosJ.length; i++){
            if(i == pos){
                ngolosJ[i] = numgolos;
            }
        }
        
    }
    
    public int getGolosJ(int pos){
        return ngolosJ[pos];
    }
    
    public String toString(){
        String s = "\nNúmero: " + numJ + "\nNome: " + nome + "\nSalário: " + salarioJ + "$";
        for(int i = 0; i < ngolosJ.length; i++){
            s += " "+ i + "º Jornada:"+ ngolosJ[i];
        }
        return s;
    }
    
    public int totGolos(){
        int total = 0;
        for(int i = 0; i < ngolosJ.length; i++){
            total += ngolosJ[i];        
        }
        return total;
    }
    
    public boolean equals(Object obj){
        JogadorF08 jogador1 = (JogadorF08) obj;
        boolean ig = false;
        if(obj != null && this.getClass() == jogador1.getClass()){
            ig = (this.numJ == jogador1.numJ) && (this.nome.equals(jogador1.nome) && this.salarioJ == jogador1.salarioJ);
            for(int i = 0; i < ngolosJ.length; i++){
                ig = ig && (this.ngolosJ[i] == jogador1.ngolosJ[i]); 
            }
            return ig;
        }
        return ig;
    }
    
    public Object clone(){
        JogadorF08 copia = new JogadorF08("");
        copia.nome = this.nome;
        copia.numJ = this.numJ;
        copia.salarioJ = this.numJ;
        for(int i = 0; i < this.ngolosJ.length; i++){
            copia.ngolosJ[i] = this.ngolosJ[i];
        }
        return copia;
    }
    
}
