import java.util.Scanner;

public class Q32 {
   public static void main(String[]args) {
	   Scanner ler = new Scanner(System.in);
	   
	   int t1,t2;
	   
	   System.out.println("digite qtd de gols de um time");
	   t1 = ler.nextInt();
	   System.out.println("digite qtd de gols de outro time");
	   t2 = ler.nextInt();
	   
	   if(t1<t2) {
		   System.out.println("vencedor é: "+t2);
	   }else {
		   System.out.println("empate");
	   }
   }
}
