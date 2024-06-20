package projeto;

import projeto.controller.ProjetoController;
import projeto.model.Pacotes;
import projeto.model.Passagens;
import projeto.model.Viagens;

import java.util.Scanner;

import static projeto.Menssagens.menssagem;
import static projeto.Menssagens.sobre;

public class Menu {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        ProjetoController projetoController = new ProjetoController();
        Passagens passagem1 = new Passagens(500.00, "20240620", "8:00", "Brasil", "São Paulo", 1, 1, 123, "ecônmica", "Jão");
        Pacotes pacote1 = new Pacotes(1200.50, "20240620", "12:30", "Brasil", "Rio de Janeiro", 10, 2, 4456, 889, 2);

        projetoController.cadastrar(passagem1);
        projetoController.cadastrar(pacote1);

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
                    System.out.println("Cadastrar Viagem\n");


                    System.out.print("Digite o valor da viagem: ");
                    double valor = leia.nextDouble();

                    leia.nextLine(); // Limpa o buffer do scanner

                    System.out.print("Digite a data da viagem (no formato YYYYMMDD): ");
                    String data = leia.nextLine();

                    System.out.print("Digite o horário da viagem: ");
                    String horario = leia.nextLine();

                    System.out.print("Digite o país de destino: ");
                    String pais = leia.nextLine();

                    System.out.print("Digite a cidade de destino: ");
                    String cidade = leia.nextLine();

                    System.out.print("Digite o tipo de viagem (1 para Passagem, 2 para Pacote): ");
                    int tipo = leia.nextInt();

                    System.out.print("Digite o número da passagem: ");
                    int numeroPassagem = leia.nextInt();
                    System.out.println("VIAGEM CADASTRADA!");

                    leia.nextLine();
                    break;
                case 2:
                    projetoController.vizualizarTodas();
                    break;
                case 3:
                    System.out.println("Buscar Por Número de Viagem");
                    System.out.print("Digite o número de série da viagem: ");
                    int numeroSerie = leia.nextInt();
                    projetoController.procurarViagem(numeroSerie);
                    break;
                case 4:
                    System.out.println("Atualizar Dados da Viagem");
                    System.out.print("Digite o número de série da viagem a atualizar: ");
                    int numeroSerieAtualizar = leia.nextInt();


                    System.out.print("Digite o novo valor da passagem: ");
                    double novoValor = leia.nextDouble();

                    leia.nextLine();


                    System.out.print("Digite a nova classe da passagem: ");
                    String novaClasse = leia.nextLine();


                    System.out.print("Digite o nome do comprador da passagem: ");
                    String nomeComprador = leia.nextLine();


                    Passagens passagemAtualizada = new Passagens(novoValor, null, null, null, null, 0, 1, numeroSerieAtualizar, novaClasse, nomeComprador);
                    projetoController.atualizar(passagemAtualizada);
                    break;

                case 5:
                    System.out.println("Cancelar Viagem\n\n");
                    System.out.print("Digite o número de série da viagem a cancelar: ");
                    int numeroSerieCancelar = leia.nextInt();
                    projetoController.cancelarViagem(numeroSerieCancelar);
                    break;
                default:
                    System.out.println("\nOpção Inválida!\n");
                    break;
            }
        }
    }
}



