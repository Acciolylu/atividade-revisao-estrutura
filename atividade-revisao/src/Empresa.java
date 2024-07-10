public class Empresa {

    private String cnpj;
    private String nome;
    private String telefone;
    
    public Empresa() {
    }

    public Empresa(String nome, String cnpj, String telefone) {
       
        this.nome = nome;
        this.cnpj = cnpj;
        this.telefone = telefone;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", CNPJ: " + cnpj + ", Telefone: " + telefone;
    }


    
}
