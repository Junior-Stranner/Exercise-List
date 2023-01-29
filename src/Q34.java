import java.util.Scanner;

public class Q34 {
   public static void main(String[]args) {
	   Scanner ler =  new Scanner(System.in);
	   
	  int x=100;
	  int y = 50;
	  int  z = 0;
	  
	  
	   z = (x*y)+5;
	    if(z <= 0){
	    	System.out.println( "A" );
   } else {
	   if(z<=100) {
		   System.out.println( "B" );
   }else {
	   System.out.println( "c" );
   }
	   System.out.println("z");
  }
 }
}   