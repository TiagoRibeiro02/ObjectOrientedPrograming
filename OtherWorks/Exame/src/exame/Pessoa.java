
package exame2020_2021;
import java.util.ArrayList;

public class Pessoa {

    private int cc;
    private String nome;
    private ArrayList<String> contactos;
    private int[] telefones;

    public Pessoa(int cc, String nome) {
        this.cc = cc;
        this.nome = nome;
        this.contactos = new ArrayList<String>();
        telefones = new int[2];
        for (int i = 0; i < telefones.length; i++) {
            telefones[i] = 0;
        }
    }
    
    public Pessoa(Pessoa p){
        this.cc = p.cc;
        this.nome = p.nome;
        this.contactos = (ArrayList<String>) p.contactos.clone();
        this.telefones = new int[p.telefones.length];
        for(int i = 0; i < this.telefones.length; i++){
            this.telefones[i] = p.telefones[i];
        }
    }

    public int getCc() {
        return cc;
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<String> getContactos() {
        return contactos;
    }

    public int[] getTelefones() {
        return telefones;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setContactos(ArrayList<String> contactos) {
        this.contactos = (ArrayList<String>) contactos.clone();
    }

    public void setTelefones(int[] telefones) {
        for (int i = 0; i < this.telefones.length; i++) {
            this.telefones[i] = telefones[i];
        }
    }

    @Override
    public String toString() {
        String s;
        s = "Pessoa{" + "cc=" + cc + ", nome=" + nome + ", contactos=" + contactos + ", telefone=";
        for (int i = 0; i < this.telefones.length; i++) {
            s = s + telefones[i];
        }
        return s;
    }

    public boolean equals(Object obj) {
        boolean ig = false;
        if (obj != null && this.getClass() == obj.getClass()) {
            Pessoa p = (Pessoa) obj;
            ig = (this.cc == p.cc) && (this.nome.equals(p.nome)) && (this.contactos.equals(p.contactos));
            for (int i = 0; i < this.telefones.length; i++) {
                ig = ig && (this.telefones[i] == p.telefones[i]);
            }
        }
        return ig;
    }

        public Object clone() {
        Pessoa copia = new Pessoa(this.cc, this.nome);
        copia.contactos = (ArrayList<String>) this.contactos.clone();
        for (int i = 0; i < this.telefones.length; i++) {
            copia.telefones[i] = this.telefones[i];
        }
        return copia;
    }
    
    



    public boolean verifContacto(String contacto) {
        boolean verif = false;
        if (this.contactos.contains(contacto)) {
            verif = true;
        }
        return verif;
    }

    public boolean verifTelefone(int telefone) {
        boolean verif = false;
        for (int i = 0; i < this.telefones.length; i++) {
            if (this.telefones[i] == telefone) {
                verif = true;
            }
        }
        return verif;
    }

}
