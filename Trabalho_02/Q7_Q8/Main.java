public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Ana", 20);
        Pessoa p2 = new Pessoa("Joao", 30);

        System.out.println ("Nome 1: " + p1.getNome());
        System.out.println("Idade 1: " + p1.getIdade());
        
        System.out.println ("Nome 2: " + p2.getNome());
        System.out.println("Idade 2: " + p2.getIdade());
    }
}
