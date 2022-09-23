package br.com.estudos.di.modelo.notificacao;

import br.com.estudos.di.modelo.Cliente;

public class NotificadorSMS implements Notificador {

    @Override
    public void notificar(Cliente cliente, String mensagem) {
        System.out.printf("Notificando %s por SMS atraves do telefone $s: %s \n",
                cliente.getNome(), cliente.getTelefone(), mensagem);
    }

}
