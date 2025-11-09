//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner leitura = new Scanner(System.in);
    int quantidadeDeDegraus = 0;

    System.out.println("Digite a quantidade de degraus: ");
    quantidadeDeDegraus = leitura.nextInt();

    for (int i = 1; i <= quantidadeDeDegraus; i++) {
        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
        IO.println("Subindo o degrau  " + i);
    }
}
