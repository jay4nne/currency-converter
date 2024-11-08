import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner input = new Scanner(System.in);
        ConverterApp conversor = new ConverterApp();
        Menu menu = new Menu();

        int option;
        do {
            option = menu.displayMenu(input);
            if (option == -1) {
                continue; }
            if (option < 1 || option > 7) {
                System.out.println("Você não digitou uma opção válida.");
                continue;
            }
            if (option == 7) {
                System.out.println("Saindo da aplicação...");
                break;
            }
            conversor.processOption(option, input);
        }
        while (true);
    }
}

