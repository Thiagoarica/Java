import java.util.Scanner;

public class media {

	
			public static void main(String[] args) {
				
		      Scanner ler = new Scanner (System.in);
		      
		      String nome;
		      Double nota1, nota2, nota3, nota4, resultado;
		      System.out.print("nome:");
		      nome = ler.next();
		      System.out.print("nota1:");
		      nota1 =  ler.nextDouble();
		      System.out.print("nota2:");
		      nota2 =  ler.nextDouble();
		      System.out.print("nota3:");
		      nota3 =  ler.nextDouble();
		      System.out.print("nota4:");
		      nota4 =  ler.nextDouble();
		      
		     resultado = (nota1 + nota2 + nota3 + nota4) /4;
		     System.out.print("a media das notas"+ resultado);
		      
		      
		      
		      
			}



	}


