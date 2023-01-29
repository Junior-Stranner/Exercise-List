import java.util.Scanner;

public class Q31 {
  public static void main(String[]args) {
	  Scanner ler = new Scanner(System.in);
	  
	  int a,b,c;
	  int soma;
	  
	  System.out.println("digite numeo a");
	  a = ler.nextInt();
	  System.out.println("digite numeo c");
	  b = ler.nextInt();
	  System.out.println("digite numeo b");
	  c = ler.nextInt();
	  
	  a = a;
	  soma = b+c;
	  
	  if(a>soma) {
		  System.out.println("forma um triangulo");
	  }else {
		  System.out.println("nao forma um triangulo");
	  }
  }
}
