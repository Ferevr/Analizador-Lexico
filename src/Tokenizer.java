import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tokenizer {
    private String inputString;

    public Tokenizer(String inputString) {
        this.inputString = inputString;
    }
    
    private String DetectPitbull(String text){
        Pattern patron = Pattern.compile("Pitbull\\s*[A-Za-z0-9]*");
        Matcher matcher = patron.matcher(text);
        if (matcher.find()){
            return matcher.group();
        } else {
            return "";
        }
    }
    
    private String DetectChihuahua(String text){
        Pattern patron = Pattern.compile("Chihuahua\\s*[A-Za-z]*");
        Matcher matcher = patron.matcher(text);
        if (matcher.find()){
            return matcher.group();
        } else {
            return null;
        }
    }
    
    private String DetectGolden(String text){
        Pattern patron = Pattern.compile("GoldenRetriever\\s*[A-Za-z]*(<|>|>=|<=|==|=!)[0-9]*");
        Matcher matcher = patron.matcher(text);
        if (matcher.find()){
            return matcher.group();
        } else {
            return null;
        }
    }
    
    private String DetectLabrador(String text){
        Pattern patron = Pattern.compile("Labrador\\s*=\\s* (\\d[,]*)*;");
        Matcher matcher = patron.matcher(text);
        if (matcher.find()){
            return matcher.group();
        } else {
            return null;
        }
    }
    
    private String DetectHusky(String text){
        Pattern patron = Pattern.compile("Husky\\s*[A-Za-z]*(<|>|>=|<=|==|=!)[0-9]*");
        Matcher matcher = patron.matcher(text);
        
        if (matcher.find()){
            return matcher.group();
        } else {
            return null;
        }
    }
    
    public void Analize(String inputString) {
        
        if (DetectChihuahua(inputString) == null){
            
        } else {
            //String Nchi [] = DetectChihuahua(inputString).split(inputString);
            System.out.println("Intruccion: Chihuahua");
            System.out.println("//"+DetectChihuahua(inputString));
        }
        
        if (DetectPitbull(inputString) == null){
            
        } else {
            //String Npit [] = DetectPitbull(inputString).split(inputString);
            System.out.println("Intruccion: Pitbull");
        }
        
        if (DetectGolden(inputString) == null){
            
        } else {            
            System.out.println("Intruccion: Golden");
        }
        
        if (DetectLabrador(inputString) == null){
            
        } else {            
            System.out.println("Intruccion: Labrador");
        }
        
        if (DetectHusky(inputString) == null){
            
        } else {            
            System.out.println("Intruccion: Husky");
        }
    }
    
}
