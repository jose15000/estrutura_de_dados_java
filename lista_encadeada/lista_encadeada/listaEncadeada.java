package lista_encadeada;
public class listaEncadeada<T> {

    private No <T> inicio;
    private No <T> fim;
    private int tamanho;

    public void listaEncadeada(T elemento)
    {
        this.inicio = null;
        this.fim = null;
        this.tamanho = 0;
    }

    public void adiciona(T elemento, int posicao) throws IndexOutOfBoundsException {
        if (posicao < 0 || posicao > tamanho) {
            throw new IndexOutOfBoundsException("Posição inválida!");
        }

        No<T> novoNo = new No<>(elemento);

        if (tamanho == 0) {
            inicio = novoNo;
            fim = novoNo;
        } else if (posicao == 0) {
            novoNo.setProximo(inicio);
            inicio = novoNo;
        } else if (posicao == tamanho) {
            fim.setProximo(novoNo);
            fim = novoNo;
        } else {
            No<T> anterior = getNo(posicao - 1);
            novoNo.setProximo(anterior.getProximo());
            anterior.setProximo(novoNo);
        }

        tamanho++;
    }


    private No<T> getNo(int posicao) throws IndexOutOfBoundsException{
        if(posicao < 0 || posicao >= tamanho){
            throw new IndexOutOfBoundsException("Posição inválida!");
        }
        No<T> noAtual = inicio; 
        for(int i=0; i<posicao; i++){
            noAtual=noAtual.getProximo(); 
        }
        return noAtual; 
    }

    public void adicionaInicio(T elemento)
    {
        if(inicio == null)
        {
            adiciona(elemento, 0);
        }
    }


    public void adicionaFim(T elemento)
    {
        No<T> celula = new No<T>(elemento);
        if(inicio == null)
        {
            this.fim.setProximo(null);
        }

        this.fim = celula;
        this.tamanho++;
    }

    public T recupera(int posicao) throws IndexOutOfBoundsException {
        if (posicao < 0 || posicao >= tamanho) {
            throw new IndexOutOfBoundsException("Posição inválida!");
        }

        No<T> noAtual = getNo(posicao);
        return noAtual.getelElemento();
    }

    public void remove(int posicao) throws IndexOutOfBoundsException {
        if (posicao < 0 || posicao >= tamanho) {
            throw new IndexOutOfBoundsException("Posição inválida!");
        }

        if (tamanho == 1) {
            inicio = null;
            fim = null;
        } else if (posicao == 0) {
            inicio = inicio.getProximo();
        } else if (posicao == tamanho - 1) {
            No<T> penfim = getNo(tamanho - 2);
            penfim.setProximo(null);
            fim = penfim;
        } else {
            No<T> anterior = getNo(posicao - 1);
            anterior.setProximo(anterior.getProximo().getProximo());
        }

        tamanho--;
    }

    public void removeInicio() throws IndexOutOfBoundsException {
        remove(0);
    }

    public void removeFim() throws IndexOutOfBoundsException {
        remove(tamanho - 1);
    }


    public int getTamanho(int tamanho)
    {
        return this.tamanho;
    }

    public void limpa() throws Exception{
        while(tamanho > 0){
            removeInicio();
        }
        inicio = null;
        fim = null; 
        tamanho=0; 
     }

}
