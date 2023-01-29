import java.util.Scanner;

public class Q13 {
   public static void main(String[]args) {
	   Scanner ler = new Scanner(System.in);
	   
	   int n1,n2,n3; 
       double mediafinal;
       
	   
		   System.out.println("digite nota1");
		   n1= ler.nextInt();
		   System.out.println("digite nota2");
		   n2= ler.nextInt();
		   System.out.println("digite nota3");
		   n3= ler.nextInt();

	   mediafinal = (n1*2) + (n2*3) + (n3*5)/10;
	 
	   
	   System.out.println("media final é: "+mediafinal);
   }
}
