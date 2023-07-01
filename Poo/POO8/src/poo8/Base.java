/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo8;

/**
 *
 * @author tigol
 */
public class Base {
    
    private int a;
    private int b;

    public Base(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int soma() {
        return a + b;
    }

    public int soma(int x) {
        return a + b + x;
    }
    
    public int getA(){
        return a;
    }
    
    public int getB(){
        return b;
    }
    
    public void setA(int a){
        this.a = a;
    }
    
    public void setB(int b){
        this.b = b;
    }
    
    public String toString(){
        String s;
        s = "Classe Base ---";
        s = s + " A: " + this.a + " " + "B: "+ this.b + "\n";
        return s;
    }
    
    public boolean equals (Object obj){
        boolean ig = false;
        if(obj != null && this.getClass() == obj.getClass()){
            Base base1 = (Base) obj;
            ig = (this.a == base1.a) && (this.b == base1.b);
        }
        else{
            ig = false;
        }
        return ig;
    }
    
    public Object clone(){
        Base copia = new Base(this.a, this.b);
        return copia;
    }
}
