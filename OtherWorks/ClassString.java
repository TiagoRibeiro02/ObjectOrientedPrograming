package classstring;

public class  ClassString {
    

    public static void main(String[] args) {
        String s = "The competent programmer is fully aware of the limited size of his own skull. He therefore approaches his task with full humility, and avoids clever tricks like the plague.";
        int tamanhostring = s.length();
        
        String[] words = s.split(" ");
        
        int tamanhoses = words.length;
        int quantpalavras = words.length;
        /* 4d)
        char pMa= 'a';
        char pMi = 'A';
        int contadorABC = 0;
        for(int i = 0; i < 25; i++){
            for(int j = 0; j < tamanhoses; i++){
                if(s.charAt(j) == pMi || s.charAt(j) == pMa){
                    contadorABC++;
                } 
            }
            System.out.println(pMa + "-" + contadorABC + "x");  
            pMa++;
            pMi++;
            contadorABC = 0;
        }
        */
        
        String p = "programmer";
        boolean verf = false;
        boolean sair = false;
        int pos = 0;
        int controlo = 0;
        while (controlo < words.length && sair == false) {
            if (words[controlo].contains(p)){
                    sair = true;
                    verf = true;
                    pos = s.indexOf(p);
                }
            controlo++;
        }
        System.out.print("Pertence: " + verf + "\nPosição: " + pos);
    }
}
        
        
        
        
        
        
        
        
        
        
    


