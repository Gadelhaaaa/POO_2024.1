
package poo12;

import java.util.ArrayList;

public class App {

    private ArrayList<Aluno> alunos;

    public App(){
        this.alunos = new ArrayList<>();
    }
    

    private int menu(){
        int opcao = 0;
        System.out.println("..::SIGAA 2::..");
        System.out.println("1 - Cadastrar");
        System.out.println("2 - Editar");
        System.out.println("3 - Excluir");
        System.out.println("4 - Listar dados de um aluno");
        System.out.println("5 - Listar todos os alunos");
        System.out.println("6 - Sair");
        do {
            switch (opcao) {
                case 1 -> System.out.println("Cadastrando...");
                case 2 -> System.out.println("Editando...");
                case 3 -> System.out.println("Excluindo...");
                case 4 -> System.out.println("Listando dados de um aluno...");
                case 5 -> System.out.println("Listando dados de todos alunos...");
                case 6 -> System.out.println("Saindo...");
                default -> System.out.println("Insira uma opção válida");
            }
        } while (opcao !=6);

    }
    public static void main(String[] args) {
        App app = new App();
    }
}

    
