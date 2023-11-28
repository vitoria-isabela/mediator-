package mediatorVitoria;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void deveEncaminharPedidoParaVendas() {
        Cliente cliente = new Cliente("João", 30, "joao@email.com");
        assertEquals("A Ouvidoria encaminhou seu pedido para o setor de Vendas.\n" +
                "Resposta: Vendas está processando seu pedido: Pedido X",
                cliente.fazerPedido("Pedido X"));
    }

    @Test
    void deveEncaminharReclamacaoParaEstoque() {
        Cliente cliente = new Cliente("Maria", 25, "maria@email.com");
        assertEquals("A Ouvidoria encaminhou sua reclamação para o setor de Estoque.\n" +
                "Resposta: Estoque vai verificar a reclamação: Reclamação Y",
                cliente.fazerReclamacao("Reclamação Y"));
    }

    @Test
    void deveEncaminharSugestaoParaVendas() {
        Cliente cliente = new Cliente("Carlos", 40, "carlos@email.com");
        assertEquals("A Ouvidoria encaminhou sua sugestão para o setor de Vendas.\n" +
                "Resposta: Vendas vai analisar a sugestão: Sugestão Z",
                cliente.fazerSugestao("Sugestão Z"));
    }
}