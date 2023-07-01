
import java.util.HashSet;
import java.util.Set;

//package disciplina;
        
        
public class testeDisciplina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Disciplina d1 = new Disciplina();
        d1.setCodigo(1904);
        d1.getCodigo();
        d1.setNome("Tiago");
        d1.getNome();
        d1.setProf("Manel");
        d1.getProf();
        
        
        Disciplina d2 = new Disciplina(1337, "POO");
        d2.toString();
        boolean verficn = d2.verifnome("OO");
        
        System.out.println(verficn);
        System.out.println(d1.verifnum(1, 1903));
        
        String dis = "";
        dis = d1.toString();
        System.out.println(dis);
    }
    
}
