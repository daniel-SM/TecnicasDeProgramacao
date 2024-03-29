import java.util.ArrayList;

public class Conjunto<T> {
    private ArrayList<T> elementos;

    Conjunto() {
        this.elementos = new ArrayList<T>();
    }

    void insert (T valor) {
        if (!this.contem(valor)) {
            this.elementos.add(valor);
        }
    }

    boolean contem (T valor) {
        return this.elementos.contains(valor);
    }

    boolean subconjunto (Conjunto<T> outro) {
        for (T elemento : this.elementos) {
            if (!outro.contem(elemento)) {
                return false;
            }
        }
        return true;
    }

    Conjunto<T> uniao (Conjunto<T> outro) {
        Conjunto<T> novo = new Conjunto<T>();

        for (T elemento : this.elementos) {
            novo.insert(elemento);
        }

        for (T elemento : outro.elementos) {
            novo.insert(elemento);
        }

        return novo;
    }

    Conjunto<T> intersecao (Conjunto<T> outro) {
        Conjunto<T> novo = new Conjunto<T>();

        for (T elemento : this.elementos) {
            if (outro.contem(elemento)) {
                novo.insert(elemento);
            }
        }

        return novo;
    }

    Conjunto<T> diferenca (Conjunto<T> outro) {
        Conjunto<T> novo = new Conjunto<T>();

        for (T elemento : this.elementos) {
            if(!outro.contem(elemento)) {
                novo.insert(elemento);
            }
        }

        return novo;
    }

    boolean igual (Conjunto<T> outro) {
        if (this.elementos.size() == outro.elementos.size()) {
            for (T elemento : elementos) {
                if (!outro.contem(elemento)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public String toString() {
        String valores = "[";

        for (T elemento : this.elementos) {
            valores = valores + " " + elemento;
        }
        valores = valores + " ]";

        return valores;
    }
};