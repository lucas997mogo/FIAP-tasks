public class Relatorio {

    private String tipo;
    private String conteudo;

    public Relatorio(String tipo, String conteudo) {
        this.tipo = tipo;
        this.conteudo = conteudo;
    }

    public void gerarRelatorio() {
        System.out.println("Gerando relatórios:");
        System.out.println("\n Tipo de relatório: " + tipo);
        System.out.println("\n Conteudo: " + conteudo);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }
}
