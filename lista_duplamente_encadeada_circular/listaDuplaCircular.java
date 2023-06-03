package lista_duplamente_encadeada_circular;

public class listaDuplaCircular {

    public class DoublyCircularLinkedList<T> {
        private No<T> cabeca;
        private int size;
    
        // Classe interna que representa um nó da lista
        private static class No<T> {
            T data;
            No<T> anterior;
            No<T> proximo;
    
            No(T data) {
                this.data = data;
                this.anterior = null;
                this.proximo = null;
            }
        }
    
        public DoublyCircularLinkedList() {
            this.cabeca = null;
            this.size = 0;
        }
    
        // Adicionar ao inicio da lista
        public void addFirst(T data) {
            No<T> newNo = new No<>(data);
    
            if (this.cabeca == null) {
                // Se a lista estiver vazia, o novo nó será a cabeça da lista
                this.cabeca = newNo;
                this.cabeca.anterior = newNo;
                this.cabeca.proximo = newNo;
            } else {
                // Caso contrário, o novo nó será inserido antes da cabeça da lista
                newNo.anterior = this.cabeca.anterior;
                newNo.proximo = this.cabeca;
                this.cabeca.anterior.proximo = newNo;
                this.cabeca.anterior = newNo;
                this.cabeca = newNo;
            }
    
            this.size++;
        }
    
        // Remover do fim da lista
        public T removeLast() {
            if (this.cabeca == null) {
                // Se a lista estiver vazia, não há o que remover
                return null;
            }
    
            No<T> lastNo = this.cabeca.anterior;
            T removedData = lastNo.data;
    
            if (lastNo == this.cabeca) {
                // Se há somente um nó na lista, remover este nó significa esvaziar a lista
                this.cabeca = null;
            } else {
                // Caso contrário, o nó anterior ao último se torna o novo último nó
                lastNo.anterior.proximo = this.cabeca;
                this.cabeca.anterior = lastNo.anterior;
            }
    
            lastNo.anterior = null;
            lastNo.proximo = null;
            lastNo.data = null;
            this.size--;
    
            return removedData;
        }
    
        // Remover valores duplicados da lista
        public void removeDuplicates() {
            if (this.cabeca == null || this.size == 1) {
                // Se a lista estiver vazia ou tiver somente um nó, não há valores duplicados
                return;
            }
    
            No<T> currentNo = this.cabeca;
    
            while (currentNo != null) {
                No<T> proximoNo = currentNo.proximo;
    
                // Procurar nós duplicados a partir do nó seguinte ao nó corrente
                while (proximoNo != this.cabeca) {
                    if (currentNo.data.equals(proximoNo.data)) {
                        // Se houver um nó duplicado, remover este nó
                        proximoNo.anterior.proximo = proximoNo.proximo;
                        proximoNo.proximo.anterior = proximoNo.anterior;
                        proximoNo.anterior = null;
                        proximoNo.proximo = null;
                        proximoNo.data = null;
                        this.size--;
                    }
    
                    proximoNo = proximoNo.proximo;
                }
    
                currentNo = currentNo.proximo;
            }
        }
    }
    
}
