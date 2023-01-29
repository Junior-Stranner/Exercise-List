import java.util.Scanner;

public class Q18 {
  public static void main(String[]args) {
	  Scanner ler = new Scanner(System.in);
	 
	 int anoA; 
	 int anoN;
	 int data = 0;

	 System.out.println("digite a data de nasimento");
	 anoN = ler.nextInt();
	 System.out.println("digite ano atual");
	 anoA = ler.nextInt();
     for(int i = 0; i <=11; i++) {
	 data = i++;
  }
     System.out.println("digite a idade da pessoa: "+data);
 }
}