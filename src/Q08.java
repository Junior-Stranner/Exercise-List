import java.util.Scanner;

public class Q08 {
   public static void main(String[]args) {
	   Scanner ler = new Scanner(System.in);
	   
	   int[] numE = new int [10];
       int  vbrancos = 0; 
       int vnulos = 0;
       int vvalidos = 0;
       int x;
	   
	   for(int i = 0; i<=9; i++) {
		   System.out.println("digite todos os eleitores");
		   numE[i] = ler.nextInt(); 
		   
		   
	   
	   if(numE[i]<=5){
		   System.out.println(" votos validos: "+vvalidos);
	   }else {
		   if(numE[i]<=3){
			   System.out.println("votos brencos: "+vbrancos);
		   }else {
			   if(numE[i]<=2) {
				    numE[i] = vnulos;
				   System.out.println("votos nulos: "+vnulos);
			   }
		   }
	   }
	
	}
  }
}
 