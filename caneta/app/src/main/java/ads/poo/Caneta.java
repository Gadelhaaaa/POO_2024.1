package ads.poo;

public class Caneta {
    private int nivelTinta = 100;
    private String cor = "Preta";

    public String desenhar(){
        // caneta não desenha sem tinta
        nivelTinta--;
        return "Desenhando na cor " + cor;
    }

    public int getNivelTinta() {
        return nivelTinta;
    }

    public void setNivelTinta(int nivelTinta) {
        this.nivelTinta = nivelTinta;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
