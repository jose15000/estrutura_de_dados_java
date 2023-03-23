package lista_encadeada;

public class teste{

     public static void main(String[] args) {
        listaEncadeada listaEncadeada = new listaEncadeada<>();
        listaEncadeada.adiciona("teste", 0);

        listaEncadeada.adicionaFim("sla");

        listaEncadeada.getTamanho(0);
        System.out.println(listaEncadeada.recupera(0));
        
    }

}