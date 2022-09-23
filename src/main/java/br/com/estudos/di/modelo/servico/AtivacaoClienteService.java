package br.com.estudos.di.modelo.servico;

import br.com.estudos.di.modelo.Cliente;
import br.com.estudos.di.modelo.notificacao.Notificador;

public class AtivacaoClienteService {

    private Notificador notificador;

    public AtivacaoClienteService(Notificador notificador ) {
        this.notificador = notificador;
    }

    public void ativar(Cliente cliente) {
        cliente.ativar();

        this.notificador.notificar(cliente, " Seu cadastro no sistema está ativo!");

    }

}
