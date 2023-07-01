
package biblioteca;
import java.util.ArrayList;


public class Progbiblioteca {
    
    public static void main(String[] args) {
        Biblioteca b1 = new Biblioteca("Municipal");
        ArrayList <String> livroscomedia = new ArrayList<String>();
        int opcao = 0;
        String novoLivro, removeLivro, pesqLivro;
        Boolean valor;
        ArrayList <String> novalista = new ArrayList<String>();
        
        
        livroscomedia.add("A1");
        livroscomedia.add("B1");
        livroscomedia.add("B2");
        livroscomedia.add("C3");
        livroscomedia.add("A10");
        b1.setTítulos(livroscomedia);
      
        
        
        
        do {
            
            System.out.println("1 – Mostrar livros da biblioteca;\n2 – Adicionar um novo livro\n3 – Remover um livro da biblioteca;\n4 – Pesquisar livro por nome;\n5 – Pesquisar livro por uma palavra contida no título;\n6 – Terminar.");
            opcao = Ler.umInt();
            switch (opcao) {

                case 1:
                    livroscomedia = b1.getTítulos();
                    System.out.println(livroscomedia);
                    break;
                case 2:
                    novoLivro = Ler.umaString();
                    b1.adicionarLivro(novoLivro);
                    novalista = b1.getTítulos();
                    System.out.println(novalista);
                    break;
                case 3:
                    removeLivro = Ler.umaString();
                    b1.removerLivro(removeLivro);
                    novalista = b1.getTítulos();
                    System.out.println(novalista);
                    break;
                case 4:
                    pesqLivro = Ler.umaString();
                    valor = b1.verLista(pesqLivro);
                    System.out.println(valor);
                    break;
                case 5:
                    pesqLivro = Ler.umaString();
                    novalista = b1.verPalavra(pesqLivro);
                    System.out.println(novalista);
                    break;
                case 6:
                    System.out.println("Obrigado pela visita!");
                    break;
                default:
                    System.out.println("Introduza um números válido!");
            }
        } while (opcao != 6);
        
        
     
        
    }
}
