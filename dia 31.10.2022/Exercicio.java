import java.util.Arrays;
import java.util.Scanner;

public class Exercicio {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int n = 10; // tamanho do vetor
        int v[] = new int[n]; // declaração do vetor "v"
        int i; // índice ou posição
        int par=0;
        int impar=0;

// Entrada de Dados
        for (i=0; i<n; i++) {
            System.out.printf("Informe %2do. valor de %d: ", (i+1), n);
            v[i] = ler.nextInt();
            if (v[i]%2==0)
                par++;
            else
                impar++;
        }
        System.out.println(Arrays.toString(v));
        System.out.println("a quantidade de numeros pares mais"+ par);
        System.out.println("a quantidade de numeros pares mais"+ impar);




        }
    }