package br.com.alura.maven;

public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto("Maçã", 15.40);
        System.out.println(produto.getNome());
        System.out.println(produto.getPreco());
    }
}
