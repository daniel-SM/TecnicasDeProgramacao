public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.setNome("Ana");
        p1.setIdade(20);

        Pessoa p2 = new Pessoa();
        p2.setNome("Joao");
        p2.setIdade(30);

        System.out.println ("Nome 1: " + p1.getNome());
        System.out.println("Idade 1: " + p1.getIdade());
        
        System.out.println ("Nome 2: " + p2.getNome());
        System.out.println("Idade 2: " + p2.getIdade());
    }
}
