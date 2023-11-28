package mediatorVitoria;

public interface Setor {
    String receberPedido(String mensagem);
    String receberReclamacao(String mensagem);
    String receberSugestao(String mensagem);
}
