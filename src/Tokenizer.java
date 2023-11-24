
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tokenizer {

    private String inputString;

    private Boolean ErrorLexico(String text) {
        String[] alfabeto = {
            " ", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M",
            "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z",
            "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m",
            "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z",
            "=", ">", "<", "==", "!=", "0", "1",
            "2", "3", "4", "5", "6", "7", "8", "9"
        };
        
        for (String i: alfabeto){
            return !text.contains(i);
        }
        return true;
    }

    private String DetectPitbull(String text) {
        //DECLARAR VARIABLE
        Pattern patron = Pattern.compile("Pitbull\\s*[A-Za-z]*[0-9]*");
        Matcher matcher = patron.matcher(text);
        if (matcher.find()) {
            return matcher.group();
        } else {
            return null;
        }
    }

    private String DetectChihuahua(String text) {
        //IMPRIMIR
        Pattern patron = Pattern.compile("Chihuahua\\s*[A-Za-z]*[0-9]*");
        Matcher matcher = patron.matcher(text);
        if (matcher.find()) {
            return matcher.group();
        } else {
            return null;
        }
    }

    private String DetectGolden(String text) {
        //CONDICIONAL IF
        Pattern patron = Pattern.compile("GoldenRetriever\\s*[A-Za-z0-9]*(<[=]*|>[=]*|==|=!){0,2}[0-9]*");
        Matcher matcher = patron.matcher(text);
        if (matcher.find()) {
            return matcher.group();
        } else {
            return null;
        }
    }

    private String DetectLabrador(String text) {
        //ARREGLO
        Pattern patron = Pattern.compile("Labrador\\s*={0,1}\\s*\\d*");
        Matcher matcher = patron.matcher(text);
        if (matcher.find()) {
            return matcher.group();
        } else {
            return null;
        }
    }

    private String DetectHusky(String text) {
        //BUCLE
        Pattern patron = Pattern.compile("Husky\\s*[A-Za-z0-9]*(<[=]*|>[=]*|==|=!)*[0-9]*");
        Matcher matcher = patron.matcher(text);
        if (matcher.find()) {
            return matcher.group();
        } else {
            return null;
        }
    }

    public void Analize(String inputString) {
        if (ErrorLexico(inputString)) {
            //True
            System.err.println("hay un error lexico en el programa");
        } else {
            //False
            if (DetectChihuahua(inputString) != null) {
                System.out.println("");
                System.out.println("Lexema: Chihuahua");
                System.out.println("Token: Instruccion");
                Pattern Cpatron = Pattern.compile("(?<=Chihuahua\\s)[A-Za-z0-9]+");
                Matcher matcher = Cpatron.matcher(inputString);

                if (matcher.find()) {
                    System.out.println("lexema: " + matcher.group());
                }
                else{
                    System.err.println("Error de sintaxis");
                    System.exit(0);
                }
                System.out.println("Token: Variable");
            }

            if (DetectPitbull(inputString) != null) {
                System.out.println("");
                System.out.println("Lexema: Pitbull");
                System.out.println("Token: Instruccion");
                Pattern Cpatron = Pattern.compile("(?<=Pitbull\\s)[A-Za-z0-9]+");
                Matcher matcher = Cpatron.matcher(inputString);

                if (matcher.find()) {
                    System.out.println("lexema: " + matcher.group());
                }
                else{
                    System.err.println("Error de sintaxis");
                    System.exit(0);
                }
                System.out.println("Token: Variable");
            }

            if (DetectGolden(inputString) != null) {
                System.out.println("");
                System.out.println("Lexema: GoldenRetriever");
                System.out.println("Token: Instruccion");
                Pattern Gpatron = Pattern.compile("(?<=GoldenRetriever\\s)[A-Za-z0-9]+");
                Matcher matcher = Gpatron.matcher(inputString);

                if (matcher.find()) {
                    System.out.println("lexema: " + matcher.group());
                    System.out.println("Token: Variable");
                }
                else{
                    System.err.println("Error de sintaxis");
                    System.exit(0);
                }
                Pattern patron = Pattern.compile("(<[=]*)|(>[=]*)|(==)|(!=)");
                Matcher match = patron.matcher(inputString);
                if (match.find()) {
                    System.out.println("lexema: " + match.group());
                    System.out.println("Token: Operador");
                }else{
                    System.err.println("Error de sintaxis");
                    System.exit(0);
                }
                

                Pattern patron2 = Pattern.compile("(?<=(<[=]*)|(>[=]*)|(==)|(!=))[0-9]*");
                Matcher match2 = patron2.matcher(inputString);
                if (match2.find()) {
                    System.out.println("Lexema: " + match2.group());
                    System.out.println("Token: Numero Entero");
                }else{
                    System.err.println("Error de sintaxis");
                    System.exit(0);
                }
                
            }

            if (DetectLabrador(inputString) != null) {
                System.out.println("");
                System.out.println("Lexema: Labrador");
                System.out.println("Token: Instruccion");
                Pattern patron3 = Pattern.compile("\\s\\=");
                Matcher match3 = patron3.matcher(inputString);
                if (match3.find()) {
                System.out.println("lexema: " + match3.group());
                System.out.println("Token: Operador");
                }
                else{
                    System.err.println("Error de sintaxis");
                    System.exit(0);
                }

                Pattern patron2 = Pattern.compile("\\s\\d+");
                Matcher match2 = patron2.matcher(inputString);
                if (match2.find()) {
                    System.out.println("lexema: " + match2.group());
                    System.out.println("Token: Numero entero");
                }
                else{
                    System.err.println("Error de sintaxis");
                    System.exit(0);
                }
                
            }

            if (DetectHusky(inputString) != null) {
                System.out.println("");
                System.out.println("Lexema: Husky");
                System.out.println("Token: Instruccion");

                Pattern GGpatron = Pattern.compile("(?<=Husky\\s)[A-Za-z0-9]+");
                Matcher matcher = GGpatron.matcher(inputString);

                if (matcher.find()) {
                    System.out.println("lexema: " + matcher.group());
                    System.out.println("Token: Variable");
                }
                else{
                    System.err.println("Error de sintaxis");
                    System.exit(0);
                }
                
                Pattern patron = Pattern.compile("(<[=]*)|(>[=]*)|(==)|(!=)");
                Matcher match = patron.matcher(inputString);
                if (match.find()) {
                    System.out.println("lexema: " + match.group());
                    System.out.println("Token: Operador");
                }else{
                    System.err.println("Error de sintaxis");
                    System.exit(0);
                }
                

                Pattern patron2 = Pattern.compile("(?<=(<[=]*)|(>[=]*)|(==)|(!=))[0-9]+");
                Matcher match2 = patron2.matcher(inputString);
                if (match2.find()) {
                    System.out.println("Lexema: " + match2.group());
                    System.out.println("Token: Numero Entero");
                }else{
                    System.err.println("Error de sintaxis");
                    System.exit(0);
                }
                
            }
        }
    }
}
