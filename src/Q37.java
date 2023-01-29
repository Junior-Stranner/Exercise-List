import java.util.Scanner;

public class Q37 {
   public static void main(String[]args) {
	   Scanner ler = new Scanner(System.in);
	   
	   double kmaca;
	   double kmora;
	   double precoma;
	   double precomo;
	   double ma;
	   double mo;
	   
	   System.out.println("digite qtd de maca");
	   kmaca = ler.nextInt();
	   System.out.println("digite  preco da maca");
	   precoma = ler.nextInt();
	   System.out.println("digite qtd de morango");
	   kmora = ler.nextInt();
	   System.out.println("digite  preco do morango");
	   precomo = ler.nextInt();
	   
	   if((precoma>25) || (kmaca>8)) {
		   ma = kmaca * precoma;
		   ma = (ma - 90/100);
		   System.out.println("preco da maca é: "+ma);	   
	   }else {
	   if((precomo>25) || (kmora>8)) {
		    mo = kmora * precomo;
		    mo = (mo - 90/100);
		   System.out.println("preco do morango é: "+mo);	   
	   }else {
	   if(precoma>5){
		    ma =  precoma * kmaca;
		   System.out.println("preco da maca é: "+ma);
	   }else {
       if(precoma<=5){
		    ma =  precoma * kmaca;
		   System.out.println("preco da maca é: "+ma);
       }else {
       if(precomo>5){
		    mo =  precomo * kmora;
		   System.out.println("preco do morango é: "+mo);
	   }else {
      if(precomo<=5){
		    mo =  precomo * kmora;
		   System.out.println("preco do morango é: "+mo);
          }
         }
       }
     }
   }
  }
 }
}