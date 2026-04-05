package locadora;

public class Filme {

    private String titulo;
    private String genero;
    private int ano;

    public static int totalFilmes = 0;

    public static final int ANO_MIN = 1895;
    public static final int ANO_MAX = 2026;

    public Filme(String titulo, String genero, int ano) {
        this.titulo = titulo;
        this.genero = genero;
        setAno(ano); // validação
        totalFilmes++;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if (ano < ANO_MIN || ano > ANO_MAX) {
            System.out.println("Ano inválido!");
        } else {
            this.ano = ano;
        }
    }

    // Regra de negócio
    public String tipoFilme() {
        if (ano < 2000) {
            return "Clássico";
        } else {
            return "Recente";
        }
    }

    public void exibir() {
        System.out.println(
                titulo + " | " + genero + " | " + ano + " | " + tipoFilme()
        );
    }
}
