package exercicios.poo.whatsapp.mensagem;

import exercicios.poo.whatsapp.Contatinho;

import java.time.LocalDateTime;

public abstract class Mensagem {
    private Contatinho destinatario;
    private LocalDateTime horaEnvio;
    private String conteudo;

    public Mensagem(Contatinho destinatario, LocalDateTime horaEnvio, String conteudo) {
        this.destinatario = destinatario;
        this.horaEnvio = horaEnvio;
        this.conteudo = conteudo;
    }

    public String toString() {
        return "Nome do destinatário: " + this.destinatario.getNome() + "\n"
                + "Celular do destinatário: " + this.destinatario.getCelular() + "\n"
                + "Data e hora do envio: " + this.horaEnvio + "\n"
                + "Conteúdo: " + this.conteudo;
    }
}
