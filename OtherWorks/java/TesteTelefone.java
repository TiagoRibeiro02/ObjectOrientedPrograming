
package exemplo;

public class TesteTelefone {
    public static void main(String[] args) {
        Telefone tel = new Telefone();
        Telefone tel1 = new Telefone();
        Object tel2 = new Object();
        String conteudotel;
        boolean igualidade;
        tel.setNumero(456);
        tel.setTipo("João");
        tel1.setNumero(456);
        tel1.setTipo("João123");
        conteudotel = tel.toString();
        igualidade = tel.equals(tel1);
        System.out.println("Igualidade: " + igualidade);
        tel2 = tel1.clone();
        System.out.println(tel2);
    }
    
    
}
