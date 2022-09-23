package br.com.estudos.di.modelo.notificacao;

import br.com.estudos.di.modelo.Cliente;

public interface Notificador{

    void notificar(Cliente cliente, String mensagem);

}
