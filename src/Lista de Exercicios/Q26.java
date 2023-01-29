import java.util.Scanner;

public class Q26 {
   public static void main(String[]args){
	   Scanner ler = new Scanner(System.in);
	   
	  int estoque ;
	  int qtdmi;
	  int qtdma;
	  double qtdmedia;
	  
	  System.out.println("digite qtd atual de um produto no estoque");
	  estoque = ler.nextInt();
	  System.out.println("digite qtd maxima de um produto no estoque");
	  qtdma = ler.nextInt();
	  System.out.println("digite qtd minima de um produto no estoque");
	  qtdmi = ler.nextInt();  

	  qtdmedia = qtdma + qtdmi/2;

	  if(estoque>=qtdmedia) {
		  System.out.println("nao efetuar compra");
	  }else {
		  System.out.println("efetuar compra");
	  }
   }
}
