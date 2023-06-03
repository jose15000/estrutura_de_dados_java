package pilha;
import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class Pilha<T> {
    private List<T> elementos;

    public Pilha() {
        elementos = new ArrayList<>();
    }

    public void Push(T elemento) {
        elementos.add(elemento);
    }

    public boolean existeDado() {
        return !elementos.isEmpty();
    }

    public boolean isEmpty() {
        return elementos.isEmpty();
    }

    public T Top() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return elementos.get(elementos.size() - 1);
    }

    public void Pull(T elemento) {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        elementos.set(elementos.size() - 1, elemento);
    }

    public void Pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        elementos.remove(elementos.size() - 1);
    }

    public int tamanho() {
        return elementos.size();
    }

    public void limpa() {
        elementos.clear();
    }
}
    
