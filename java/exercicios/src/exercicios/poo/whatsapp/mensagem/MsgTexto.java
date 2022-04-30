package exercicios.poo.whatsapp.mensagem;

import exercicios.poo.whatsapp.Contatinho;

import java.time.LocalDateTime;

public class MsgTexto extends Mensagem {
    private int numChar;

    public MsgTexto(Contatinho destinatario, LocalDateTime horaEnvio, String conteudo, int numChar) {
        super(destinatario, horaEnvio, conteudo);
        this.numChar = numChar;
    }

    public String toString() {
        return super.toString() + "\n"
                + "Número de caracteres: " + this.numChar;
    }
}
