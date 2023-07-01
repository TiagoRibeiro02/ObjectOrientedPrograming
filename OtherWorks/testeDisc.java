
package cldisc;


public class testeDisc {
    
    public static void main(String[] args) {
        ClDisc d1 = new ClDisc();
        d1.setCodigo(1904);
        ClDisc d2 = new ClDisc(1337, "POO");
        d2.toString();
        boolean verficn = d2.verifnome("OO");
        
        System.out.println(verficn);
        System.out.println(d1.verifnum(1, 1903));
        
    }
}
