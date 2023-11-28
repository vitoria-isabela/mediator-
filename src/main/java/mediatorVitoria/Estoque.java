package mediatorVitoria;

public class Estoque implements Setor {
    private static Estoque instancia = new Estoque();

    private Estoque() {}

    public static Estoque getInstancia() {
        return instancia;
    }

    @Override
    public String receberPedido(String mensagem) {
        return "Estoque vai verificar o pedido: " + mensagem;
    }

    @Override
    public String receberReclamacao(String mensagem) {
        return "Estoque vai verificar a reclamação: " + mensagem;
    }

    @Override
    public String receberSugestao(String mensagem) {
        return "Estoque vai analisar a sugestão: " + mensagem;
    }
}
