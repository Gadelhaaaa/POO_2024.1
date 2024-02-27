import java.util.Random;
import java.util.Scanner;

public class NumerosAleatorios {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random rand = new Random();
        int upperbound = 101;
        int numero = 0;
        int int_random = rand.nextInt(upperbound);
        System.out.println("Digite um numero de 0 até 100: ");
        numero = teclado.nextInt();
        while(numero !=int_random){
            System.out.println("Tente novamente: ");
        numero = teclado.nextInt();
        } 
        System.out.println("Você acertou!");
        teclado.close();
    }
}
