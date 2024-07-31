package tp1.avaliacao1.distribuicoes;

/**
 * Classe que representa uma distribuição exponencial.
 */
public class DistribuicaoExponencial extends Distribuicao {
    private double lambda;

    /**
     * Constrói uma nova distribuição exponencial com o parâmetro lambda especificado.
     *
     * @param lambda Taxa de eventos da distribuição (deve ser maior que 0)
     */
    public DistribuicaoExponencial(double lambda) {
        super();
        this.lambda = lambda;
    }

    /**
     * Gera um valor aleatório da distribuição exponencial.
     * 
     * @return Valor aleatório seguindo a distribuição exponencial com o parâmetro lambda
     */
    @Override
    public double calcularValorAleatorio() {
        return Math.log(1 - this.random.nextDouble()) / (-this.lambda);
    }

    /**
     * Calcula a média da distribuição exponencial.
     *
     * @return Média da distribuição exponencial
     */
    @Override
    public double calcularMedia() {
        return 1 / this.lambda; 
    }

    /**
     * Calcula a variância da distribuição exponencial.
     *
     * @return Variância da distribuição exponencial
     */
    @Override
    public double calcularVariancia() {
        return 1 / (this.lambda * this.lambda);
    }

    /**
     * Calcula o desvio padrão da distribuição exponencial.
     *
     * @return Desvio padrão da distribuição exponencial
     */
    @Override
    public double calcularDesvioPadrao() {
        return Math.sqrt(calcularVariancia());
    }
}
