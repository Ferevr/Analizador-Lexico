import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tokenizer {
    private String inputString;
    
    private String DetectPitbull(String text){
        //DECLARAR VARIABLE
        Pattern patron = Pattern.compile("Pitbull\\s*[A-Za-z]+[0-9]*");
        Matcher matcher = patron.matcher(text);
        if (matcher.find()){
            return matcher.group();
        } else {
            return null;
        }
    }
    
    private String DetectChihuahua(String text){
        //IMPRIMIR
        Pattern patron = Pattern.compile("Chihuahua\\s*[A-Za-z]+[0-9]*");
        Matcher matcher = patron.matcher(text);
        if (matcher.find()){
            return matcher.group();
        } else {
            return null;
        }
    }
    
    private String DetectGolden(String text){
        //CONDICIONAL IF
        Pattern patron = Pattern.compile("GoldenRetriever\\s*[A-Za-z0-9]*(<|>|>=|<=|==|=!)[0-9]*");
        Matcher matcher = patron.matcher(text);
        if (matcher.find()){
            return matcher.group();
        } else {
            return null;
        }
    }
    
    private String DetectLabrador(String text){
        //ARREGLO
        Pattern patron = Pattern.compile("Labrador\\s*=\\s*\\d*");
        Matcher matcher = patron.matcher(text);
        if (matcher.find()){
            return matcher.group();
        } else {
            return null;
        }
    }
    
    private String DetectHusky(String text){
        //BUCLE
        Pattern patron = Pattern.compile("Husky\\s*[A-Za-z0-9]*(<|>|>=|<=|==|=!)[0-9]*");
        Matcher matcher = patron.matcher(text);
        
        if (matcher.find()){
            return matcher.group();
        } else {
            return null;
        }
    }
    
    public void Analize(String inputString) {
        if (DetectChihuahua(inputString) != null){
            System.out.println("");
            System.out.println("Lexema: Chihuahua");
            System.out.println("Token: Instruccion");
            Pattern Cpatron = Pattern.compile("(?<=Chihuahua\\s)[A-Za-z0-9]*");
            Matcher matcher = Cpatron.matcher(inputString);
            
            if (matcher.find()){        
                System.out.println("lexema: " + matcher.group());
            }
            System.out.println("Token: Variable");
        }
        
        if (DetectPitbull(inputString) != null){
            System.out.println("");
            System.out.println("Lexema: Pitbull");
            System.out.println("Token: Instruccion");
            Pattern Cpatron = Pattern.compile("(?<=Pitbull\\s)[A-Za-z0-9]*");
            Matcher matcher = Cpatron.matcher(inputString);
            
            if (matcher.find()){        
                System.out.println("lexema: " + matcher.group());
            }
            System.out.println("Token: Variable");
        }
        
        if (DetectGolden(inputString) != null){
            System.out.println("");
            System.out.println("Lexema: GoldenRetriever");
            System.out.println("Token: Instruccion");
            Pattern Gpatron = Pattern.compile("(?<=GoldenRetriever\\s)[A-Za-z0-9]*");
            Matcher matcher = Gpatron.matcher(inputString);
            
            if (matcher.find()){        
                System.out.println("lexema: " + matcher.group());
            }
            System.out.println("Token: Variable");
            Pattern patron = Pattern.compile("(<[=]*)|(>[=]*)|(==)|(!=)");
            Matcher match = patron.matcher(inputString);
            if (match.find()){
                System.out.println("lexema: " + match.group());
            }
            System.out.println("Token: Operador");
            
            Pattern patron2 = Pattern.compile("(?<=(<[=]*)|(>[=]*)|(==)|(!=))[0-9]*");
            Matcher match2 = patron2.matcher(inputString);
            if (match2.find()){
                System.out.println("Lexema: " + match2.group());
            }
            System.out.println("Token: Numero Entero");
        }
        
        if (DetectLabrador(inputString) != null){
            System.out.println("");
            System.out.println("Lexema: Labrador");
            System.out.println("Token: Instruccion");
            
            System.out.println("Lexema: =");
            System.out.println("Token: Operador");
            
            Pattern patron2 = Pattern.compile("\\s\\d*");
            Matcher match2 = patron2.matcher(inputString);
            if (match2.find()){
                System.out.println("Lexema: " + match2.group());
            }
            System.out.println("Token: Numero entero");
        }
        
        if (DetectHusky(inputString) != null){
            System.out.println("");
            System.out.println("Lexema: Husky");
            System.out.println("Token: Instruccion");
            
            Pattern GGpatron = Pattern.compile("(?<=Husky\\s)[A-Za-z0-9]*");
            Matcher matcher = GGpatron.matcher(inputString);
            
            if (matcher.find()){        
                System.out.println("lexema: " + matcher.group());
            }
            System.out.println("Token: Variable");
            Pattern patron = Pattern.compile("(<[=]*)|(>[=]*)|(==)|(!=)");
            Matcher match = patron.matcher(inputString);
            if (match.find()){
                System.out.println("lexema: " + match.group());
            }
            System.out.println("Token: Operador");
            
            Pattern patron2 = Pattern.compile("(?<=(<[=]*)|(>[=]*)|(==)|(!=))[0-9]*");
            Matcher match2 = patron2.matcher(inputString);
            if (match2.find()){
                System.out.println("Lexema: " + match2.group());
            }
            System.out.println("Token: Numero Entero");
        }
    }  
}
