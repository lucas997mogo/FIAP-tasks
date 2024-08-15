public class ContaCorrente extends Cliente {

    private double saldo;
    private String numConta;


    public ContaCorrente(String nome, String cpf, String numConta, double saldo, String endereco, String telefone) {
        super(nome, cpf, endereco, telefone);
        this.saldo = saldo;
        this.numConta = numConta;

    }

    public void dadosBasicos() {
        System.out.println("conta: " + this.numConta + " saldo atual: " + this.saldo);
    }


    public void depositar(double valor) {
        System.out.println("Depositando: " + valor);
        this.saldo += valor;
        System.out.println("\n Saldo atual: " + saldo);
    }

    public void sacar(double valor) {
        System.out.println("Sacando: " + valor);
        this.saldo -= valor;
        System.out.println("\n Saldo atual: " + saldo);
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

}
