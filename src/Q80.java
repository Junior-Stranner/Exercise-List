import java.util.Scanner;

public class Q80 {
   public static void main(String[]args) {
	   Scanner ler = new Scanner(System.in);
	   
	   int[] num = new int[20];
	   int maiorN = 0;
	   int posicao = 0;
	   
	   for(int i = 0; i <=19;i++) {
		   System.out.println("digite numero: ");
		   num[i] = ler.nextInt();
		  
		   if(num[i]>=19) {   
		    maiorN = num[i];
		    posicao = i;
	     }
	   } 
	   System.out.println("maior numero é: "+maiorN);
	   System.out.println("a posicao é: "+posicao);
   } 
}	