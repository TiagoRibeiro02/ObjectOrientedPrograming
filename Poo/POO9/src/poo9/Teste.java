package poo9;

public class Teste {

    public static void main(String args[]) {
        int i, valor;
        int fornecedor[] = {20, 80, 70, 60, 100, 50, 60, 20};

        FrascoChocolate F = new FrascoChocolate(120, 50);

        for (i = 0; i < 8; i = i + 2) {
            try {
                valor = fornecedor[i];
                F.enche(valor);
                valor = fornecedor[i + 1];
                F.retira(valor);
            }
            catch (FrascoVazio | FrascoCheio e){
                System.out.println(e.getMessage());
            }
            
            finally {
                System.out.println("fim da iteração " + i );
            }
        }
    }
}
