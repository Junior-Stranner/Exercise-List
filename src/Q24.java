import java.util.Scanner;

public class Q24 {
   public static void main(String[]args) {
	   Scanner ler = new Scanner(System.in);
	   
	  double salf  ;
	  double novosal = 0;
	  double vendas;
	  
	  System.out.println("digite valo das vendas totais");
	  vendas = ler.nextDouble();
	  System.out.println("digite salario fixo do funcionario");
	  salf = ler.nextDouble();
	  
	  if(vendas<=1500) {
		  novosal= novosal +(salf * 3/100);
	  }else {
		  novosal = novosal +(salf * 5/100);
	  }
	  novosal = novosal + salf;
	  
	  System.out.println("novo salario é: "+novosal);
   }
}
