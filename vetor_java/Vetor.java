import javax.xml.transform.Source;

public class Vetor<T> {

   private T[] vetor;
   private int tamanho;

   //construtor específico:

   public Vetor(int length)
   {
      vetor = (T[]) new Object[length];

      this.tamanho = tamanho;
   }

   //retorna o tamanho do vetor
   public int Length()
   {
      return this.tamanho;
   }

   //adiciona o elemento no vetor usando o iterador

   public void Add(T elemento, int posicao)
   {
      try
      {
         Iterador<T> it = new Iterador<>(vetor);

         int i = 0;

         while(it.IsPopulated()){

         if(it.nextValue() == null){

            vetor[i] = elemento;
            tamanho++;  
            break;
         }

            i++;
         }
      }
      catch(java.lang.ArrayIndexOutOfBoundsException Exc)
      {
         redimensionar();
      }
      
   }


   //adiciona no início da lista 
   public void adicionaInicio(T elemento)
   {
      Add(elemento, 0);
   }

   //adiciona no fim da lista  
   public void adicionaFim(T elemento)
   {
      Add(elemento, tamanho);
   }

   //recupera o dado na lista com base na posição
   public T recuperar(int posicao)
   {
         return vetor[posicao];
   }

   
   //verifica se a lista está populada
   public boolean existeDado(int posicao)
   {
      return vetor[posicao] != null;
   }

   public boolean vazio()
   {
      if(Length() == 0)
      {
         return true;
      }
      else
      {
         return false;
      }
   }

   //dobra o tamanho da lista caso a lista esteja cheia;
   public void redimensionar()
   {
      tamanho = tamanho*2;
      Length();
   }

}
