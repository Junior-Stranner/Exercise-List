import java.util.Scanner;

public class Q11 {
  public static void main(String[]args) {
	  Scanner ler = new Scanner(System.in);
	  
	  int vendas;
	  double salf;
	  double com;
	  double novosal = 0;
	  
	  System.out.println("digite salario fixo");
	  salf = ler.nextDouble();
	  System.out.println("digite numero de  vendas");
	  vendas = ler.nextInt();
	  
	  salf = salf+ (salf * 5/100); 
	  novosal = novosal + salf;
	  
	  System.out.println("funcionario recebe: "+novosal);

       	  
  }
}
