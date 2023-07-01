
package exemplo;


public class TesteExemplo {
    public static void main(String[] args) {
        Exemplo e1 = new Exemplo();
        Exemplo e2 = new Exemplo();
        Object e3 = new Object();
        String conteudoe1;
        boolean igual;
        int[] lista = new int[3];
        lista[0] = 1;
        lista[1] = 3;
        lista[2] = 7;
        e1.setListaX(lista);
        conteudoe1 = e1.toString();
        System.out.println(conteudoe1);
        int[] lista1 = new int[3];
        lista1[0] = 1;
        lista1[1] = 3;
        lista1[2] = 7;
        e2.setListaX(lista1);
        igual = e2.equals(e1);
        System.out.println("Igual? " + igual);
        e3 = e2.clone();
        System.out.println(e3);
        
        
    }
}
