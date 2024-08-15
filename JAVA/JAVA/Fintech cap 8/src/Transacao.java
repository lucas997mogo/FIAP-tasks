import java.time.LocalDateTime;

public class Transacao  {

    private String idTransacao;
    private double valor;
    private LocalDateTime dataHora;
    private ContaCorrente contaOrigem;
    private ContaCorrente contaDestino;


    public Transacao(String idTransacao, double valor, LocalDateTime dataHora, ContaCorrente contaOrigem, ContaCorrente contaDestino) {
        this.idTransacao = idTransacao;
        this.valor = valor;
        this.dataHora = dataHora;
        this.contaOrigem = contaOrigem;
        this.contaDestino = contaDestino;

    }

    public void realizarTransferencia() {
        System.out.println("Realizando transação. ");
        if (contaOrigem != null && contaDestino != null) {
            contaOrigem.sacar(valor);
            contaDestino.depositar(valor);
        } else {
            System.out.println("Contas inválidas para a transação.");
        }
    }

    public String getIdTransacao() {
        return idTransacao;
    }

    public void setIdTransacao(String idTransacao) {
        this.idTransacao = idTransacao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public ContaCorrente getContaOrigem() {
        return contaOrigem;
    }

    public void setContaOrigem(ContaCorrente contaOrigem) {
        this.contaOrigem = contaOrigem;
    }

    public ContaCorrente getContaDestino() {
        return contaDestino;
    }

    public void setContaDestino(ContaCorrente contaDestino) {
        this.contaDestino = contaDestino;
    }
}
