
// Imprima os fatoriais de 1 a 10.

public class Exercicio4 {

    public static void main(String[] args) {
        
        int fatorial = 1;
        
        for (int n = 1; n <= 10; n++) {
            if (n == 1) {
                System.out.printf("O fatorial de %d é (%d!) * %d = %d\n", n, 0, n, fatorial);
            } else {
                
                fatorial = fatorial *n;
                System.out.printf("O fatorial de %d é (%d!) * %d = %d\n", n, n - 1, n, fatorial);
                
            }
        }
    }
}
