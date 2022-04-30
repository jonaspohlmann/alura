package exercicios.poo.whatsapp.mensagem;

import exercicios.poo.whatsapp.Contatinho;

import java.time.LocalDateTime;

public class MsgFoto extends Mensagem {
    private int tamanho;

    public MsgFoto(Contatinho destinatario, LocalDateTime horaEnvio, String conteudo, int tamanho) {
        super(destinatario, horaEnvio, conteudo);
        this.tamanho = tamanho;
    }

    public String toString() {
        return super.toString() + "\n"
                + "Tamanho: " + this.tamanho;
    }
}
