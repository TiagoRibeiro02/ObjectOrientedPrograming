
package empregadof08;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        GerenciaEmp empresaX = new GerenciaEmp();
        int opcao = 0;
        String nomemp;
        long nss;
        ArrayList<EmpregadoF08> consulta;

        while (opcao != 5) {
            System.out.println("---  Gerenciamento de Empregados  ---\n" + "1- Criar Empregado"
                    + "\n2- Consultar todos os empregados" + "\n3- Modificar um empregado" + "\n4- Apagar um empregado" + "\n5- Terminar");
            opcao = Ler.umInt();
            switch (opcao) {
                case 1:
                    System.out.println("-- Criação de um Empregado --");
                    System.out.println("\nNome: ");
                    nomemp = Ler.umaString();
                    System.out.println("\nNº Segurança Social: ");
                    nss = Ler.umLong();
                    EmpregadoF08 emp = new EmpregadoF08(nss, nomemp);
                    empresaX.criarEmp(emp);
                    System.out.println(emp + "Adicionado com sucesso!");
                    break;
                case 2:
                    System.out.println("-- Lista de Empregados --");
                    consulta = empresaX.consultarEmp();
                    System.out.println(consulta);
                    break;
                case 3:
                    System.out.println("-- Modificação de Empregado --");
                    System.out.println("\nIntroduza o nome do empregado que deseja modificar: ");
                    nomemp = Ler.umaString();
                    System.out.println("Introduza o novo Nº Segurança Social: ");
                    nss = Ler.umLong();
                    empresaX.modificarEmp(nomemp, nss);
                    System.out.println("Modificação concluida com sucesso!");
                    break;
                case 4:
                    System.out.println("-- Apagar um empregado --");
                    System.out.println("\nIntroduza o nome do empregado que deseja eliminar: ");
                    nomemp = Ler.umaString();
                    empresaX.removerEmp(nomemp);
                    System.out.println("Empregado eliminado com sucesso!");
                    break;

            }

        }
    }

}

