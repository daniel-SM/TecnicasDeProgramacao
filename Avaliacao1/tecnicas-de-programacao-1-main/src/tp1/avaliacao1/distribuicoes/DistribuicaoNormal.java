package tp1.avaliacao1.distribuicoes;

/**
 * Classe que representa uma distribuição normal.
 */
public final class DistribuicaoNormal extends Distribuicao {
    
    private double media, desvioPadrao;

    /**
     * Construtor da classe DistribuicaoNormal.
     * 
     * @param media Média da distribuição.
     * @param desvioPadrao Desvio padrão da distribuição.
     */
    public DistribuicaoNormal(double media, double desvioPadrao) {

        super();
        this.media = media;
        this.desvioPadrao = desvioPadrao;

    }

    /**
     * Obtém a média da distribuição.
     * 
     * @return Média.
     */
    double getMedia() {

        return this.media;

    }

    /**
     * Define a média da distribuição.
     * 
     * @param media Nova média.
     */
    void setMax(double media) {

        this.media = media;

    }

    /**
     * Obtém o desvio padrão da distribuição.
     * 
     * @return Desvio padrão.
     */
    double getDesvioPadrao() {

        return this.desvioPadrao;

    }

    /**
     * Define o desvio padrão da distribuição.
     * 
     * @param desvioPadrao Novo desvio padrão.
     */
    void setDesvioPadrao(double desvioPadrao) {

        this.desvioPadrao = desvioPadrao;

    }

    /**
     * Calcula um valor aleatório de acordo com a distribuição normal.
     * 
     * @return Valor gerado.
     */
    public double calcularValorAleatorio() {

        // Converte um valor da distribuição normal padrão X~(0.0, 1.0) gerado por "Random.nextGaussian()" para a distribuição normal definida.
        return this.getDesvioPadrao() * this.random.nextGaussian() + this.getMedia();

    }

    /**
     * Calcula a média da distribuição normal.
     * 
     * @return Média da distribuição.
     */
    public double calcularMedia() {

        return this.getMedia();

    }

    /**
     * Calcula a variância da distribuição normal.
     * 
     * @return Variância da distribuição.
     */
    public double calcularVariancia() {

        return Math.pow(this.getDesvioPadrao(), 2);

    }

    /**
     * Calcula o desvio padrão da distribuição normal.
     * 
     * @return Desvio padrão da distribuição.
     */
    public double calcularDesvioPadrao() {

        return this.getDesvioPadrao();

    }


}
