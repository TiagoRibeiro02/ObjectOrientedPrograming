package poo7;
import java.util.ArrayList;

/**
 *
 * @author tigol
 */
public class Empregado {
    private long nss;
    private String nome;
    private double salario;
    

    public Empregado() {
        nss = 0;
        nome = "";
        salario = 0.0;
        
    }

    public Empregado(long nss, String nome) {
        this.nss = nss;
        this.nome = nome;
        this.salario = 0.0;
        
    }
    
    public Empregado(Empregado e){
        this.nome = e.nome;
        this.salario = e.salario;
        this.nss = e.nss;
    }
    
    public long getNss(){
        return nss;
    }
    
    public void setNss(long nss){
        this.nss = nss;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public double getSalario(){
        return salario;
    }
    
    public void setSalario(double salario){
        this.salario = salario;
    }
    
    public void subirSalario(double aumento){
        salario = salario + salario * aumento / 100;
    }
    
    public String toString(){
        String s = "Nss: " + nss + "\nNome: " + nome + "\nSalario: " + salario;
        return s;
    }
    
    public boolean equals(Object obj){
        boolean ig = false;
        if(obj != null && this.getClass() == obj.getClass()){
            Empregado emp = (Empregado) obj;
            ig = (this.nome.equals(emp.nome) && this.nss == emp.nss && this.salario == emp.salario);
            return ig;
        }
        return ig;
    }
    
    public Object clone(){
        Empregado emp = new Empregado();
        emp.nome = this.nome;
        emp.nss = this.nss;
        emp.salario = this.salario;
        return emp; 
    }
}
