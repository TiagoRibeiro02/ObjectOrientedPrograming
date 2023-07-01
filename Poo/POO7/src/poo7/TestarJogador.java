
package poo7;

/**
 *
 * @author tigol
 */
public class TestarJogador {
    public static void main(String[] args) {
        int numjequipa, numjequipa1;
        boolean pertencej, comparacao;
        String melhormarcador, conteudoeq1, conteudoeq2;
        Object benficaclone;
        
        Equipa benfica = new Equipa("Sport Lisboa e Benfica");
        Equipa sporting = new Equipa("Sporting Clube de Portugal");
        
        Jogador jogador1 = new Jogador("Manel");
        Jogador jogador2 = new Jogador("José");
        Jogador jogador3 = new Jogador("Joaquim");
        Jogador jogador4 = new Jogador("João");
        Jogador jogador5 = new Jogador("Miguel");
        
        int[] registogolosj1;
        registogolosj1 = new int[10];
        registogolosj1[0] = 1;
        registogolosj1[3] = 2;
        registogolosj1[8] = 1;
        jogador1.setArrayGolos(registogolosj1);
        
        int[] registogolosj2;
        registogolosj2 = new int[10];
        registogolosj2[0] = 1;
        registogolosj2[2] = 1;
        registogolosj2[8] = 5;
        jogador2.setArrayGolos(registogolosj2);
        
        int[] registogolosj3;
        registogolosj3 = new int[10];
        registogolosj3[0] = 1;
        registogolosj3[3] = 1;
        registogolosj3[8] = 1;
        jogador3.setArrayGolos(registogolosj3);
        
        int[] registogolosj4;
        registogolosj4 = new int[10];
        registogolosj4[0] = 1;
        registogolosj4[3] = 1;
        registogolosj4[8] = 0;
        jogador4.setArrayGolos(registogolosj4);
        
        int[] registogolosj5;
        registogolosj5 = new int[10];
        registogolosj5[0] = 1;
        registogolosj5[3] = 1;
        registogolosj5[8] = 7;
        jogador5.setArrayGolos(registogolosj5);
        
        //Adicionar Jogadores às equipas
        
        benfica.addJogador(jogador1);
        benfica.addJogador(jogador2);
        sporting.addJogador(jogador3);
        sporting.addJogador(jogador4);
        sporting.addJogador(jogador5);
        
        //System.out.println(benfica + " " + sporting);
        
        // Remover jogador
        
        //sporting.remJogador(1);
        //System.out.println(sporting);
        
        // Número de jogadores da equipa
        numjequipa = benfica.numJogEquipa();
        numjequipa1 = sporting.numJogEquipa();
        //System.out.println(numjequipa + " " + numjequipa1);
        
        // Dado o nome de um jogador, verificar este pertence ou não à equipa
        pertencej = sporting.verifJogador("José");
        //System.out.println(pertencej);
        
        // Devolver o nome do jogador que marcou mais golos no campeonato.
        melhormarcador = sporting.melhorMarcador();
        //System.out.println(melhormarcador);
        
        // ToString
        
        conteudoeq1 = benfica.toString();
        conteudoeq2 = sporting.toString();
        //System.out.println(conteudoeq1+ "  " + conteudoeq2);
        
        // Comparação de dois objetos
        comparacao = benfica.equals(sporting);
        //System.out.println(comparacao);
        
        // Clonagem 
        benficaclone = benfica.clone();
        
        // Comparação
        //System.out.println(benfica + "\n-----\n" + benficaclone);
        comparacao = benfica.equals(benficaclone);
        //System.out.println(comparacao);
    }
    
}
