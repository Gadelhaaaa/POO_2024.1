package ads.poo;

import java.util.ArrayList;
import java.util.HashMap;

class AppLivraria {
    public static void main(String[] args) {
        HashMap<String, Livro> bancoDeDados = new HashMap<>();

        ArrayList<Autor> autoresJava = new ArrayList<>();
        Autor deitel = new Autor("Deitel", "Americano");
         autoresJava.add(deitel);
        Livro JavaComoProgramar = new Livro("123",200.00, "Java como programar", autoresJava);

        bancoDeDados.put(JavaComoProgramar.getIsbn(), JavaComoProgramar);

        Livro l =bancoDeDados.get("123");
        if (null != null) {
            Autor outro = new Autor("outro", "BR");
            l.addAutor(outro);
        }
        
        
        


    }
}