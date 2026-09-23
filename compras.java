import java.util.ArrayList;
import java.util.Scanner;
public class ListaCompras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();
        System.out.print("Quantos itens você quer adicionar? ");
        int quantidade = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < quantidade; i++) {
            System.out.print("Digite o item: ");
            String item = scanner.nextLine();
            lista.add(item);
        }

        System.out.println("Lista de compras:");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println((i + 1) + " - " + lista.get(i));
        }
    }
}
