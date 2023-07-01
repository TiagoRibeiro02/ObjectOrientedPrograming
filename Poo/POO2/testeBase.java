
package base;


public class testeBase {
    public static void main(String[] args) {
        Base base1, base3;
        Object base2;
        base1 = new Base(3, 4);
        base2 = base1.clone();
        base3 = new Base(1,2);
        
        System.out.println(base1 + " || " +  base2 + base1.equals(base2));
    }
}
