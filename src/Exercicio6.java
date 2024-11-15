// Imprima os primeiros números da série de Fibonacci até passar de 100

public class Exercicio6 {

    public static void main(String[] args) {
        
        int a = 0; 
        int b = 1; 
        
        System.out.printf("%d, %d, ", a, b);
        
        int proxNumero = a + b;
        
        while (proxNumero <= 144) {
            System.out.printf("%d, ", proxNumero);
            
            a = b;
            b = proxNumero;
            
            
            proxNumero = a + b;
        }
        
    }
}
