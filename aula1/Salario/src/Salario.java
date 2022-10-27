import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
		
      Scanner ler = new Scanner (System.in);
      
      String nome;
      Double salario, novoSalario, abono;
      System.out.print("nome:");
      nome = ler.next();
      System.out.print("abono:");
      abono =  ler.nextDouble();
      System.out.print("salario:");
      salario =  ler.nextDouble();
      novoSalario = salario + abono;
      System.out.println(nome+ "receber$"+novoSalario);
      
	}

}
