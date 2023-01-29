import java.util.Scanner;

public class Q22 {
   public static void main(String[]args) {
	   Scanner ler = new Scanner(System.in);
	 
	 
	 int h;
	 double sal;
	 double novosal = 0;
	 int dias = 0;
	 
	 System.out.println("digite salario de um funconario");
	 sal = ler.nextInt();
	 System.out.println("digite horas trabalhadas por semana");
	 h = ler.nextInt();
	
	if (h>40) {
		  dias = h * 30;
		  sal = sal + (h * 500/100);
		  novosal = sal;
	}
	System.out.println("carga horaria do funcionario em um mes: "+dias);
	System.out.println("novo salario é: "+novosal); 
   }  
}
