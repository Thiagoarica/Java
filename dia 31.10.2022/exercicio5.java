

import java.util.Scanner;

public class exercicio5 {

    public static Scanner Leia = new Scanner(System.in);

    public static void main(String[] args) {

        int numero,soma = 0, cont = 0;

        do {
            System.out.println("Digite um numero: ");
            numero = Leia.nextInt();
            if(numero > 0) {
                soma = numero + soma;
                cont++;
            }
        }while(numero > 0);
        System.out.println("Contagem terminada, A soma dos números positivos é "+ soma);
        System.out.println(numero);

    }

}