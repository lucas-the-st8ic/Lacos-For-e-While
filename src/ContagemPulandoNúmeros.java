void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int numero;

    System.out.print("Digite um numero: ");
    numero = input.nextInt();

    for (int i = 1; i <= numero; i++) {
        if(i % 10 == 5) {
            i += 1;
        }

        System.out.print(i + " - ");
    }

    input.close();
}
