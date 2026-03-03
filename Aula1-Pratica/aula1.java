import java.util.ArrayList;
import java.util.List;

public class aula1 {
    
    public static void main(String[] args) {
        int inteiro;
        float real;
        boolean vf;
        String texto;
        char caracter;
        
        texto = "Texto";

        List<String> textos = new ArrayList<String>();
        for(int i = 0; i<texto.length(); ++i){
            textos.add(texto.substring(i, i+1));

        }
        System.out.println(textos);

        textos.forEach(txt -> System.out.println(txt));

        List<Integer> inteiros = new ArrayList<>();
        
        for(int i = 0; i<texto.length(); ++i){
            inteiros.add(i);
        }
        
        int soma = inteiros.stream().mapToInt(Integer::intValue).sum();
    
        System.out.printf("\nA soma dos elementos da lista " + inteiros + " é %d", soma);
        
    }

}
