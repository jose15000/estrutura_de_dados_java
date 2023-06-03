package deque;

import java.util.ArrayList;
import java.util.List;

public class Deque<T> {
    private List<T> deque;

    public Deque() {
        deque = new ArrayList<>();
    }

    public void InserirNoInicio(T elemento) {
        deque.add(0, elemento);
    }

    public void InserirNoFim(T elemento) {
        deque.add(elemento);
    }

    public boolean existeDado(T elemento) {
        return deque.contains(elemento);
    }

    public boolean isEmpty() {
        return deque.isEmpty();
    }

    public T RecuperarInicio() {
        if (!deque.isEmpty()) {
            return deque.get(0);
        } else {
            throw new IndexOutOfBoundsException("O deque está vazio");
        }
    }

    public T RecuperarFim() {
        if (!deque.isEmpty()) {
            return deque.get(deque.size() - 1);
        } else {
            throw new IndexOutOfBoundsException("O deque está vazio");
        }
    }

    public void AlterarInicio(T elemento) {
        if (!deque.isEmpty()) {
            deque.set(0, elemento);
        } else {
            throw new IndexOutOfBoundsException("O deque está vazio");
        }
    }

    public void AlterarFim(T elemento) {
        if (!deque.isEmpty()) {
            deque.set(deque.size() - 1, elemento);
        } else {
            throw new IndexOutOfBoundsException("O deque está vazio");
        }
    }

    public void RemoverInicio() {
        if (!deque.isEmpty()) {
            deque.remove(0);
        } else {
            throw new IndexOutOfBoundsException("O deque está vazio");
        }
    }

    public void RemoverFim() {
        if (!deque.isEmpty()) {
            deque.remove(deque.size() - 1);
        } else {
            throw new IndexOutOfBoundsException("O deque está vazio");
        }
    }

    public int tamanho() {
        return deque.size();
    }

    public void limpa() {
        deque.clear();
    }
}

