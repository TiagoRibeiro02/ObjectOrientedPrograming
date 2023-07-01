
package disciplina;
import java.util.ArrayList;

public class Teste {
    public static int contALicen(Aluno[] alunos){
        int cont = 0;
        for(int i = 0; i < alunos.length; i++){
            if(alunos[i] instanceof AlunoLicenciatura){
                cont++;
            }
        }
        return cont;
    }
    
    public static int contALLicen(ArrayList<Aluno> alunos){
        int cont = 0;
        for(int i = 0; i < alunos.size(); i++){
            if(alunos.get(i) instanceof AlunoLicenciatura){
                cont++;
            }
        }
        return cont;
    }
    
    public static void main(String[] args) {
        // Variáveis Complementares
        int notapolitica, contador;
        float media;
        
        
        // Alunos
        Aluno aluno1 = new Aluno(45231, "Belmiro Azevedo");
        Aluno aluno2 = new Aluno(42342, "Jorge Sampaio");
        Aluno aluno3 = new Aluno(42111, "António Azevedo");
        
        // Alunos Licenciados
        AlunoLicenciatura alunoL1 = new AlunoLicenciatura(aluno1, "Gestão");
        AlunoLicenciatura alunoL2 = new AlunoLicenciatura(aluno1, "Engenharia Informática");
        
        // Disciplinas
        
        Disciplina d1 = new Disciplina(221, "Matemática");
        d1.setNota(5);
        
        Disciplina d2 = new Disciplina(201, "Geografia");
        d2.setNota(10);
        
        Disciplina d3 = new Disciplina(177, "Programação");
        d3.setNota(15);
        
        Disciplina d4 = new Disciplina(91, "Politica");
        d4.setNota(20);
        
        Disciplina d5 = new Disciplina(11, "Linguas");
        d5.setNota(10);
        
        Disciplina d6 = new Disciplina(625, "Programação Web");
        d6.setNota(20);
        
        
        
        
        ArrayList discGest = new ArrayList<Disciplina>();
        discGest.add(d2);
        discGest.add(d4);
        discGest.add(d5);
        alunoL1.setDisciplinas(discGest);
        
        
        
        ArrayList discEI = new ArrayList<Disciplina>();
        discEI.add(d1);
        discEI.add(d3);
        discEI.add(d6);
        alunoL2.setDisciplinas(discEI);
        
        
        notapolitica = alunoL1.getNotaDisciplina(91);
        System.out.println("Aluno 1 Nota Politica: " + notapolitica);
        
        media = alunoL2.media();
        System.out.println("Aluno2 MÉDIA: " + media);
        
        // Array de objectos do tipo Aluno
        
        Aluno[] arrayAlunos = new Aluno[3];
        arrayAlunos[0] = alunoL1;
        arrayAlunos[1] = alunoL2;
        arrayAlunos[2] = aluno3;
        
        contador = contALicen(arrayAlunos);
        System.out.println();
        System.out.println("Cálculo do número de alunos que são Licenciados: Array - " + contador);
        
        // Array List de objectos do tipo Aluno
        
        ArrayList<Aluno> alunos = new ArrayList<Aluno>();
        alunos.add(alunoL1);
        alunos.add(aluno2);
        alunos.add(aluno3);
        
        contador = contALLicen(alunos);
        System.out.println("Cálculo do número de alunos que são Licenciados: ArrayList - " + contador);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
    
    
}
