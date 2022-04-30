package br.com.alura.maven;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Produto {

    private final String nome;
    private final double preco;

    public Produto(String nome, double preco) {
        super();
        this.nome = nome;
        this.preco = preco;
    }

    public double getPrecoComImposto() {
        return this.preco * 1.1;
    }
}
