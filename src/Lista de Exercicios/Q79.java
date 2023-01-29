import java.util.Scanner;

public class Q79 {
    public static void main(String[]args) {
    	Scanner ler = new Scanner(System.in); 
    	
    	double[] nota = new double[20];
    	double soma = 0;
    	double media = 0;
    	 int  contAluno = 0;
    	
    	for(int i = 0; i < 20; i ++) {
    		System.out.println("digite nota: "+ (i+1));
    		nota[i] = ler.nextInt();
    		
    		soma = soma + nota[i];
    	}
    	media = soma/20;
    	
    	System.out.println("media"+media);
    
    for (int i = 0; i <20; i ++) {
    	 if( nota[i]>media) {
    	     contAluno++;  
          }
      }
        System.out.println("digite a media"+media);
        System.out.println("digite contAluno"+contAluno);
    }

     public  static double calcularmedia (double soma) {
    	double resultado = soma/20;
    	     
    	     return resultado;
     }
}  
     