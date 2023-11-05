public class Main {

    public static void main(String[] args) {
        /*
        
        Pattern patron = Pattern.compile("Chihuahua\\s*[A-Za-z0-9]*");
        Matcher matcher = patron.matcher("Chihuahua 55 Husky");
        if (matcher.find()){
            System.out.println("Token detectado: " + matcher.group());
        }
        */
        String entrada = "Chihuahua 556";
        Tokenizer tokenizador = new Tokenizer(entrada);
        tokenizador.Analize(entrada);
    }
    
}
