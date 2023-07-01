
package exame2020_2021;


public class Aluno extends Pessoa{
    private String escola;
    
    public Aluno(Pessoa p, String escola){
        super(p.getCc(), p.getNome());
        super.setContactos(p.getContactos());
        super.setTelefones(p.getTelefones());
        this.escola = escola;
    }
    
    public void adicionarContacto(String contacto){
        if(!this.verifContacto(contacto)){
            this.getContactos().add(contacto);
        }
    }

    public String getEscola() {
        return escola;
    }

    public void setEscola(String escola) {
        this.escola = escola;
    }
    
    
}
