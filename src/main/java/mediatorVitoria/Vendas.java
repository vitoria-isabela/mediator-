package mediatorVitoria;

public class Vendas implements Setor {
    private static Vendas instancia = new Vendas();

    private Vendas() {}

    public static Vendas getInstancia() {
        return instancia;
    }

    @Override
    public String receberPedido(String mensagem) {
        return "Vendas está processando seu pedido: " + mensagem;
    }

    @Override
    public String receberReclamacao(String mensagem) {
        return "Vendas vai analisar a reclamação: " + mensagem;
    }

    @Override
    public String receberSugestao(String mensagem) {
        return "Vendas vai analisar a sugestão: " + mensagem;
    }
}