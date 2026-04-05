package academia;

public class Aluno {

    private String nome;
    private int idade;
    private String plano;

    public static int totalAlunos = 0;
    public static final int LIMITE_ALUNOS = 50;

    public Aluno(String nome, int idade, String plano) {

        if (totalAlunos >= LIMITE_ALUNOS) {
            System.out.println("Academia lotada! Não é possível cadastrar.");
            return;
        }

        this.nome = nome;
        setIdade(idade);
        setPlano(plano);

        totalAlunos++;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getPlano() {
        return plano;
    }

    public void setIdade(int idade) {
        if (idade < 14) {
            System.out.println("Idade mínima é 14 anos!");
        } else {
            this.idade = idade;
        }
    }

    public void setPlano(String plano) {
        if (plano.equalsIgnoreCase("mensal") || plano.equalsIgnoreCase("anual")) {
            this.plano = plano;
        } else {
            System.out.println("Plano inválido! Use mensal ou anual.");
        }
    }

    public void exibir() {
        System.out.println(nome + " | Idade: " + idade + " | Plano: " + plano);
    }
}

