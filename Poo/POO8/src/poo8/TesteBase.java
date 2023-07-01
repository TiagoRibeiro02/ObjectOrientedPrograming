package poo8;

public class TesteBase {

    public static void main(String[] args) {
        Base base1, base3;
        Object base2, base4;
        base1 = new Base(3, 4);
        base2 = base1.clone();
        base3 = new Base(1,2);
        base4 = base1.soma(1);
        
        System.out.println(base1 + "| |" + base2 + base1.equals(base2) + "| |" + base4);
    }
    
}
