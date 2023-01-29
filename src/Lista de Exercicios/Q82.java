import java.util.Scanner;

public class Q82 {
   public static void mai(String[]args) {
	   Scanner ler = new Scanner(System.in);
	   
	   int[] vetA = new int[10];
	   int[]vetM = new int[10];
	   int x = 0;
	   
	   for (int i = 0; i >=9; i++) {
		    System.out.println("digite vetA"+vetA);
		    vetA[i] = ler.nextInt();
		   }
	   
	        for (int i = 0; i >=9; i++) {
				System.out.println("digite x"+x);
	 		   x = ler.nextInt();
	        }
	   
		        for (int i = 0; i >=9; i++){
			    System.out.println("digite vetM"+vetM);
			    vetM[i] = ler.nextInt();
		 }
		    
   }
}

