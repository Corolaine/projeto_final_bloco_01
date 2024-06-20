package projeto;
import java.util.Scanner;

import static projeto.Menssagens.menssagem;
import static projeto.Menssagens.sobre;

public class Menu {

    static Scanner leia = new Scanner(System.in);

    int opcao;

    public static void main(String[] args) {
        exibirMenu();
    }

    public static void exibirMenu() {
        int opcao;

        while (true) {
            menssagem();

            opcao = leia.nextInt();

            if (opcao == 6) {
                System.out.println("\nMulheres no Mundo: viagens seguras e memórias inesquecíveis de mulher para mulheres");
                sobre();
                leia.close();
                System.exit(0);
            }
            switch (opcao) {
                case 1:
                    System.out.println("Criar Conta Perfil\n\n");
                    break;
                case 2:
                    System.out.println("Entrar\n\n");
                    break;
                case 3:
                    System.out.println("Pacotes\n\n");
                    break;
                case 4:
                    System.out.println("Passagens\n\n");
                    break;
                default:
                    System.out.println("\nOpção Inválida!\n");
                    break;
            }
        }
    }
}




