package lista_duplamente_encadeada_circular;

public class No <T>{

    private T data;
    private T anterior;
    private T proximo;

    public T getAnterior() {
        return anterior;
    }
    public void setAnterior(T anterior) {
        this.anterior = anterior;
    }
    public T getProximo() {
        return proximo;
    }
    public void setProximo(T proximo) {
        this.proximo = proximo;
    }
    
    



}