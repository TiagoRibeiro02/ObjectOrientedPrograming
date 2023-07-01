
package disciplina;

import java.util.Objects;


public class Aluno {
    private int num;
    private String nome;
    
    public Aluno(int num, String nome){
        this.nome = nome;
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public String getNome() {
        return nome;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Aluno{" + "num=" + num + ", nome=" + nome + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Aluno other = (Aluno) obj;
        if (this.num != other.num) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return true;
    }
    
    public Object clone(){
        Aluno copia = new Aluno(this.num, this.nome);
        return copia;
    }
    
    
    
    
    

    
    
    
    
}
