import java.util.Scanner;

public class salarioL {

    public static void main(String[] args) {

        Scanner  ler = new  Scanner ( System . in );

        float bruto, noturno , extra ,desconto , liquido;

        System.out.print("bruto:");
        bruto =  ler.nextFloat();
        System.out.print("noturno:");
        noturno =  ler.nextFloat();
        System.out.print("extra:");
        extra =  ler.nextFloat();
        System.out.print("desconto:");
        desconto =  ler.nextFloat();

        liquido =(bruto + noturno+ (extra*5)-desconto);

        System.out.println("salario liquido: "+ liquido);
    }

}
