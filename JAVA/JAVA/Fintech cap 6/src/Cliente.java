public class Cliente {
    private String nome;
    private String cpf;
    private String endereco;
    private String telefone;

    public Cliente() {

    }

    public Cliente(String nome, String cpf, String endereco, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
    }


    public void exibirInfo() {
        System.out.println("Exibindo informações básicas do cliente: " + this.nome + " CPF: " + this.cpf);

    }
    public void addTelefone(String novoTelefone) {
        this.telefone = novoTelefone;
        System.out.println("Alterando telefone: " + this.telefone);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
