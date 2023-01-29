import java.util.Scanner;

public class Q25 {
   public static void main(String[]args){
	   Scanner ler = new Scanner(System.in);
	   
	   int numC;
	   int satual = 0;
	   int debito;
	   int credito;
	   int saldo = 0;
	   
	   System.out.println("digite o numereo da conta do cliente");
	   numC = ler.nextInt();
	   System.out.println("digite do debito");
	   debito = ler.nextInt();
	   System.out.println("digite do credito");
	   credito = ler.nextInt();
	   
	   satual = saldo - debito + credito;
	   
	   if(satual>0) {
		   System.out.println("saldo é positivo");
	   }else {
		   System.out.println("saldo é negativo");
	   }
   }
}
