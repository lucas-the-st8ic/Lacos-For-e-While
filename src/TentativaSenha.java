import java.util.Scanner;

public class TentativaSenha {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int senha = 2025;
        int inputSenha;

        for (int tentativas = 3; tentativas > 0; tentativas--) {
            System.out.print("Digite seu senha: ");
            inputSenha = input.nextInt();

            if (inputSenha == senha) {
                System.out.println("Senha correta!\nAcesso permitido!!");
                break;
            } else if (tentativas > 1) {
                System.out.println("Senha Incorreta!!!\nVocê tem " +(tentativas - 1)+ " tentativas restantes.");
            } else {
                System.out.println("Senha Incorreta!!!\nSistema temporariamente bloqueado por tentativas em excesso.");
            }
        }

        input.close();
    }
}
