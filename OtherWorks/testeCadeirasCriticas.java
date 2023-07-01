
package cldisc;


public class testeCadeirasCriticas {
    
    public static void main(String[] args) {
        String conteudoCC1, conteudoCC2, curso;
        
        
        CadeirasCriticas cc1;
        CadeirasCriticas cc2;
        
        ClDisc[] DisciplinasEI;
        ClDisc[] DisciplinasIW;
        
        cc1 = new CadeirasCriticas("Engenharia Informática");
        cc2 = new CadeirasCriticas("Informática Web");
        
        DisciplinasEI = new ClDisc[3];
        DisciplinasIW = new ClDisc[3];
        
        DisciplinasEI[0] = new ClDisc(45662, "Probabilidades e Estatistica");
        DisciplinasEI[1] = new ClDisc(47962, "Álgebra");
        DisciplinasEI[2] = new ClDisc(42003, "Programação Funcional");
        
        cc1.setDisciplina(DisciplinasEI);
        
        DisciplinasIW[0] = new ClDisc(30244, "Multimédia");
        DisciplinasIW[1] = new ClDisc(34888, "Redes e Computadores");
        DisciplinasIW[2] = new ClDisc(39786, "Programação Web");
        
        cc2.setDisciplina(DisciplinasIW);
        
        conteudoCC1 = cc1.toString();
        conteudoCC2 = cc2.toString();
        
        System.out.println(conteudoCC1);
        System.out.println(conteudoCC2);
        
        curso = cc1.getCurso();
        System.out.println("cc1 curso: " + curso);
        curso = cc2.getCurso();
        System.out.println("cc2 curso: " + curso);
        
        DisciplinasEI[0] = new ClDisc(50789, "Cálculo");
        DisciplinasEI[1] = new ClDisc(55666, "Matemática Discreta");
        DisciplinasEI[2] = new ClDisc(58123, "POO");
        
        DisciplinasEI[1].setProf("Gastão");
        
        cc1.setDisciplina(DisciplinasEI);
        conteudoCC1 = cc1.toString();
        System.out.println(conteudoCC1);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}

