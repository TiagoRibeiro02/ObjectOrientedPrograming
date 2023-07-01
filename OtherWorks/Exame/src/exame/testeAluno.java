
package exame2020_2021;
import java.util.ArrayList;

public class testeAluno {
    public static int contAlunos(ArrayList<Pessoa> lista){
        int cont = 0;
        for(int i = 0; i < lista.size(); i++){
            if(lista.get(i) instanceof Aluno){
                if(((Aluno) lista.get(i)).getEscola().equals("UBI")){
                    if(lista.get(i).getContactos().size() > 2){
                        cont++;
                    }
                }
            }
        }
        return cont;
    }
    
    public static void main(String[] args) {
        
    }
}
