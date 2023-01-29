import java.util.Scanner;

public class Q07 {
   public static void main(String[]args) {
	   Scanner ler = new Scanner(System.in);
	   
	   int idade;
	   int meses = 12;
	   int dias= 365;
	   int data;
	   
	   System.out.print("digite data");
	   data=ler.nextInt();
	 for (int i = 0; i<=10; i++) {
	   data = i;
	 }  
	  idade = data;
	  dias = dias*idade;
	  meses = meses*idade;
	   
	   System.out.println("idade:"+idade +"\n"+"meses:" +meses+"\n"+"dias:" + dias);
   }
}
