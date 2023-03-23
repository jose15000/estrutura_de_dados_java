package lista_encadeada;

public class No<T> {

    private T elemento;

    private No <T> proximo;


    

    public No(T elemento, No<T> proximo) {
        this.elemento = elemento;
        this.proximo = proximo;
    }

    public No(T elemento) {
        this.elemento = elemento;

        this.proximo = null;
    }

    public T getelElemento() {
        return elemento;
    }

    public void setelElemento(T elemento) {
        this.elemento = elemento;
    }

    public No<T> getProximo() {
        return proximo;
    }

    public void setProximo(No<T> proximo) {
        this.proximo = proximo;
    }
    
}
