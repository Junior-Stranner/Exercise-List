import java.util.Scanner;

public class Q38 {
   public static void main(String[]args) {
	   Scanner ler = new Scanner(System.in);
	   
	   int cd;
	   int senha;
	   
	   
	   System.out.println("digite codigo do usuario");
	   cd = ler.nextInt();
	   System.out.println("digite a senha");
	   senha = ler.nextInt();
	   
	   if(cd != 1234){
		   System.out.println("usuario  invalido");
       }else {
    	 if(senha !=9999){
    		System.out.println("senha incorreta");
    	 }else {
    		 System.out.println("acesso permitido");
      }
    }
  }
}   