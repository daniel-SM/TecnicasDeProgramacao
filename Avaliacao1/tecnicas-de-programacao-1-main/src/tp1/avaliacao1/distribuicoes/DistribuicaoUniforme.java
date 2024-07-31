package tp1.avaliacao1.distribuicoes;

/**
 * Classe que representa uma distribuição uniforme contínua.
 */
public final class DistribuicaoUniforme extends Distribuicao {
    
    private double min, max;

    /**
     * Construtor da classe DistribuicaoUniforme.
     * 
     * @param min Valor mínimo da distribuição.
     * @param max Valor máximo da distribuição.
     */
    public DistribuicaoUniforme(double min, double max) {

        super();
        this.min = min;
        this.max = max;

    }

    /**
     * Obtém o valor mínimo da distribuição.
     * 
     * @return Valor mínimo.
     */
    double getMin() {

        return this.min;

    }

    /**
     * Define o valor mínimo da distribuição.
     * 
     * @param min Novo valor mínimo.
     */
    void setMin(double min) {

        this.min = min;

    }

    /**
     * Obtém o valor máximo da distribuição.
     * 
     * @return Valor máximo.
     */
    double getMax() {

        return this.max;

    }

    /**
     * Define o valor máximo da distribuição.
     * 
     * @param max Novo valor máximo.
     */
    void setMax(double max) {

        this.max = max;

    }

    /**
     * Calcula um valor aleatório de acordo com a distribuição uniforme.
     * 
     * @return Valor gerado.
     */
    public double calcularValorAleatorio() {

        return this.getMin() + this.random.nextDouble() * (this.getMax() - this.getMin());

    }

    /**
     * Calcula a média da distribuição uniforme.
     * 
     * @return Média da distribuição.
     */
    public double calcularMedia() {

        return (this.getMin() + this.getMax()) / 2.0;

    }

    /**
     * Calcula a variância da distribuição uniforme.
     * 
     * @return Variância da distribuição.
     */
    public double calcularVariancia() {

        return Math.pow(this.getMax() - this.getMin(), 2) / 12.0;

    }

}
