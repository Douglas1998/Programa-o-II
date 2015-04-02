package cinema;
public class Filme {
    
    String nome;
    float duração;
    int classificacao;
    String genero;
    String atores;
    
    boolean verificaridade (int idade)
    
    {
        
        if (idade > classificacao) {
            
            return true;
            
            
        }
        
        else {
            
            return false;
        }
        
    
    }


    
    String verificarFilme() {
        
        
                                            
               
             
        if (duração < 60) {
            
            return "curta metragem";
        }
        
        else  {
            
            return "longa metragem";
        }
        
        
        
        
    
    
    
        
        
            
            
        
        
    
    
        
        
        
        
        
        
    }
    
    
    
}



