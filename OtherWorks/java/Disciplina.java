
package ex1aluno;


public class Disciplina {
    
    private int codigo;
    private String nome;
    private String prof;

    public Disciplina() {
        codigo = 0;
        nome = " ";
        prof = " ";
    }
    
    public Disciplina(int codigo, String nome, String prof) {
        this.codigo = codigo;
        this.nome = nome;
        this.prof = prof;
    }
    
    public String toString() {
        String s;
        s = ("Código: " + codigo + "Nome: " + nome + "Prof: " + prof);
        return s;
    }
    
    public int getCodigo() {
        return codigo;
    }
    
    public String getNome() {
        return nome;
    }
    
    public String getProf() {
        return prof;
    }
    
    public void setCodigo(int c) {
        codigo = c;
    }
    
    public void setNome(String s) {
        nome = s;
    }
    
    public void setProf(String s) {
        prof = s;
    }
    
    public boolean verifnome(String stringu) {
        return nome.contains(stringu);
    }
    
    public boolean verifnum(int i, int f) {
        if (codigo >= i && codigo < f) {
            return true;
        }
        else {
            return false;
        }
    }
    
    
    
}
