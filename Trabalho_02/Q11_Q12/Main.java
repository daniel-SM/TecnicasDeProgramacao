public class Main {
    public static void main(String[] args) {
        Conjunto naturais = new Conjunto();
        naturais.insert(0);
        naturais.insert(1);
        naturais.insert(2);
        naturais.insert(3);
        naturais.insert(4);
        naturais.insert(5);
        naturais.insert(6);
        naturais.insert(7);
        naturais.insert(8);
        naturais.insert(9);

        Conjunto pares = new Conjunto();
        pares.insert(0);
        pares.insert(2);
        pares.insert(4);
        pares.insert(6);
        pares.insert(8);
        
        Conjunto impares = new Conjunto();
        impares.insert(1);
        impares.insert(3);
        impares.insert(5);
        impares.insert(7);
        impares.insert(9);

        Conjunto primos = new Conjunto();
        primos.insert(2);
        primos.insert(3);
        primos.insert(5);
        primos.insert(7);
        primos.insert(11);
        primos.insert(13);
        primos.insert(17);
        primos.insert(19);
        primos.insert(23);
        primos.insert(29);

        System.out.println("Se o conjunto 4 é subconjunto de si mesmo: " 
            + primos.subconjunto(primos));
        System.out.println("A pertinência dos conjuntos 2 no conjunto 1: "
            + pares.subconjunto(naturais));
        System.out.println("A pertinência dos conjuntos 3 no conjunto 1: "
            + impares.subconjunto(naturais));
        System.out.println("A pertinência dos conjuntos 4 no conjunto 1: "
            + primos.subconjunto(naturais));
        System.out.println("Se a união de 2 e 3 é igual ao conjunto 1: "
            + naturais.igual(pares.uniao(impares)));
        System.out.println("Se a intersecção dos conjuntos 1 e 2 é vazia: "
            + naturais.intersecao(pares));
        System.out.println("Qual diferença entre os conjuntos 1 e 2: "
            + naturais.diferenca(pares));
    }
}