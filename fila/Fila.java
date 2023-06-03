package fila;

import java.util.LinkedList;

public class Fila<T> {

    private LinkedList<T> fila = new LinkedList<>();

    public Fila() {}

    public void Inserir(T elemento) {
        fila.addLast(elemento);
    }

    public boolean existeDado(T elemento) {
        return fila.contains(elemento);
    }

    public boolean isEmpty() {
        return fila.isEmpty();
    }

    public T Recuperar() {
        if (isEmpty()) throw new IndexOutOfBoundsException("Fila vazia!");
        return fila.getFirst();
    }

    public void Alterar(T elemento) {
        if (isEmpty()) throw new IndexOutOfBoundsException("Fila vazia!");
        fila.set(0, elemento);
    }

    public void Remover() {
        if (isEmpty()) throw new IndexOutOfBoundsException("Fila vazia!");
        fila.removeFirst();
    }

    public int tamanho() {
        return fila.size();
    }

    public void limpa() {
        fila.clear();
    }
}


