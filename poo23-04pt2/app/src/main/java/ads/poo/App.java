
package ads.poo;

import java.util.ArrayList;

public class App {
    

    public static void main(String[] args) {
        Carro garagem = new Carro("fusca", "branco", new Motor(60, 1500));
        ArrayList <Motor> estante = new ArrayList<>();

        estante.add(garagem.getMotor());
        
      


        garagem.setMotor(new Motor(70, 2000)); 
       
  
       garagem = new Carro("Preto", "Uno com escada", new Motor(40, 1000));
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
    }
}
