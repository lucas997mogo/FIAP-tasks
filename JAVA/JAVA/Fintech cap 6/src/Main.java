import java.time.LocalDateTime;
public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Carlin Romulo", "123.456.789-00", "Rua Guarangua, 123", "66559-9999");
        Cliente cliente2 = new Cliente("Maria Carla", "987.654.321-00", "Rua Açai, 456", "55448-8888");

        ContaCorrente contaCarlin = new ContaCorrente("0001", 5000.00, cliente1);
        ContaCorrente contaCarla = new ContaCorrente("0002", 3000.00, cliente2);

        Transacao pix = new Transacao("0001",600, LocalDateTime.now(), contaCarlin, contaCarla);

        pix.realizarTransferencia();

        Relatorio relatorio = new Relatorio("fianceiro", "Novas transações");

        relatorio.gerarRelatorio();

        contaCarla.depositar(250);

        cliente2.addTelefone("98989-9898");

        cliente2.exibirInfo();


    }


}
