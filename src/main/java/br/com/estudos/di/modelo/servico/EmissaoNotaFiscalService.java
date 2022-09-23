package br.com.estudos.di.modelo.servico;

import br.com.estudos.di.modelo.Cliente;
import br.com.estudos.di.modelo.Produto;
import br.com.estudos.di.modelo.notificacao.Notificador;

public class EmissaoNotaFiscalService {

    private Notificador notificador;

    public EmissaoNotaFiscalService(Notificador notificador) {
        this.notificador = notificador;
    }

    public void emitir(Cliente cliente, Produto produto) {
        // TODO emite a nota fiscal aqui...

        this.notificador.notificar(cliente, "nota fiscal do produto " + produto.getNome() + " foi emitida!");
    }

}
