package lab01.poo;

public class 05 {
    public class 05 {
    private static int totalCarros = 0;
    private final int numeroIdentificacao;
    private String marca;
    private String modelo;
    private int velocidadeAtual;

    
    public Carro(int numeroIdentificacao, String marca, String modelo) {
        this.numeroIdentificacao = numeroIdentificacao;
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadeAtual = 0;
        totalCarros++;
    }

    
    public static int getTotalCarros() {
        return totalCarros;
    }

    
    public int getNumeroIdentificacao() {
        return numeroIdentificacao;
    }

    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

  
    public String getModelo() {
        return modelo;
    }

    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    
    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    
    public void acelerar(int velocidade) {
        if (velocidadeAtual + velocidade <= 200) {
            velocidadeAtual += velocidade;
        } else {
            velocidadeAtual = 200;
        }
    }

    
    public void frear(int velocidade) {
        if (velocidadeAtual - velocidade >= 0) {
            velocidadeAtual -= velocidade;
        } else {
            velocidadeAtual = 0;
        }
    }

   

    @Override
    public String toString() {
        return "Carro [Número de Identificação=" + numeroIdentificacao + ", Marca=" + marca + ", Modelo=" + modelo
                + ", Velocidade Atual=" + velocidadeAtual + " km/h]";
    }

   
    public static void main(String[] args) {
        Carro carro1 = new Carro(1, "Toyota", "Corolla");
        Carro carro2 = new Carro(2, "Honda", "Civic");

        System.out.println(carro1);
        System.out.println(carro2);
        System.out.println("Total de carros: " + Carro.getTotalCarros());
    }
}
}
