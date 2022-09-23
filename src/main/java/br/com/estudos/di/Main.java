package br.com.estudos.di;

import java.math.BigDecimal;

import br.com.estudos.di.modelo.Cliente;
import br.com.estudos.di.modelo.Produto;
import br.com.estudos.di.modelo.notificacao.Notificador;
import br.com.estudos.di.modelo.notificacao.NotificadorEmail;
import br.com.estudos.di.modelo.servico.AtivacaoClienteService;
import br.com.estudos.di.modelo.servico.EmissaoNotaFiscalService;

public class Main {

    public static void main(String[] args) {
        Cliente joao = new Cliente("Joao", "joao@xyz.com", "43345665");

        Cliente maria = new Cliente("maria", "maria@xyz.com", "2345678");

        Produto videogame = new Produto("ps5", new BigDecimal("5000.00") );

        Produto carroNovo = new Produto("Onix", new BigDecimal("50.000") );

        Notificador notificador = new NotificadorEmail(); //NotificadorSMS

        AtivacaoClienteService ativacaoCliente = new AtivacaoClienteService(notificador);

        EmissaoNotaFiscalService emissaoNotafiscal = new EmissaoNotaFiscalService(notificador);

        ativacaoCliente.ativar(joao);
        ativacaoCliente.ativar(maria);

        emissaoNotafiscal.emitir(joao, videogame);
        emissaoNotafiscal.emitir(maria, carroNovo);
    }

}
