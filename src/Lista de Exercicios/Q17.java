import java.util.Scanner;

public class Q17 {
   public static void main(String[]arg) {
	   Scanner ler = new Scanner(System.in);
	   
	   double av[] = new double[10] ;
	   double soma = 0;
	   double media ;
	   
	   for(int i = 0; i<=9; i++) {
	   System.out.println("digite primeira nota");
	   av[i] = ler.nextDouble();
	   
	  soma = soma+ av[i];
	  }
	  
	  media = soma/10;
	   System.out.println("media é: "+media);
   }
}
