
import  java.util.Scanner;
 class Main {
    public static void main(String[] args) {

        int i = 0; // só precisa de uma varíavel de controle
        Scanner teclado = new Scanner(System.in);
        int vlido[]= new int[10];
        int vetores[][] = new int[2][10];
        int vpar=0,vimpar=0,soma = 0;;
        System.out.println("digite 10 números para o vetor ");
        for(i=0; i<10;i++){
            int n = teclado.nextInt();
            vlido[i]=n;
            if(vlido[i]%2==0){
                vetores[0][vpar] = vlido[i];
                vpar+=1;
            }else{
                vetores[1][vimpar] = vlido[i];
                vimpar+=1;
            }
        }
        System.out.println("");
        System.out.print("o vetor de números lidos é: " );
        for (i=0; i<9; i++){
            System.out.print(vlido[i]+" ");
        }
        System.out.println("");
        System.out.print("O vetor de números pares é: ");
        for (i=0; i<vpar; i++) {
            System.out.print(vetores[0][i]+" ");
            soma+=vetores[0][i];
        }
        System.out.println("E soma dos numeros pares é: "+ soma);
        System.out.print("O vetor de números ímpares é: ");
        soma=0;
        for (i=0; i<vimpar; i++){
            System.out.print(vetores[1][i]+" ");
            soma+=vetores[1][i];
        } // escreve a galera e pronto !
        System.out.println("E soma dos numeros impares é: "+ soma);
    }
}
