import java.util.Scanner;

public class Q80ADS {
	  public static void main(String[]args) {
		  Scanner ler = new Scanner(System.in);
		  
		  int[] num = new int [20];
		  int maiornum = 0;
		  int maiorAux = 0;
		  
		  for (int i = 0; i <=19;i++) {
			  System.out.println("digite qtd de numeros");
			  num[i] = ler.nextInt();
		  
		  
		    if (num[i] >=19) {
			    maiornum = num[i];
			    maiorAux = i;
			    		
		   }   
		} 
			   System.out.println("maiior numero é: "+maiornum);
			   System.out.println("posicao: "+maiorAux);
	  }
	}

