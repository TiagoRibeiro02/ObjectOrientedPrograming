/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo5;

/**
 *
 * @author tigol
 */
public class TesteJogador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String conteudoj1, conteudoj2;
        
        
        Jogador j1;
        Jogador j2;
        
        int[] registogolosj1;
        int[] registogolosj2;
        int[] verificacaogolos = new int[34];
        
        j1 = new Jogador("João Baltazar");
        
        j2 = new Jogador("Cristiano Ronaldo", 100.0);
        
        registogolosj1 = new int[34];
        
        for(int i = 0; i < registogolosj1.length; i++){
            if(i == 1)
            registogolosj1[i] =  2;
            else
                if(i == 17){
                    registogolosj1[i] = 1;
                }
            else
                    registogolosj1[i] = 0;
                    
            
        }
        
        j1.setArrayGolos(registogolosj1);
        
        registogolosj2 = new int[34];
        
        for(int i = 0; i < registogolosj1.length; i++){
            if(i == 1)
            registogolosj2[i] =  2;
            else
                if(i == 2){
                    registogolosj2[i] = 5;
                }
            else
                    registogolosj2[i] = 0;
                    
            
        }
        
        j2.setArrayGolos(registogolosj2);
     
        conteudoj1 = j1.toString();
        conteudoj2 = j2.toString();
        System.out.println(conteudoj1);
        System.out.println(conteudoj2);
        
        j2.aumentaSal(30.0);
        double conteudosal = j2.getSalario();
        System.out.println("Sal atual: " + conteudosal);
        int totgolos = j1.totGolos();
        System.out.println("N Total de Golos: " + totgolos);
        
        //int jornada18 = j1.setGolos(18, 17);
        int jornada18 = j1.getGolosJ(18);
        System.out.println(jornada18);

    }
    
}
