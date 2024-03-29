public class Pessoa {
    String nome;
    int idade;

    Pessoa (String nome, int idade) {
        this.setNome(nome);
        this.setIdade(idade);
    }

    void setNome (String pnome) {
        nome = pnome;
    }

    String getNome () {
        return nome;
    }

    void setIdade(int idade) {
        this.idade = idade;
    }

    int getIdade() {
        return idade;
    }
}