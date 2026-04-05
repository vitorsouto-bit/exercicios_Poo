package academia;
import java.util.ArrayList;
import java.util.Scanner;

    public class Main {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            ArrayList<Aluno> lista = new ArrayList<>();

            int opcao;

            do {
                System.out.println("\n1) Cadastrar aluno");
                System.out.println("2) Listar alunos");
                System.out.println("3) Total de alunos");
                System.out.println("4) Sair");
                System.out.print("Escolha: ");

                opcao = Integer.parseInt(sc.nextLine());

                switch (opcao) {

                    case 1:
                        if (Aluno.totalAlunos >= Aluno.LIMITE_ALUNOS) {
                            System.out.println("Academia lotada!");
                            break;
                        }

                        System.out.print("Nome: ");
                        String nome = sc.nextLine();

                        System.out.print("Idade: ");
                        int idade = Integer.parseInt(sc.nextLine());

                        System.out.print("Plano (mensal/anual): ");
                        String plano = sc.nextLine();

                        Aluno aluno = new Aluno(nome, idade, plano);
                        lista.add(aluno);

                        System.out.println("Aluno cadastrado!");
                        break;

                    case 2:
                        if (lista.isEmpty()) {
                            System.out.println("Nenhum aluno cadastrado.");
                        } else {
                            for (Aluno a : lista) {
                                a.exibir();
                            }
                        }
                        break;

                    case 3:
                        System.out.println("Total: " + Aluno.totalAlunos);
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

