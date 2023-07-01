public class CadeirasCriticas {
    private String curso;
    private Disciplina[] disciplinas;
    
    
    public CadeirasCriticas(String nomecurso){
        curso = nomecurso;
        disciplinas = new Disciplina[3]; 
        for(int i = 0; i < 3; i++){
            disciplinas[i] = new Disciplina();
        }
    }
    
    public String getCurso(){
        return curso;
    }
    
    public Disciplina[] getDisciplinas(){
        return disciplinas;
    }
    
    public void setCurso(String n){
        curso = n;
    }
    
    /**
     *
     * @param disciplinas
     */
    
    public void setDisciplina(Disciplina[] disciplinas){
        for(int i = 0; i < 3; i++){
            this.disciplinas[i] = disciplinas[i];
        }
         
    }
    
    
    @Override
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
