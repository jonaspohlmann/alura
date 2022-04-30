public class Conta {
    double saldo;
    int agencia = 42;
    int numero;
    String titular;

    public void deposita(double valor) {
        this.saldo = this.saldo + valor;
    }

    public boolean saca(double valor) {
        boolean consegueSacar = this.saldo >= valor;
        if(consegueSacar) {
            this.saldo -= valor;
        }
        return consegueSacar;
    }

    public boolean transfere(double valor, Conta destino) {
        boolean consegueTransferir = this.saldo >= valor;
        if(consegueTransferir) {
            this.saca(valor);
            destino.deposita(valor);
        }
        return consegueTransferir;
    }
}
