import java.util.Scanner;

public class Q09 {
  public static void main(String[]args) {
	  Scanner ler = new Scanner(System.in);
	  
	  double sal;
	  double novosal = 0;
	  
	  System.out.println("digite salario mensal de um funcionario");
	  sal = ler.nextInt();
	 
	  sal = sal + (sal *10/100);
	  novosal = sal;  
	  
	  System.out.println("novo salario é:"+novosal);
	 
  }
}
