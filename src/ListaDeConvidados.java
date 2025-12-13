import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaDeConvidados {
    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String convidado = " ";
        List<String> listaDeConvidados = new ArrayList<>();

        listaDeConvidados.add("Ana");
        listaDeConvidados.add("Lucas");

        System.out.println(listaDeConvidados);

        while(!convidado.equalsIgnoreCase("Sair")) {
            System.out.println("Insira o nome de um convidado\nou ver para visualizar a lista de convidados\nou sair para encerrar: ");
            convidado = input.nextLine();

            if (convidado.equalsIgnoreCase("Sair")) {
                break;
            } else if (convidado.equalsIgnoreCase("Ver")) {
                System.out.println(listaDeConvidados.toString());
                continue;
            }

            boolean nomeCadastrado = false;
            for(String nome : listaDeConvidados) {
                if(nome.equalsIgnoreCase(convidado)) {
                    nomeCadastrado = true;
                    break;
                }
            }

            if(nomeCadastrado) {
                System.out.println(convidado+ " já cadastrado(a) no sistema!!");
            } else {
                listaDeConvidados.add(convidado);
                System.out.println(convidado+ " cadastrado(a) com sucesso no sistema!!");
            }
        }
    }
}
