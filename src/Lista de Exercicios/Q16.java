import java.util.Scanner;

public class Q16 {
   public static void main(String[]args) {
	   Scanner ler = new Scanner(System.in);
	   
	   double qtdmaca ;
	   double preco;
	   double maca = 0;
	   
	 
	   System.out.println("digite qtd de maca");
	   qtdmaca = ler.nextDouble();
	   System.out.println("digite preco da maca");
	   preco = ler.nextDouble();
	   
	   maca = qtdmaca + preco ;
	   
       System.out.println("valor dá maca é: "+maca);
   }   
}
