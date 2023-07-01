package exemplo1;
import java.io.IOException;

public class Exemplo1 {

    private static String leStr() {
        int ch;
        String r = "";
        boolean fim = false;
        while (!fim) {
            try {
                ch = System.in.read();
                if (ch < 0 || (char) ch == '\n') {
                    fim = true;
                } else {
                    r = r + (char) ch;
                }
            }
            catch(java.io.IOException e){
                fim = true;
            }
            
        }
        return r;
    }
    

    public static void main(String[] args) /*throws IOException*/ {
        int index;
        String palavra = " ";
        String[] tabPal = new String[10];
        System.out.print("Introduza uma palavra: ");

        palavra = leStr();

        while (!palavra.equals("fim")) {

            System.out.print("Introduza um índice (int): ");
            try{
                index = Integer.valueOf(leStr().trim()).intValue();
                tabPal[index] = palavra;
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("0 <= índice <= 9");
            }
            catch(NumberFormatException e){
                System.out.println("Valor não inteiro no índice");
            }
            System.out.print("Introduza uma palavra");
            System.out.println("(para terminar escreva fim): ");
            palavra = leStr();

        }
    }
}

