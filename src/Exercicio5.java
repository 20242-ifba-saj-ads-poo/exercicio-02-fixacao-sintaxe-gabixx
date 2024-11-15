// No código do exercício anterior, aumente a quantidade de números que terão 
//os fatoriais impressos, até 20, 30, 40. Em um determinado momento, além desse cálculo
// demorar, vai começar a mostrar respostas completamente erradas. Por quê?

//Resposta abaixo do código

/*public class Exercicio5 {

    public static void main(String[] args) {
        
        int fatorial = 1;
        
        for (int n = 1; n <= 40; n++) {
            if (n == 1) {
                System.out.printf("O fatorial de %d é (%d!) * %d = %d\n", n, 0, n, fatorial);
            } else {
                
                fatorial = fatorial *n;
                System.out.printf("O fatorial de %d é (%d!) * %d = %d\n", n, n - 1, n, fatorial);
                
            }
        }
    }
}*/


/*Existem diversas formas de armazenar números inteiros, eles seguem uma quantidade
de bits, Ex: Byte (armazena 8 bits), short (16 bits), int (32 bits) e long (64 bits).
Portanto, neste caso, usar o "long" no lugar do "int" faz com que ele possa armazenar 
mais bits e conseguir finalizar o código. Segue abaixo o código versão long.*/ 

public class Exercicio5 {

    public static void main(String[] args) {
        
        long fatorial = 1;
        
        for (int n = 1; n <= 40; n++) {
            if (n == 1) {
                System.out.printf("O fatorial de %d é (%d!) * %d = %d\n", n, 0, n, fatorial);
            } else {
                
                fatorial = fatorial *n;
                System.out.printf("O fatorial de %d é (%d!) * %d = %d\n", n, n - 1, n, fatorial);
                
            }
        }
    }
}


