package mediatorVitoria;

public class Cliente extends Pessoa {
    public Cliente(String nome, int idade, String email) {
        super(nome, idade, email);
    }

    public String fazerPedido(String mensagem) {
        return Ouvidoria.getInstancia().encaminharPedido(mensagem);
    }

    public String fazerReclamacao(String mensagem) {
        return Ouvidoria.getInstancia().encaminharReclamacao(mensagem);
    }

    public String fazerSugestao(String mensagem) {
        return Ouvidoria.getInstancia().encaminharSugestao(mensagem);
    }
}
