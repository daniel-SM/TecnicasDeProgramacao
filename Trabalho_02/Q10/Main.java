public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.setNome("Ana");
        
        Pessoa p2 = new Pessoa();
        p2.setNome("Joao");

        System.out.println (p1.getNomeIdade());
        System.out.println (p2.getNomeIdade());
        
        p1 = p2;

        System.out.println (p1.getNomeIdade());
        System.out.println (p2.getNomeIdade());
    }
}
