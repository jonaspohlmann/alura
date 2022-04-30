package exercicios.poo.whatsapp;

public class Contatinho {
    private String nome;
    private String celular;

    public Contatinho(String nome, String celular) {
        this.nome = nome;
        this.celular = celular;
    }

    public String toString() {
        return "Nome do destinatário: " + this.nome + "\n"
                + "Celular do destinatário: " + this.celular;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
}
