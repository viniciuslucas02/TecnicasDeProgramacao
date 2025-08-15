import java.util.Scanner;

public class ListaNomes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nomes = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o nome " + (i + 1) + ": ");
            nomes[i] = sc.nextLine();
        }

        System.out.print("Digite outro nome para verificar: ");
        String nomeBusca = sc.nextLine();
        boolean encontrado = false;

        for (String nome : nomes) {
            if (nome.equalsIgnoreCase(nomeBusca)) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("O nome está na lista.");
        } else {
            System.out.println("O nome não está na lista.");
        }

        sc.close();
    }
}
