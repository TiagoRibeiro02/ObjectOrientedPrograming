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
public class POO7 {
    public static void main(String[] args){
        int x = 0;
        int y = 0;
        int i = 0;
        for(i = 0; i < 100; i++){
            if(x % 2 != 0)
            y = y + x;
            else
                x++;
            
        }
        System.out.println(y);
    }
}
