public class Main {
    static Conjunto<Integer> complemento (Conjunto<Integer> conjunto) {
        Conjunto<Integer> novo = new Conjunto<Integer>();

        for (int i = 1; i <= 10; i++) {
            if (!conjunto.contem(i)) {
                novo.insert(i);
            }
        }

        return novo;
    }
    public static void main(String[] args) {
        Conjunto<Integer> conjunto1 = new Conjunto<Integer>();

        // for (int i = 0; i < 10; i++) {
        //     conjunto1.insert(i * 5);
        // }
        conjunto1.insert(1);
        conjunto1.insert(2);
        conjunto1.insert(3);
        
        Conjunto<Integer> conjunto2 = new Conjunto<Integer>();

        // for (int i = 0; i < 25; i++) {
        //     conjunto2.insert(i * 2);
        // }
        conjunto1.insert(3);
        conjunto1.insert(4);
        conjunto1.insert(5);

        System.out.println(complemento(conjunto1.uniao(conjunto2)).igual(complemento(conjunto1).intersecao(complemento(conjunto2))));

        System.out.println(complemento(conjunto1.uniao(conjunto2)));
        System.out.println(complemento(conjunto1).intersecao(complemento(conjunto2)));

        System.out.println(complemento(conjunto1.intersecao(conjunto2)).igual(complemento(conjunto1).uniao(complemento(conjunto2))));

        System.out.println(complemento(conjunto1.intersecao(conjunto2)));
        System.out.println(complemento(conjunto1).uniao(complemento(conjunto2)));
    }
}