static void main(String[] args) {
   Scanner sc = new Scanner(System.in);


   System.out.println("Digite seu nome: ");
   String nome = sc.nextLine();

   while (nome.length() < 3) {
       System.out.println("O nome deve ter pelo menos 3 caracteres!!!");
       System.out.println("Digite seu nome: ");
       nome = sc.nextLine();
   }

    System.out.println("Nome cadastrado com sucesso!!");
}
