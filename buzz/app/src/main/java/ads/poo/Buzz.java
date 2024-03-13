package ads.poo;

import java.util.Random;

public class Buzz {
    private boolean capaceteAberto = false;
    private boolean asaAberta = false;
    private String[] frases = { "Ao infinito e além!", "Preparado para voar!", "Comando estelar pronto para voar!",
            "Consigo resolver todas as missões do universo.",
            "Saudações, eu sou Buzz Lightyear e venho em missão de paz." };

    public boolean situacaoCapacete(){
        return capaceteAberto;
    }
            
    public String laser(){
        return "laser disparado!";
    }
    
    public String golpe(){
        return "golpeando";
    }

    public boolean capaceteAberto (){
        capaceteAberto = !capaceteAberto;
        return capaceteAberto;
    }

    public boolean asaAberta(){
        asaAberta = !asaAberta;
        return asaAberta;
    }
    public String falaFrases(){
        Random r = new Random();
        return frases[r.nextInt(6)];
        
        
        

    }


}
