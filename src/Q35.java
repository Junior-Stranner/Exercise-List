import java.util.Scanner;

public class Q35 {
   public static void main(String[]args) {
	   Scanner ler = new Scanner(System.in);
	   
	   int litroA;
	   double precoA;
	   int litroG;
	   double precoG;
	   double x;
	   double y;
	   
	   System.out.println("digite preco ");
	   precoA = ler.nextDouble();
	   System.out.println("digite quatidade de litros");
	   litroA = ler.nextInt();  
	   System.out.println("digite preco ");
	   precoG = ler.nextDouble();
	   System.out.println("digite quatidade de litros");
	   litroG = ler.nextInt();

	   
	   if(litroA<=20){
		   x = litroA *precoA;
		     x = x * 97/100;
		       System.out.println("preco do alcol é: "+x);	      
       }else {
		   x = litroA * precoA;
		     x = x *95/100;
		       System.out.println("preco do alcol é"+x);
	   }
	   if(litroG<=20) {
		   y = litroG * precoG;
		     y = y * 96/100;
		       System.out.println("preco da gaolina é: "+y);
	   }else {
		   y =litroG * precoG;
		     y = y *94/100;
		       System.out.println("preco da gaolina é: "+y);
	   }
  }
}