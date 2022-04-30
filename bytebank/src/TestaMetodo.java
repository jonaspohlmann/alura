public class TestaMetodo {
    public static void main(String[] args) {
        Conta contaDoPaulo = new Conta();
        contaDoPaulo.saldo = 50;
        contaDoPaulo.deposita(50);

        System.out.println(contaDoPaulo.saldo);
        boolean conseguiuSacar = contaDoPaulo.saca(20);
        System.out.println(contaDoPaulo.saldo);
        System.out.println(conseguiuSacar);

        Conta contaDaMarcela = new Conta();
        contaDaMarcela.deposita(1000);

        boolean conseguiuTransferir = contaDaMarcela.transfere(300, contaDoPaulo);
        System.out.println(conseguiuSacar);
        System.out.println(contaDaMarcela.saldo);
        System.out.println(contaDoPaulo.saldo);


    }
}
