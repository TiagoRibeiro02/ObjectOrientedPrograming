package poo7;
import java.util.ArrayList;

/**
 *
 * @author tigol
 */
public class GerirEmp {
    private ArrayList<Empregado> listaempregados;
    
    public GerirEmp(ArrayList<Empregado> listaempregados){
        this.listaempregados = (ArrayList<Empregado>) listaempregados.clone();
    }
    
    public GerirEmp(){
        this.listaempregados = new ArrayList<Empregado>();
    }
    
    public void criarEmp(Empregado empregado){
        this.listaempregados.add(empregado);
    }
    
    public ArrayList<Empregado> consultaEmp(){
        return this.listaempregados;
    }
    
    public void modificaEmp(String nEmp, long nss){
        for(int i = 0; i < listaempregados.size(); i++){
            if(this.listaempregados.get(i).getNome().equals(nEmp)){
                this.listaempregados.get(i).setNss(nss); 
            }
        }
    }
    
    public void removerEmp(String nEmp){
        for(int i = 0; i < listaempregados.size(); i++){
            if(this.listaempregados.get(i).getNome().equals(nEmp)){
                this.listaempregados.remove(i);
            }
        }
    }
    
}
