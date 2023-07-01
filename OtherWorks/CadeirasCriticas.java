
package cldisc;


public class CadeirasCriticas {
    private String curso;
    private ClDisc[] disciplinas;
    
    public CadeirasCriticas(String nomecurso){
        this.curso = nomecurso;
        for(int i = 0; i < 3; i++){
            disciplinas[i] = new ClDisc();
        }
    }
    
    public String getCurso(){
        return curso;
    }
    
    public ClDisc[] getDisciplinas(){
        return disciplinas;
    }
    
    public void setCurso(String n){
        this.curso = n;
    }
    
    public void setDisciplina(ClDisc[] disciplinas){
        for(int i = 0; i < 3; i++){
            this.disciplinas[i] = disciplinas[i];
        }
         
    }
    
    public String toString(){
        String s = "Curso: " + curso;
        for(int i = 0; i < 3; i++){
            if (i < 2){
               s += "Disciplina Critica: " + disciplinas[i].toString() + "-----";
            }
            else
                s += "Disciplina: " + disciplinas[i].toString();
        }
        return s;
    }
}
