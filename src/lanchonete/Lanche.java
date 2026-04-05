package lanchonete;

public class Lanche  {

    private String nome;
    private double preco;

    public Lanche(String nome, double preco) {
        this.nome = nome;
        setPreco(preco); // validação
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco < 0) {
            System.out.println("Preço não pode ser negativo!");
        } else {
            this.preco = preco;
        }
    }

    public void exibir() {
        System.out.println(nome + " - R$ " + preco);
    }
}

