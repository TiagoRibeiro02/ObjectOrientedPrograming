package poo7;
import java.util.ArrayList;

/**
 *
 * @author tigol
 */
public class TesteEmp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GerirEmp empresaX = new GerirEmp();
        int opcao = 0;
        String nomemp;
        long nss;
        ArrayList<Empregado> consulta;
        while (opcao != 5) {
            System.out.println("---  Gerenciamento de Empregados  ---\n" + "1- Criar Empregado"
                    + "\n2- Consultar todos os empregados" + "\n3- Modificar um empregado" + "\n4- Apagar um empregado" + "\n5- Terminar");
            opcao = Ler.umInt();
            switch (opcao) {
            }
    
        }
    }
}
