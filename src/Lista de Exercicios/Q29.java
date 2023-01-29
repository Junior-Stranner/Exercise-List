import java.util.Scanner;

public class Q29 {
   public static void main(String[]args) {
	   Scanner ler = new Scanner(System.in);
	   
	   int n1,n2,n3;
	    
	   System.out.println("digite numero");
	   n1 = ler.nextInt();
	   System.out.println("digite numero");
	   n2= ler.nextInt();
	   System.out.println("digite numero");
	   n3 = ler.nextInt();
	  
	   somadoisn(n1,n3);
	   
	 int num = n1 + n3;
	 
	 System.out.println("soma dos dois maiores numeros é:"+num);
   }
   public static double somadoisn(int n1,int n3) {
	   int res ; 
	   res =  n1 + n3;
	   return res;
   }
}
