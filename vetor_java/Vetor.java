

public class Vetor<T> {

   private T[] vetor;
   private int tamanho;

   //construtor específico:

   public Vetor(int tamanho)
   {
      vetor = (T[]) new Object[tamanho];

      this.tamanho = 0;

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

   
   //#region verifica se a lista está populada
   public boolean existeDado(int posicao)
   {
      try
      {
         return vetor[posicao] != null;
      }
      catch(java.lang.ArrayIndexOutOfBoundsException Exc)
      {
         return false;
      }
      
   }
   //#endregion

   public boolean vazio()
   {
      return tamanho == 0;
   }

   //#region metodo que remove um item da lista com base na posicao
   public void remove(int posicao)
   {
     try
      {
         System.out.println("Removendo...");

         for (int i = posicao; i < tamanho - 1; i++) {
            vetor[i] = vetor[i + 1];
        }

        vetor[tamanho - 1] = null;
        tamanho --;
      }
      catch(java.lang.ArrayIndexOutOfBoundsException Exc)
      {
         System.out.println("Índice inválido!");
      }
      
   }
   //#endregion

   public void removeInicio()
   {
      remove(0);
   }

   public void removeFim()
   {
      remove(tamanho);
   }


   public void limpar()
   {
      Iterador it = new Iterador<>(vetor);
      
      int i = 0;
      
      if(it.IsPopulated())
      {
         vetor[i] = null;
      }
      tamanho = 0;

      
   }

   //#region dobra o tamanho da lista caso a lista esteja cheia;
   public void redimensionar()
   {
      tamanho = tamanho*2;
      Length();
   }
   //#endregion
}
