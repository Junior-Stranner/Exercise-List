import java.util.Scanner;

public class Q040 {
  public static void main(String[]args) {
	  Scanner in = new Scanner(System.in);
	  
	  String Npro = null;
	  double qtd = 0;
	  double preco = 0;
	 // lerDados(Npro,qtd,preco); 
	 
	  double total = 0;
	 // calculaProduto(Npro,qtd,preco, total);
	  
	  //mostrarResultado(total);

	 // public static void lerDados(String Npro,double qtd,double preco) {
	  
	 
	  for (int x = 0 ; x <= 2; x++) {
	  System.out.println("nome do produto");
	  Npro = in.nextLine();
	  System.out.println("qtd unitario");
	  qtd = in.nextDouble();
	  System.out.println("preco do produto");
	  preco = in.nextDouble(); 
	  } 
	// public static double calculaProduto(String Npro, double qtd, double preco,double total) {
	 if(qtd<= 5) {
		total = qtd* preco;
		total = total * 98/100;	 
	}
	 if(qtd> 5  && qtd<=10) {
		 total = qtd* preco;
		 total = total * 97/100;
	 } 
	 if(qtd>10) {
		 total =  qtd* preco;
		 total = total * 95/100; 
	 }
	 //return total;
	   
	  
	//public static void mostrarResultado(double total) {  
	 System.out.println("total valor é: "+total);
  }
}
