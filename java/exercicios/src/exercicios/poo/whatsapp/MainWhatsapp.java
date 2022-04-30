package exercicios.poo.whatsapp;

import exercicios.poo.whatsapp.Contatinho;
import exercicios.poo.whatsapp.Whatsapp;
import exercicios.poo.whatsapp.mensagem.MsgAudio;
import exercicios.poo.whatsapp.mensagem.MsgFoto;
import exercicios.poo.whatsapp.mensagem.MsgTexto;

import java.time.LocalDateTime;

public class MainWhatsapp {

    public static void main(String[] args) {
        Contatinho contato = new Contatinho("Arnaldo", "00000-0000");
        MsgTexto msgTexto = new MsgTexto(contato, LocalDateTime.now(), "Mensagem Texto", 111);
        MsgAudio msgAudio = new MsgAudio(contato, LocalDateTime.now(), "Mensagem Áudio", 222);
        MsgFoto msgFoto = new MsgFoto(contato, LocalDateTime.now(), "Mensagem Foto", 333);

        Whatsapp w1 = new Whatsapp(contato, msgTexto);
        Whatsapp w2 = new Whatsapp(contato, msgAudio);
        Whatsapp w3 = new Whatsapp(contato, msgFoto);

        System.out.println("");
        w1.listarContato();
        w1.listarMensagem();

        System.out.println("");
        w2.listarContato();
        w2.listarMensagem();

        System.out.println("");
        w3.listarContato();
        w3.listarMensagem();
    }
}
