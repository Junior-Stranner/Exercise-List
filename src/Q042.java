import java.util.Scanner;

public class Q042 {
	public static void main(String[]args) {
		

	
		int idade = 0;
		int tempo = 0;
		int A = 0;
		int NA = 0;
		
		//mostrarDados (idade,tempo);
		
		//motrarAposentadoeria(idade,tempo);
	
		//public static void mostrarDados (int idade,int tempo) {
			
			Scanner in = new Scanner(System.in);
			
			for(int x = 0; x<= 2;x++) {
			System.out.println("digite idade do empregado :");
			idade = in.nextInt();
			System.out.println("digite tempo trabalhado :");
			tempo = in.nextInt();

			}

		//public static void motrarAposentadoeria(int idade,int tempo) {
			for (int x = 0; x <= 2; x++) {
			if(idade>=65 || tempo>=30 || idade>=60 && tempo>=25) {
			
				System.out.println("Requer APOSENTADORIA : "+A);
				System.out.println(" NAO Requer APOSENTADORIA : "+NA);
			}
		}
    }
}




	









