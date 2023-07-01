
//package ex1aluno;


public class classex1aluno {
    public static int ultimo = 0;
    private int numero;
    private String nome;
    private Disciplina[] lista;
    
    public classex1aluno(String nome){
        numero = ultimo + 1;
        ultimo = numero;
        this.nome = nome;
        lista = new Disciplina[3];
        for(int i = 0; i < 3; i++){
            lista[i] = new Disciplina();
        }
    }
    
    public static int getUltimo(){
        return ultimo;
    }
    
    public int getnAluno(){
        return numero;
    }
    
    public String getnomeAluno(){
        return nome;
    }
    
    public Disciplina[] getlista(){
        return lista;
    }
    
    public void setUltimo(int ultimo){
        classex1aluno.ultimo = ultimo;
    }
    
    public void setnAluno(int numero){
        this.numero = numero;
    }
    
    public void setnomAluno(String nome){
        this.nome = nome;
    }
    
    public void setLista(Disciplina[] lista){
        Disciplina DNula = new Disciplina();
        for(int i = 0; i < lista.length; i++){
            if(lista[i] == null){
                this.lista[i] = DNula;
            }
            else{
                this.lista[i] = lista[i];
            }
            
        }
    }
    
    public void adcionarDisciplina(Disciplina d, int p){
        lista[p].setCodigo(d.getCodigo());
        lista[p].setNome(d.getNome());
        lista[p].setProf(d.getProf());
    }
    
    public String toString(){
        String s = "Último: " + ultimo;
        s += "\nNúmero: " + numero + "\nNome do Aluno: "+ nome; 
        for(int i = 0; i < 3; i++){
            s = s + "\n"+ lista[i] + "\n";
        }
        return s;
    }
    
    public boolean vrfDisciplina(int codigo){
        boolean verf = false;
        boolean sair = false;
        int controlo = 0;
        while (controlo < lista.length && sair == false){
            if(lista[controlo].getCodigo() == codigo){
                verf = true;
                sair = true;
            }
            controlo++;
        }
        return verf;
    }
    
    
    
    
    
    
    
}
