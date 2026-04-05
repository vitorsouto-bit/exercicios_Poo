package exercicio_Poo;

public class Cliente {

        private String nome;
        private String email;
        private String telefone;

        public static int totalClientes = 0;

        // Construtor completo
        public Cliente(String nome, String email, String telefone) {
            this.nome = nome;
            this.email = email;
            this.telefone = telefone;
            totalClientes++;
        }

        // Construtor nome + email
        public Cliente(String nome, String email) {
            this.nome = nome;
            this.email = email;
            this.telefone = "Não informado";
            totalClientes++;
        }

        // Construtor só nome
        public Cliente(String nome) {
            this.nome = nome;
            this.email = "Não informado";
            this.telefone = "Não informado";
            totalClientes++;
        }

        public void exibir() {
            System.out.println(nome + " | " + email + " | " + telefone);
        }
    }

