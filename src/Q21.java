import java.util.Scanner;

public class Q21 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
				
       int horas;
       int cjogo;
       int fjogo;
       
       System.out.println("digite comeco do jogo");
       cjogo = ler.nextInt();
       System.out.println("digiite o fim do jogo");
       fjogo = ler.nextInt();
       
       horas = (cjogo - fjogo);
       
       System.out.println("duracao do jogo é: "+horas);
  }
}
