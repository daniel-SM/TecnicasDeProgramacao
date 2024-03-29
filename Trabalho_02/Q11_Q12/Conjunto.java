public class Conjunto {
    private int max;
    private int n;
    private int[] elementos;

    Conjunto() {
        this.max = 2;
        this.n = 0;
        this.elementos = new int[2];
    }

    Conjunto(int[] inicial) {
        this.n = inicial.length;
        this.max = n;
        this.elementos = new int[this.n];
        
        for (int i = 0; i < inicial.length; i++) {
            this.elementos[i] = inicial[i];
        }
    }

    void dobrar () {
        this.max = this.max * 2;
        int[] novo = new int[this.max];

        for(int i = 0; i < n; ++i) {
            novo[i] = this.elementos[i];
        }
        this.elementos = novo;
    }

    void insert (int valor) {
        if (!this.contem(valor)) {
            if (n >= max / 2) {
                dobrar();
            }
            
            this.elementos[n++] = valor;
        }
    }

    boolean contem (int valor) {
        boolean encontrou = false;

        for (int i = 0; i < this.n; i++) {
            if (this.elementos[i] == valor) {
                encontrou = true;
            }
        }
        return encontrou;
    }

    boolean subconjunto (Conjunto outro) {
        for (int i = 0; i < this.n; i++) {
            if (!outro.contem(this.elementos[i])) {
                return false;
            }
        }
        return true;
    }

    Conjunto uniao (Conjunto outro) {
        Conjunto novo = new Conjunto();

        for (int i = 0; i < this.n; i++) {
            novo.insert(this.elementos[i]);
        }

        for (int i = 0; i < outro.n; i++) {
            novo.insert(i);
        }

        return novo;
    }

    Conjunto intersecao (Conjunto outro) {
        Conjunto novo = new Conjunto();

        for (int i = 0; i < this.n; i++) {
            if (outro.contem(this.elementos[i])) {
                novo.insert(this.elementos[i]);
            }
        }

        return novo;
    }

    Conjunto diferenca (Conjunto outro) {
        Conjunto novo = new Conjunto();

        for (int i = 0; i < this.n; i++) {
            if(!outro.contem(this.elementos[i])) {
                novo.insert(this.elementos[i]);
            }
        }

        return novo;
    }

    boolean igual (Conjunto outro) {
        if (this.n == outro.n) {
            for (int i = 0; i < this.n; i++) {
                if (this.elementos[i] != outro.elementos[i]) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        String valores = "[";

        for (int i = 0; i < this.n; i++) {
            valores = valores + " " + this.elementos[i];
        }
        
        valores = valores + " ]";

        return valores;
    }
};