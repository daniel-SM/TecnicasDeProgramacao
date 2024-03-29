class OperacaoBinaria<T> {
    private T elemento1;
    private T elemento2;

    public OperacaoBinaria(T e1, T e2) {
        this.elemento1 = e1;
        this.elemento2 = e2;
    }

    public fazerOperacao() {}

    public T getElemento1() {
        return elemento1;
    }

    public void setElemento1(T elemento1) {
        this.elemento1 = elemento1;
    }

    public T getElemento2() {
        return elemento2;
    }

    public void setElemento2(T elemento2) {
        this.elemento2 = elemento2;
    }
}