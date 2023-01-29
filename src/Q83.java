import java.util.Scanner;

public class Q83 {
   public static void main(String[]args) {
	   Scanner ler = new Scanner(System.in);
	   
	   int[] valor = new int[10];
	   
	   for (int i = 0; i <10; i++) {
		   System.out.println("digite numero"+(i+1));  
		   valor[i] = ler.nextInt();
	      } 
        System.out.println("digite os numeros na ordem inersa");
        for(int i = 10; i >0; i--) {
        	System.out.println(+valor[i]);
        }
        
	   }
   }

