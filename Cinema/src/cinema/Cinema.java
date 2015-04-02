package cinema;

import javax.swing.JOptionPane;

public class Cinema {
public static void main(String[] args) {
        
        Filme meufilme = new Filme();
        meufilme.atores = JOptionPane.showInputDialog(args);
                //showInputDialog(null, args, args);
        meufilme.classificacao = 18;
        meufilme.duração = 120;
        meufilme.nome = "Tropa de Elite";
        
                
        
        System.out.println("________ FILME _______");
        System.out.println(meufilme.nome);
        System.out.println("Classificação" +meufilme.classificacao);
        System.out.println("Duração" +meufilme.duração);
        System.out.println("Atores" +meufilme.atores);
        
        System.out.println("_____________________");
        
        int idade = 14;
        
        if (meufilme.verificaridade(idade) == true)
        {
            System.out.println("Pode Ver");
        }
        
        else {
            System.out.println("Não pode ver, muito novo");
        }
        
        
        System.out.println("--------------------");
        
        int duração = 100;
        
        
        System.out.println(meufilme.verificarFilme());
        
        
        
        
        
        System.out.println(meuator.ganhosdoAtor());
        
        
        
            
        
        
        
        
        
        
        
        
    }
    
}
