import java.util.Scanner;

public class Q81 {
   public static void main(String[]args) {
	   Scanner ler = new Scanner(System.in);
	   
	   int[] num = new int [10];
	   int menorN = 0;
	   int posicao = 0;
	   
	   for(int i = 0; i <=9; i++) {  
		   System.out.println("digite numero");
		   num[i] = ler.nextInt();
		   
		     if (num[i]<=9) {
		      menorN = num[i];
		      posicao = i;
		     }
	   }  
	   System.out.println("menor nummero é: "+menorN);
	   System.out.println("posicao é: "+posicao);
   }
}  
