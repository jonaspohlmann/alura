package exercicios.poo.whatsapp;

import exercicios.poo.whatsapp.mensagem.Mensagem;

public class Whatsapp {
    private Contatinho contato;
    private Mensagem mensagem;

    public Whatsapp(Contatinho contato, Mensagem mensagem) {
        this.contato = contato;
        this.mensagem = mensagem;
    }

    public void listarContato() {
        System.out.println(contato);
    }

    public void listarMensagem() {
        System.out.println(mensagem);
    }
}
