import java.util.Scanner;

public class Q05 {
  public static void main(String[]args) {
	  Scanner ler = new Scanner(System.in);
	  
	  int n[] = new int[10];
	  int valor = 0;
	  
	  for (int i = 0; i <=9;i++) {
	  System.out.println("digite um numero");
	  n[i] = ler.nextInt();
	  
	    valor = n[i];
	 } 
	    valor = valor -1;

	  System.out.println("digite valor antecesor: "+valor);
	  
	  
  }
}
