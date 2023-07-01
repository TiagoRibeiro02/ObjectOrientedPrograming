package poo5;

public class TesteAluno {

    public static void main(String[] args) {
        String conteudoa1, conteudoa2, conteudoa3;
        boolean verificacao;
        Aluno a1;
        Aluno a2;
        
        Disciplina[] listaa1;
        Disciplina[] listaa2;
        
        a1 = new Aluno("Manel Joao");
        a2 = new Aluno("Maria Joana");
        
        listaa1 = new Disciplina[3];
        
        listaa1[0] = new Disciplina(1000, "POO", "Paula Prata");
        listaa1[1] = new Disciplina(2000, "IA", "Luís Alexandre");
        listaa1[2] = new Disciplina(3000, "Multimédia", "Manuela Pereira");
        
        a1.setLista(listaa1);
        
        listaa2 = new Disciplina[3];
        
        listaa2[0] = new Disciplina(1000, "POO ", "Paula Prata");
        listaa2[1] = new Disciplina(4000, "Probabilidades e Estatística ", "João Duque");
        
        a2.setLista(listaa2);
        
        conteudoa1 = a1.toString();
        conteudoa2 = a1.toString();
        
        System.out.println(conteudoa1);
        System.out.println(conteudoa2);
        
        Disciplina d = new Disciplina(1904,"Matemática ","JJ");
        a2.adcionarDisciplina(d, 2);
        conteudoa3 = a2.toString();
        System.out.println(conteudoa3);
        
        verificacao = a2.vrfDisciplina(1000);
        System.out.println(verificacao);
        
        
        
    }
    
}
