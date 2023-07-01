/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author tigol
 */
public class POO5 {
    public static void main(String[] args){
        int x = 0;
        int y = 0;
        int i = 0;
        /*for(i = 0; i < 100; i++){
            y = x + x++;  
        }
        System.out.println(y);*/
        
        
        /*while(i != 100){
            y = x + x++;
            i++;
        }
        System.out.println(y);*/
        
        do{
            y = y + x++;
            i++;
        } while(i != 100);
        System.out.println(y);
    }
}
