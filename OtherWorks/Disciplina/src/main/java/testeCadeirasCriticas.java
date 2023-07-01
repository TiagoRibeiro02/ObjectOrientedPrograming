


public class testeCadeirasCriticas {
    
    public static void main(String[] args) {
        String conteudoCC1, conteudoCC2, curso;
        
        
        CadeirasCriticas cc1;
        CadeirasCriticas cc2;
        
        Disciplina[] DisciplinasEI;
        Disciplina[] DisciplinasIW;
        
        cc1 = new CadeirasCriticas("Engenharia Informática ");
        cc2 = new CadeirasCriticas("Informática Web ");
        
        DisciplinasEI = new Disciplina[3];
        DisciplinasIW = new Disciplina[3];
        
        DisciplinasEI[0] = new Disciplina(45662, "Probabilidades e Estatistica");
        DisciplinasEI[1] = new Disciplina(47962, "Álgebra");
        DisciplinasEI[2] = new Disciplina(42003, "Programação Funcional");
        
        cc1.setDisciplina(DisciplinasEI);
        
        DisciplinasIW[0] = new Disciplina(30244, "Multimédia");
        DisciplinasIW[1] = new Disciplina(34888, "Redes e Computadores");
        DisciplinasIW[2] = new Disciplina(39786, "Programação Web");
        
        cc2.setDisciplina(DisciplinasIW);
        
        conteudoCC1 = cc1.toString();
        conteudoCC2 = cc2.toString();
        
        System.out.println(conteudoCC1);
        System.out.println(conteudoCC2);
        
        curso = cc1.getCurso();
        System.out.println("cc1 curso: " + curso);
        curso = cc2.getCurso();
        System.out.println("cc2 curso: " + curso);
        
    }
}

