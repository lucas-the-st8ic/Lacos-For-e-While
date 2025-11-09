import java.util.Scanner;

public class CalculaFatorial {
    static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        int numero = 0;
        int soma = 0;
        System.out.println("Digite um número: ");
        numero = leitura.nextInt();

        soma = numero;

        for (int i = numero - 1; i > 1; i--) {
            soma = soma * i;
            System.out.println(soma);
        }

        System.out.println(soma);

    }
}
