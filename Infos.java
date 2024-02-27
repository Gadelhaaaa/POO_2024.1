import java.util.Scanner;

class Infos {
    public static void main(String[] args) {
        int idade,anonascimento,anoatual;
        String nome;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Entre com seu nome: ");
        nome = teclado.nextLine();
        System.out.print("Entre com seu ano de nascimento: ");
        anonascimento = teclado.nextInt();
        System.out.print("Entre com o ano atual: ");
        anoatual = teclado.nextInt();
        idade = anoatual - anonascimento;
        System.out.println(nome + ",possui " + idade + " anos");

        teclado.close();
        
        

    }
}