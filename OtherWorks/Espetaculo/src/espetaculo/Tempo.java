/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package espetaculo;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.Month;

/**
 *
 * @author tigol
 */
public class Tempo {

    private static final String[] saudacoes = {"Bom dia", "Boa tarde", "Boa noite"};
    private static final String nome = "Tiago";
    private static int horas;
    private static int minutos;
    private static int dia;
    private static int mes;
    private static int ano;
    private static Month mesestenco;
    private static String msh;
    private static String msm;
    private static int diasSem;
    private static int daf;
    private static int teste;
    private static int dayOfMonth;
    
    //public static LocalDateTime of(dayOfMonth);
    
    

    public static void getHoras() {
        LocalDateTime dataComputador = LocalDateTime.now();
        horas = dataComputador.getHour();
        minutos = dataComputador.getMinute();
        dia = dataComputador.getDayOfMonth();
        mes = dataComputador.getMonthValue();
        ano = dataComputador.getYear();
        mesestenco = dataComputador.getMonth();
        diasSem = dataComputador.getDayOfWeek().getValue();
        
        
        
    }

    private static int periodoDia(int h) {
        return (h + 20) / 8 % 3;
    }

    public static void main(String args[]) {
        getHoras();
        System.out.println(saudacoes[periodoDia(horas)] + ", " + nome);
        //System.out.println("Passam " + minutos + " minutos das " + horas + " horas.");
       // System.out.println("São " + horas + " horas e " + minutos + " minutos.");
       
       //horas usando operador ternário
       msh = minutos==0 ? horas + "em ponto" : horas + " hora" + (horas == 1 ? "" : "s");
       msm = " e " + minutos + " minuto" + (minutos == 1 ? "" : "s");
        System.out.println("São " + msh + (minutos == 0 ? "" : msm));
       
       //Data com mês por extenso
        System.out.println("Data " + dia + "-" + mesestenco + "-" +ano);
        
        //quanto falta para o fim de semana
        daf = 6 - diasSem;
        System.out.println("Faltam " + daf + " dias até ao fim de semana");
        
        //datas das 13 próximas Sextas-feiras
        
        
        
        System.out.println("As datas das próximas 13 sexta-feiras são: ");
        
        
    }
}
