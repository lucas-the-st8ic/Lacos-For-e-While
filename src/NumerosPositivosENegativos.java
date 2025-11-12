void main(String[] args) {
    Scanner input = new Scanner(System.in);

    String entrada;
    int totalDeNumerosPositivos = 0;
    int totalDeNumerosNegativos = 0;
    int numero = 0;


    do {
        System.out.println("Digite números para realizar a contagem de negativos e positivos (ou digite 'Fim' para encerrar.)");
        entrada = input.nextLine();
        entrada = entrada.toUpperCase();

        if (entrada.equalsIgnoreCase("Fim")) {
            break;
        }
        numero = Integer.parseInt(entrada);

        if (numero > 0) {
            totalDeNumerosPositivos += 1;
        } else if (numero < 0) {
            totalDeNumerosNegativos += 1;
        }
    } while(!entrada.equalsIgnoreCase("Fim"));

    System.out.println("Total de números positivos: " +totalDeNumerosPositivos);
    System.out.println("Total de números negativos: " +totalDeNumerosNegativos);

}