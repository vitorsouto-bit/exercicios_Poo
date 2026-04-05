package locadora;
import java.util.ArrayList;
import java.util.Scanner;

    public class Main {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            ArrayList<Filme> lista = new ArrayList<>();

            int opcao;

            do {
                System.out.println("\n1) Cadastrar filme");
                System.out.println("2) Listar filmes");
                System.out.println("3) Total de filmes");
                System.out.println("4) Sair");
                System.out.print("Escolha: ");

                opcao = Integer.parseInt(sc.nextLine());

                switch (opcao) {

                    case 1:
                        System.out.print("Título: ");
                        String titulo = sc.nextLine();

                        System.out.print("Gênero: ");
                        String genero = sc.nextLine();

                        System.out.print("Ano: ");
                        int ano = Integer.parseInt(sc.nextLine());

                        Filme filme = new Filme(titulo, genero, ano);
                        lista.add(filme);

                        System.out.println("Filme cadastrado!");
                        break;

                    case 2:
                        if (lista.isEmpty()) {
                            System.out.println("Nenhum filme cadastrado.");
                        } else {
                            for (Filme f : lista) {
                                f.exibir();
                            }
                        }
                        break;

                    case 3:
                        System.out.println("Total: " + Filme.totalFilmes);
                        break;

                    case 4:
                        System.out.println("Encerrando...");
                        break;

                    default:
                        System.out.println("Opção inválida!");
                }

            } while (opcao != 4);

            sc.close();
        }
    }

