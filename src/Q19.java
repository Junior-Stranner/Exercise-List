import java.util.Scanner;

public class Q19 {
  public static void main(String[]args) {
	  Scanner ler = new Scanner(System.in);
	  
	  int n1,n2;
	  
	  System.out.println("digite um numero");
	  n1 = ler.nextInt();
	  System.out.println("digite um outro numero");
	  n2 = ler.nextInt();
	  
	  if(n1>n2) {
		  System.out.println("numero maior é: "+n1);
	  }else {
		  System.out.println("numero maior é: "+n2);
	  }
	  System.out.println("digite o numero maior: "+n1);
	  
  }
}
