import java.util.Scanner;

public class Q14 {
   public static void main(String[]arg) {
	   Scanner ler = new Scanner(System.in);
	   
	   int num ;
	   
	   System.out.println("digite um numero");
	   num = ler.nextInt();
	   if(num>10) {
		   System.out.println("numero é maior que 10");
	   }else{
		   System.out.println("numero na pé maior que 10");
	   }
		   
   }
}
