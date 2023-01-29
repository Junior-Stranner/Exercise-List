import java.util.Scanner;

public class Q10 {
  public static void main(String[]args) {
	  Scanner ler = new Scanner(System.in);
	  
	  
	  int consumidor;
	  double imposto ;
	  double distribuidor;
	  int valorC;
	  
	  System.out.println("digite valor do carro");
	  valorC = ler.nextInt();
	  System.out.println("digite imposto do carro");
	  imposto = ler.nextInt();
	  System.out.println("digite valor do distribuidor");
	  distribuidor = ler.nextInt();
	  
	  valorC = valorC+ (valorC * 45/100);
	
	  valorC = valorC+ (valorC * 28/100);
	   
	  System.out.println("digite valor total do carro: "+valorC);
  }
  
}

