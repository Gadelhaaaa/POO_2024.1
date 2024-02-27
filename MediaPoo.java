import java.util.Scanner;

public class MediaPoo {
    public static void main(String[] args) {
        double p1,p2, media, a;
        int presenca;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Entre com a nota do p1 , p2 e nota de participação: ");
        p1 = teclado.nextDouble();
        p2 = teclado.nextDouble();
        a = teclado.nextDouble();
        System.out.println("Insira sua presença em (%) ");
        presenca = teclado.nextInt();
        p1 = p1 * 0.9 * 2;
        p2 = p2 * 0.9 * 3;
        media = ((p1 + p2)/5) + (a * 0.1);
        
        if (presenca >= 75 && media >= 5.5){
            if (media >= 5.5 && media <= 6 ) {
                media = 6;
            }
            System.out.println("Aprovado! Conceito final: " + media);
              
        } else {
            media = 0;
            System.out.println("Reprovado! Conceito final: " + media);
        }

        
        }
        



  
    }

