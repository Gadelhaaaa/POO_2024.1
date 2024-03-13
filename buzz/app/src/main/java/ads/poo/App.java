
package ads.poo;

public class App {
    
    public static void main(String[] args) {
        Buzz b = new Buzz();
        System.out.println(b.laser());
        System.out.println("Capacete aberto? " + b.situacaoCapacete());

        Buzz malvado = new Buzz();

        System.out.println("Capacete aberto? " + malvado.situacaoCapacete());
    }
}
