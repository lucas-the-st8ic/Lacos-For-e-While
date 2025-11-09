import java.util.Scanner;

public class SomaValoresPares {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int numeroMinimo;
        int numeroMaximo;
        int somaNumerosPares = 0;

        System.out.println("Digite o numero inicial: ");
        numeroMinimo = input.nextInt();

        System.out.println("Digite o numero final: ");
        numeroMaximo = input.nextInt();

        while (numeroMinimo > numeroMaximo) {
            System.out.println("O número final não pode ser menor que o número inicial!!");

            System.out.println("Digite o numero final: ");
            numeroMaximo = input.nextInt();
        }

        for (int i = numeroMinimo; i <= numeroMaximo; i++) {
            if (i % 2 == 0) {
                somaNumerosPares += i;
            }
        }

        System.out.println("A soma dos números pares de " +numeroMinimo+ " a " +numeroMaximo+ " é igual a: " + somaNumerosPares);
    }
}
