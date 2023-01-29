import java.util.Scanner;

public class Q36 {
   public static void main(String[]args) {
	   Scanner ler = new Scanner(System.in);
	   
	   int h1,h2;
	   int m1,m2;
	   int soma; 
	   
	   System.out.println("digite a idade do hommen");
	   h1 = ler.nextInt();
	   h2 = ler.nextInt();
	   System.out.println("digite a idade da mulher ");
	   m1 = ler.nextInt();
	   m2 = ler.nextInt();
	   
	  soma =  h2 + m1;
	  soma ( h2,m1);
	  System.out.println("h2 e m1 tem: "+soma);
   }
   public static int soma(int h2,int m1) {
	   int res = h2 + m1;
	return res;
   }
   
}
