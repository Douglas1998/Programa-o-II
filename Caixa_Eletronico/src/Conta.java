
public class Conta {
    
    String agencia,numeroconta, nomecorrentista;
    float saldo;
    boolean ativa;
    
    
    
    
    
   void abrir (String vagencia, String vnumeroconta, String vnomecorrentista) {
       
      
       agencia = vagencia;
       numeroconta = vnumeroconta;
       nomecorrentista = vnomecorrentista;
       saldo = 0;
       ativa = true;
   
   }
   
   boolean fecharconta() {
       
       int op;
       
       boolean retorno;
       
       
          if (saldo == 0) {
          
           ativa = false;   
           retorno =  true; 
          }
          
          else {
              retorno = false;
              
          }
          return retorno;
   }
   
   
   boolean sacar (float valordatransação){
       
       
       boolean retorno = false ;
       
       
       
       if (ativa == true && saldo >= valordatransação) {
           
           
           saldo = (saldo - valordatransação);
                    
           retorno =  true;
           
       }
       
       else if (ativa == true && valordatransação > saldo) {
           
        retorno =  false;   
       }
       
      
       
       return retorno;
       
       
       
       
   }
   
   
   boolean depositar (float valordatransação) {
       
       if (ativa == true) {         
           
       
       saldo = saldo + valordatransação;
       return true;
       }
       
       else 
       {
           return false;
       }
       
       
   }
   
   double retornarsaldo ();
   
   return saldo;
   
   
       
       
       
       
       
       



//if ativo == false;
       
       
           
           
           
           
          
                   
         
      }
       
      
       
       

       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       //ativa = true;
       
       
       
       
       
   }
   
   double sacar (double valordatransacao) {
       
       
       
       
       
   }
   
   double depositar (double valordatransacao) {
       
       
   }
    
}

