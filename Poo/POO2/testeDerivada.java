
package base;


public class testeDerivada {
    public static void main(String[] args) {
        Base b1;
        Derivada d1,d2;
        Object dobj;
        int soma;
        b1 = new Base(4, 5);
        d1 = new Derivada(b1, 7,8);
        d2 = new Derivada(b1, 9, 20);
        System.out.println(d1.toString());
        soma = d1.soma(d1);
        dobj = d1.clone();
        System.out.println(dobj);
        System.out.println("Iguais? " + d1.equals(dobj));
        
        
        
    }
    
}
