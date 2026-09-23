import java.util.Scanner;

public class InversorTexto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um texto: ");
        String texto = scanner.nextLine();

        String invert = "";
        for (int i = texto.length() - 1; i >= 0; i--) {
            invert = invert + texto.charAt(i);
        }

        System.out.println("Invertido: " + invert);
    }
}
