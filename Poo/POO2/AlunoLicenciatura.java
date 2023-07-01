
package disciplina;
import java.util.ArrayList;

public class AlunoLicenciatura extends Aluno {
    private String curso;
    private ArrayList <Disciplina> disciplinas;
    
    public AlunoLicenciatura(Aluno aluno, String curso){
        super(aluno.getNum(), aluno.getNome());
        this.curso = curso;
    }
    
    public int getNumsuper() {
        return super.getNum();
    }

    public String getNomesuper() {
        return super.getNome();
    }

    public String getCurso() {
        return curso;
    }
    
    public ArrayList getDisciplinas(){
        return disciplinas;
    }
    
    public void setNumsuper(int num) {
        super.setNum(num);
    }

    public void setNomesuper(String nome) {
        super.setNome(nome);
    }
    
    public void setCurso(String curso){
        this.curso = curso;
    }
    
    public void setDisciplinas(ArrayList<Disciplina> disciplinas){
        this.disciplinas = (ArrayList<Disciplina>) disciplinas.clone();
    }

    public String toString(){
        String s;
        s = super.toString();
        s = s + "Curso: " + curso + "--"+ "Disciplinas: " + disciplinas;
        return s;
    }
    
    public boolean equals(Object obj) {
        boolean ig = false;
        if (obj != null && this.getClass() == obj.getClass()) {
            AlunoLicenciatura al = (AlunoLicenciatura) obj;
            ig = super.equals(obj) && (this.curso.equals(al.curso) && (this.disciplinas.equals(al.disciplinas)));
        } else {
            ig = false;
        }
        return ig;
    }
    
    public Object clone(){
        Aluno copia_a = new Aluno(super.getNum(), super.getNome());
        AlunoLicenciatura copia = new  AlunoLicenciatura(copia_a, this.curso);
        copia.disciplinas = (ArrayList <Disciplina>) this.disciplinas.clone();
        return copia;
    }
    public boolean verfDisc(Disciplina disc){
        boolean verf;
        verf = this.disciplinas.contains(disc);
        return verf;
    }
    public void addDisciplina(Disciplina disc){
        if(verfDisc(disc)){
            System.out.println("Já existe!");
        }
        else{
            this.disciplinas.add(disc);
        }
    }
    
    public int getNotaDisciplina(int codigo){
        int notas = 0;
        for(int i = 0 ; i < disciplinas.size(); i++){
            if(disciplinas.get(i).getCodigo() == codigo){
                 notas = disciplinas.get(i).getNota();
            }
        }
        return notas;
    }
    
    public float media(){
        float media, soma = 0;
        for(int i = 0; i < disciplinas.size(); i++){
             soma += disciplinas.get(i).getNota();
        }
        media = soma / disciplinas.size();
        return media;
    }
            
    
    
    
    

    
    
    
    
    
    
    
    
    
    
}
