package lista_duplamente_encadeada;

public class listaDuplamenteEncadeada {
    No cabeca;
    No inicio;
    No  fim;
    int tamanho;

    public void noCabeca(){
        cabeca = new No();
        cabeca.proximo = null;
        cabeca.anterior = null;
        fim = null;
        tamanho = 0;
    }
    

    public void insrirInicio(String info){
        No no = new No();
        no.anterior = cabeca;
        no.info = info;
        no.proximo = cabeca.proximo;
        if(cabeca.proximo!= null){
           cabeca.proximo.anterior = no; 
            
        }
        else{
            fim = no;
        }
        
        cabeca.proximo = no; 
        tamanho++;
    }
   public String retirarInicio(){
       if(inicio== null){
           return null;
           
       }
    
    String out = inicio.info;
    inicio = inicio.proximo;
    
       if(inicio!= null){
       inicio.anterior = null;  
     }else{
           fim = null;
       }tamanho--;
       
       return out;
   }
   public void inserirfim(String info ){
       No no = new No();
       no.info= info;
       no.proximo = null;
       no.anterior = fim;
       if(fim != null){
           fim.proximo = no;
           
       }fim = no;
       
       if(tamanho == 0){
           inicio = fim;
           
       }tamanho++;
       
   }
   public String retirarFim(){
       if(fim == null){
          return null; 
       }
    String out = fim.info;
    fim = fim.anterior;
    if(fim == null){
        fim.proximo = null;
        
    }else{
        inicio = null;
    }tamanho--;
    
    return out;
   }
   public void inserirMeio(int indice ,String info){
      if(indice <=0){
          insrirInicio(info);
          
      }else if( indice >= tamanho){
          inserirfim(info);
          
      }else{
          No local = inicio;
          for(int i=0; i< indice-1;i++){
              local = local.proximo;
              
          }
          No no = new No();
          no.info = info;
          no.anterior = local;
          no.proximo = local.proximo;
          local.proximo = no;
          no.proximo.anterior = no;
          
      } 
       
   }
   public String retirarMeio(int indice ){
       if(indice < 0
               || indice >= tamanho
               || inicio == null){
           return null;
           
       }else if(indice ==0){
           return retirarInicio();
       }else if( indice  == tamanho -1 ){
           return retirarFim();
       }
         No local = inicio;  
        for(int i =0; i< indice; i++){
            local = local.proximo;
        } 
        if(local.anterior != null){
           local.anterior.proximo = local.proximo; 
            
        }
        if(local.proximo != null){
           local.proximo.anterior = local.anterior; 
            
        } tamanho --;
       return  local.info;
   }
   public String toString(){
       String str = "(" + tamanho + ") ";
       No local = inicio;
       while(local != null){
           str += local.info + " ";
           local = local.proximo;
           
       }return str;
       
   }
}
