import java.util.Scanner;

public class Q15 {
   public static void main(String[]args) {
	   Scanner ler = new Scanner(System.in);
	   
	   int num;
	   
	   System.out.println("digite um numero");
	   num = ler.nextInt();  
     
	   if(num>=0) {
	     System.out.println("numeo é ppositivo");
   }else {
	   System.out.println("numero é negativo");
   }
  }
}