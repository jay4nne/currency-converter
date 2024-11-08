import java.util.InputMismatchException;
import java.util.Scanner;

    public class Menu {
        public int displayMenu(Scanner input) {
            System.out.println("Seja bem-vindo(a) ao Conversor de Moedas!");
            System.out.println("Selecione a opção desejada:");
            System.out.println("1) Dólar => Peso Argentino");
            System.out.println("2) Peso Argentino => Dólar");
            System.out.println("3) Dólar => Real Brasileiro");
            System.out.println("4) Real Brasileiro => Dólar");
            System.out.println("5) Dólar => Peso Colombiano");
            System.out.println("6) Peso Colombiano => Dólar");
            System.out.println("7) Sair da aplicação");
            System.out.println("Escolha uma opção válida:");
            System.out.println("************************");

            try {
                int option = input.nextInt();
                input.nextLine();
                return option;
            } catch (InputMismatchException e) {
                System.out.println("Opção inválida. Tente novamente.");
                input.nextLine();
                return -1;
            }
        }
    }

