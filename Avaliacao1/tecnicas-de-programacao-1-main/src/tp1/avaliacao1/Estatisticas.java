package tp1.avaliacao1;

import java.lang.StringBuilder;
import tp1.avaliacao1.distribuicoes.Distribuicao;;

/** Classe que contém métodos para impressão de estatísticas de uma distribuição. */
public class Estatisticas<T extends Distribuicao> {
    
    private T distribuicao;

    public Estatisticas(T distribuicao) {
        
        this.distribuicao = distribuicao;

    }

    /** Imprime uma quantidade determinada de valores da distribuição separados por vírgula.
     *  @param n int - Quantidade de valores que serão gerados
     */
    public void imprimirValoresGerados(int n) {

        StringBuilder valores = new StringBuilder("Valores: ");

        for (int i = 0; i < n; i++) {

            valores.append(distribuicao.calcularValorAleatorio());

            if (i < n - 1) {
                
                valores.append(", ");

            }

            System.out.println(valores);

        }

    }

    /** Imprime a média da distribuição. */
    public void imprimirMedia() {

        System.out.println("Média: " + distribuicao.calcularMedia());

    }

    /** Imprime a variância da distribuição. */
    public void imprimirVariancia() {

        System.out.println("Variância: " + distribuicao.calcularVariancia());
        
    }

    /** Imprime o desvio padrão da distribuição. */
    public void imprimirDesvioPadrao() {

        System.out.println("Desvio padrão: " + distribuicao.calcularDesvioPadrao());
        
    }

}