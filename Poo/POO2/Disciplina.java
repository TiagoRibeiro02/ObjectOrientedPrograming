
package disciplina;


public class Disciplina {
    private int codigo;
    private String designacao;
    private int nota;
    
    public Disciplina(int codigo, String designacao){
        this.codigo = codigo;
        this.designacao = designacao;
        this.nota = 0;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDesignacao() {
        return designacao;
    }

    public int getNota() {
        return nota;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setDesignacao(String designacao) {
        this.designacao = designacao;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Disciplina{" + "codigo=" + codigo + ", designacao=" + designacao + ", nota=" + nota + '}';
    }
    
    public boolean equals(Object obj){
        boolean ig = false;
        if(obj != null && this.getClass() == obj.getClass()){
            Disciplina disc = (Disciplina) obj;
            ig = (this.codigo == disc.codigo) && (this.designacao.equals(disc.designacao) && (this.nota == disc.nota));
        }
        else{
            ig = false;
        }
        return ig;
    }
    
    public Object clone(){
        Disciplina copia = new Disciplina(this.codigo, this.designacao);
        copia.nota = this.nota;
        return copia;
    }
    
    
    
    

    
    
}
