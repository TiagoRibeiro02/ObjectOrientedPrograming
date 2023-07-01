
package empregadof08;
import java.util.ArrayList;

public class GerenciaEmp {
    private ArrayList<EmpregadoF08> listaempregados;
    
    public GerenciaEmp(ArrayList<EmpregadoF08> listaempregados){
        this.listaempregados = (ArrayList<EmpregadoF08>) listaempregados.clone();
    }
    
    public GerenciaEmp(){
        this.listaempregados = new ArrayList<EmpregadoF08>();
    }
    
    public void criarEmp(EmpregadoF08 empregado){
        this.listaempregados.add(empregado);
    }
    
    public ArrayList<EmpregadoF08> consultarEmp(){
        return this.listaempregados;
    }
    
    public void modificarEmp(String nemp, long nss){
        for(int i = 0; i < listaempregados.size(); i++){
            if(this.listaempregados.get(i).getNome().equals(nemp)){
                this.listaempregados.get(i).setNss(nss); 
            }
        }
    }
    
    public void removerEmp(String nemp){
        for(int i = 0; i < listaempregados.size(); i++){
            if(this.listaempregados.get(i).getNome().equals(nemp)){
                listaempregados.remove(i);
            }
        }
    }
}
