import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> lines = new ArrayList<>();
        
        Tokenizer analizador = new Tokenizer();
        while (true) {
            String line = sc.nextLine();
            if (line.isEmpty()) {
                break;
            }
            lines.add(line);
        }
        System.out.println("ANALIZANDO...");
        for (String linea : lines){
            analizador.Analize(linea);
            System.out.println("------------------------------------------------------------------------");
        }
        sc.close();
    }
}
