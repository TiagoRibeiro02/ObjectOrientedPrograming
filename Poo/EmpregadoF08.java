package empregadof08;
import java.util.ArrayList;


public class EmpregadoF08 {

    private long nss;
    private String nome;
    private double salario;
    

    public EmpregadoF08() {
        nss = 0;
        nome = "";
        salario = 0.0;
        
    }

    public EmpregadoF08(long nss, String nome) {
        this.nss = nss;
        this.nome = nome;
        this.salario = 0.0;
        
    }
    
    public EmpregadoF08(EmpregadoF08 e){
        this.nome = e.nome;
        this.salario = e.salario;
        this.nss = e.nss;
    }

    public long getNss() {
        return nss;
    }

    public void setNss(long nss) {
        this.nss = nss;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void subirSalario(double aumento) {
        salario = salario + salario * aumento / 100;
    }

    public String toString() {
        String s = "Nss = " + nss + " Nome: " + nome + " Salário: " + salario + "Telefones: ";
        return s;
    }
    
    public boolean equals(Object obj){
        boolean ig = false;
        if(obj != null && this.getClass() == obj.getClass()){
            EmpregadoF08 emp = (EmpregadoF08) obj;
            ig = (this.nome.equals(emp.nome) && this.nss == emp.nss && this.salario == emp.salario);
            return ig;
        }
        return ig;
    }
    
    public Object clone(){
        EmpregadoF08 emp = new EmpregadoF08();
        emp.nome = this.nome;
        emp.nss = this.nss;
        emp.salario = this.salario;
        return emp;
    }
}
