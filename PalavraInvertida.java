import java.util.Scanner;

/**
 *
 * @author Danilo
 */
public class PalavraInvertida {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner mykb = new Scanner(System.in);
        
        System.out.print("Digite a palavra que deseja inverter: ");
        String palavra = mykb.nextLine();
        mykb.close();
        
        Inverte(palavra);
        
    }
    
    /**
     * metodo para inverter uma palavra letra por letra
     * @param palavra palavra qe deseja inverter
     * @return retrna a palavra invertida ex: PALAVRA. retunr: ARVALAP
     */
    public static String Inverte(String palavra){
        String invertida = "";
        
        int tamanho = palavra.length();
        int fim = tamanho-1;
        
        for(int i = fim; i >= 0; i--){
            invertida += palavra.charAt(i);
        }
        System.out.println("Palavra digitada: " + palavra);
        System.out.println("Palavra invertida: " + invertida);
        
        palindromo(palavra,invertida);
        
        return invertida;
    }
    
    /**
     * metodo para comparar duas palavras parar saber se é palindromo
     * @param palavra enviada
     * @param invertida palavra invertida no algoritmo
     */
    public static void palindromo(String palavra, String invertida){
        if(palavra.toLowerCase().equals(invertida.toLowerCase())){
            System.out.println("Essa palavra é um Palindromo");
        }
    }
}
