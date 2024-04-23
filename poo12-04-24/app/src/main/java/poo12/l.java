import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] options = {"Opção 1", "Opção 2", "Opção 3", "Opção 4", "Opção 5"};
        
        while (true) {
            System.out.println("Escolha uma opção:");
            for (int i = 0; i < options.length; i++) {
                System.out.println((i + 1) + ". " + options[i]);
            }
            System.out.println("0. Sair");
            
            int choice = scanner.nextInt();
            
            if (choice == 0) {
                System.out.println("Saindo...");
                break;
            } else if (choice > 0 && choice <= options.length) {
                System.out.println("Você escolheu: " + options[choice - 1]);
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }
        
        scanner.close();
    }
}
