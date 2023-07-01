/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo6;

import java.util.ArrayList;

/**
 *
 * @author tigol
 */
public class Exemplo {
    private int n;
    private String s;
    private int[] listaX;
    private ArrayList <String> listaY;
    private Telefone[] listaT;
    private ArrayList<Telefone> listaZ;
    
    public Exemplo(){
        n = 0;
        s = "";
        listaX = new int[10];
        for(int i = 0; i < listaX.length; i++){
            listaX[i] = 0;
        }
        listaY = new ArrayList<String>();
        listaT = new Telefone[5];
        for(int i = 0; i < listaT.length; i++){
            listaT[i] = new Telefone();
        }
        listaZ = new ArrayList<Telefone>();
    }
    
    public int getNum(){
        return n;
    }
    
    public void setNum(int n){
        this.n = n;
    }
    
    public String getS(){
        return s;
    }
    
    public void setS(String s){
        this.s = s;
    }
    
    public int[] getListaX(){
        return listaX;
    }
    
    public void setListaX(int[] listaX){
        this.listaX = listaX;
    }
    
    public ArrayList<String> getListaY(){
        return listaY;
    }
    
    public void setListaY(ArrayList<String> listaY){
        this.listaY = (ArrayList<String>) listaY.clone();
    }
    
    public Telefone[] getListaT(){
        return listaT;
    }
    
    public void setListaT(Telefone[] listaT){
        for(int i = 0; i < listaT.length; i++){
            listaT[i].setnumero(listaT[i].getnumero());
            listaT[i].settipo(listaT[i].gettipo());
        }
    }
    
    public ArrayList<Telefone> getListaZ(){
        return listaZ;
    }
    
    public void setListaZ(ArrayList<Telefone> listaZ){
        this.listaZ = (ArrayList<Telefone>) listaZ.clone();
    }
    
    public String toString(){
        s = "Número: " + n + "S: " + s;
        for(int i = 0; i < listaX.length; i++){
            s = s + " " + listaX[i];
        }
        s = s + listaY;
        for(int i = 0; i < listaT.length; i++){
            s = s + " " + listaT[i];
        }
        s = s + listaZ;
        return s;
    }
    
    public boolean equals(Object obj){
        if(obj != null && this.getClass() == obj.getClass()){
            Exemplo e = (Exemplo) obj;
            boolean eg;
            eg = (this.n == e.n && this.s.equals(e.s));
            for(int i = 0; i < listaX.length; i++){
                eg  = ((this.listaX[i] == e.listaX[i]));
            }
            for(int i = 0; i < listaT.length; i++){
                eg = this.listaT[i] == e.listaT[i];
            }
            eg = (this.listaY == e.listaY);
            eg = (this.listaZ == e.listaZ);
            return eg;
        }
        return false;
            
    }
    
    public Object clone(){
        Exemplo e = new Exemplo();
        e.n = this.n;
        e.s = this.s;
        for(int i = 0; i < listaX.length; i++){
            e.listaX[i] = listaX[i];
        }
        for(int i = 0; i < listaT.length; i++){
            e.listaT[i].setnumero(listaT[i].getnumero());
            e.listaT[i].settipo(listaT[i].gettipo());
        }
        e.listaY = listaY;
        e.listaZ = listaZ;
        return e;
    } 
    
    
    
}
