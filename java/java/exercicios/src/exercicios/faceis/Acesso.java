/*
* Faça um algoritmo para ler um número que é um código de usuário. Caso este código seja diferente de um
* código armazenado internamente no algoritmo (igual a 1234) deve ser apresentada a mensagem ‘Usuário inválido!’.
* Caso o Código seja correto, deve ser lido outro valor que é a senha. Se esta senha estiver incorreta (a certa é 9999)
* deve ser mostrada a mensagem ‘senha incorreta’. Caso a senha esteja correta, deve ser mostrada a mensagem ‘Acesso permitido’
* */

package exercicios.faceis;

import java.util.Scanner;

public class Acesso {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String codigoUsuario, senhaUsuario;
        Boolean validaUsuario, validaSenha;

        do {
            System.out.print("Código de usuário: ");
            codigoUsuario = entrada.nextLine();

            validaUsuario = codigoUsuario.equals("1234");
            if (!validaUsuario) {
                System.out.println("Usuário Inválido!");
            }
        } while (!validaUsuario);

        do {
            System.out.print("Senha: ");
            senhaUsuario = entrada.nextLine();

            validaSenha = senhaUsuario.equals("9999");
            if (!validaSenha) {
                System.out.println("Senha Incorreta!");
            }
        } while (!validaSenha);

        if (validaUsuario && validaSenha) {
            System.out.println("Acesso permitido");
        }
    }
}
