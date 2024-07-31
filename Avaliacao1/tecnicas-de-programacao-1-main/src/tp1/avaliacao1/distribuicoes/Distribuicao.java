package tp1.avaliacao1.distribuicoes;

import java.util.Random;

/** Classe abstrata que representa uma distribuição de probabilidade. */
public abstract class Distribuicao {

    protected Random random;

    /**
     * Construtor da classe Distribuicao.
     */
    Distribuicao () {

        this.random = new Random();

    }

    /**
     * Calcula um valor aleatório de acordo com a distribuição.
     * 
     * @return Valor gerado.
     */
    public abstract double calcularValorAleatorio ();

    /**
     * Calcula a média da distribuição.
     * 
     * @return Média da distribuição.
     */
    public abstract double calcularMedia ();

    /**
     * Calcula a variância da distribuição.
     * 
     * @return Variância da distribuição.
     */
    public abstract double calcularVariancia ();

    /**
     * Calcula o desvio padrão da distribuição.
     * 
     * @return Desvio padrão da distribuição.
     */
    public double calcularDesvioPadrao () {

        return Math.sqrt(this.calcularVariancia());

    }

}