package exercicios.poo.whatsapp.mensagem;

import exercicios.poo.whatsapp.Contatinho;

import java.time.LocalDateTime;

public class MsgAudio extends Mensagem {
    private int duracao;

    public MsgAudio(Contatinho destinatario, LocalDateTime horaEnvio, String conteudo, int duracao) {
        super(destinatario, horaEnvio, conteudo);
        this.duracao = duracao;
    }

    public String toString() {
        return super.toString() + "\n"
                + "Duração: " + this.duracao;
    }
}
