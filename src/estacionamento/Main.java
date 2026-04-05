package estacionamento;
import java.util.Scanner;

    public class Main {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            Estacionamento est = new Estacionamento();

            int opcao;

            do {
                System.out.println("\n1) Entrar carro");
                System.out.println("2) Sair carro");
                System.out.println("3) Listar");
                System.out.println("4) Vagas");
                System.out.println("5) Sair");
                System.out.print("Escolha: ");

                opcao = Integer.parseInt(sc.nextLine());

                switch (opcao) {

                    case 1:
                        System.out.print("Placa: ");
                        String placa = sc.nextLine();

                        System.out.print("Modelo: ");
                        String modelo = sc.nextLine();

                        est.entrarCarro(new Carro(placa, modelo));
                        break;

                    case 2:
                        System.out.print("Placa para remover: ");
                        String placaRemover = sc.nextLine();

                        est.sairCarro(placaRemover);
                        break;

                    case 3:
                        est.listarCarros();
                        break;

                    case 4:
                        System.out.println("Ocupadas: " + est.vagasOcupadas());
                        System.out.println("Livres: " + est.vagasLivres());
                        break;

                    case 5:
                        System.out.println("Encerrando...");
                        break;

                    default:
                        System.out.println("Opção inválida!");
                }

            } while (opcao != 5);

            sc.close();
        }
    }

