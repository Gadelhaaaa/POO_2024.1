public class 01 {
    public class 01{
    private double x;
    private double y;

    

    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    
    public double Horario getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    
    public double calcularDistancia(Ponto outroPonto) {
        double distancia = Math.sqrt(Math.pow(outroPonto.getX() - x, 2) + Math.pow(outroPonto.getY() - y, 2));
        return distancia;
    }

    
    public static void main(String[] args) {
        Ponto ponto1 = new Ponto(1, 2);
        Ponto ponto2 = new Ponto(4, 6);

        System.out.println("Ponto 1: " + ponto1);
        System.out.println("Ponto 2: " + ponto2);
        System.out.println("Distância entre os pontos: " + ponto1.calcularDistancia(ponto2));
    }
}
}
