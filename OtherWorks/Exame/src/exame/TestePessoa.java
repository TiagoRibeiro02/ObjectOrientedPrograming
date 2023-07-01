package exame2020_2021;

import java.util.ArrayList;

public class TestePessoa {

    public static void adicionarPessoas(ArrayList<Pessoa> pessoas, Pessoa p) throws Exception{
        boolean verif = false;
        for(int i = 0; i < pessoas.size(); i++){
            if(pessoas.get(i).getNome().equals(p.getNome())){
                verif = true;
            }
        }
        if(verif == false){
            pessoas.add(p);
        }
        else{
            throw new Exception("Nome repetido");
        }
    }
    

 
    

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(12345, "Maria");
        ArrayList<String> contactos = new ArrayList<String>();
        contactos.add("amigo1@gmail.com");
        contactos.add("amigo2@gmail.com");
        p1.setContactos(contactos);
        int[] telefones = new int[2];
        telefones[0] = 1111;
        telefones[1] = 2222;
        p1.setTelefones(telefones);
        System.out.println(p1);
        Pessoa p2 = new Pessoa(p1);
        Pessoa p3 = (Pessoa) p1.clone();
        Pessoa p4 = p1;
        p1.setNome("Novo Nome");
        System.out.println(p1);
        System.out.println(p4);
        System.out.println(p1 == p4);
        System.out.println(p1.equals(p2));
    }

}
