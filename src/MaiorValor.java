static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    String[] listaDeNumeros;

    System.out.println("Digite uma sequência de números separados por espaço: ");
    listaDeNumeros = input.nextLine().split(" ");
    int maiorValor = Integer.MIN_VALUE;

    for (String listaNum : listaDeNumeros) {
        int numero = Integer.parseInt(listaNum);
            if (numero > maiorValor) {
                maiorValor = numero;
            }
    }
    System.out.println("O maior número é: " + maiorValor);

    input.close();
}
