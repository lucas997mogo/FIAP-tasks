public class ContaCorrente extends Cliente {

    private double saldo;
    private String numConta;
    private double credito;

    public ContaCorrente(String numConta, double saldo, Cliente cliente) {
        this.saldo = saldo;
        this.numConta = numConta;
        this.credito = credito;
    }

    public void dadosBasicos() {
        System.out.println("conta: " + this.numConta + "saldo atual: " + this.saldo + " Credito disponível: " + this.credito);
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

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }
}
