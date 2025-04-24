public class Responsavel {

        private String nome;
        private String email;
        private String telefone;
        private Endereco endereco;
      
 
//---------------------------------------Encapsulamento nome ----------------------------------------------//
 public void setNome (String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }
    //---------------------------------------Encapsulamento Email ----------------------------------------------//

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    //---------------------------------------Encapsulamento telefone ----------------------------------------------//

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTelefone() {
        return this.telefone;
    }

    //---------------------------------------Encapsulamento endereco ----------------------------------------------//
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Endereco getEndereco() {
        return endereco;
    }
}