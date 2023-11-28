package mediatorVitoria;

public class Ouvidoria {

    private static Ouvidoria instancia = new Ouvidoria();

    private Ouvidoria() {}

    public static Ouvidoria getInstancia() {
        return instancia;
    }

    public String encaminharPedido(String mensagem) {
        return "A Ouvidoria encaminhou seu pedido para o setor de Vendas.\n" +
                "Resposta: " + Vendas.getInstancia().receberPedido(mensagem);
    }

    public String encaminharReclamacao(String mensagem) {
        return "A Ouvidoria encaminhou sua reclamação para o setor de Estoque.\n" +
                "Resposta: " + Estoque.getInstancia().receberReclamacao(mensagem);
    }

    public String encaminharSugestao(String mensagem) {
        return "A Ouvidoria encaminhou sua sugestão para o setor de Vendas.\n" +
                "Resposta: " + Vendas.getInstancia().receberSugestao(mensagem);
    }
}

