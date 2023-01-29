import java.util.Scanner;

public class Q041 {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);


		double n1 =0;
		double n2 =0;
		double n3 =0;
		         

      // lerMedia(n1,n2,n3;
       
       double mediaA = 0;
       // calculaMedia(mediaA, n1,n2,n3);
        
		//mostarMedia(mediaA);
     
		

	//public static void lerMedia(double n1,double n2,double n3,double mediaA) {

		System.out.println("digite nota");
		n1 = in.nextDouble();

		System.out.println("digite nota");
		n2 = in.nextDouble();
	
		System.out.println("digite nota");
	    n3 = in.nextDouble(); 
     
	    mediaA = (n1+n2+n3)/3;
	  
	 
  	 
     // public static double calculaMedia(mediaA, n1,n2,n3) {
    	 
    	  
		if(mediaA>=9) {
			System.out.println("A :" +mediaA); 
		}else { 
			if(mediaA >=7.5  && mediaA <9) {
				System.out.println("B :"+mediaA);
			}else {
				if(mediaA >=6  && mediaA <=7.5) {
					System.out.println("c :"+mediaA);
				}else {
					if(mediaA>=6  && mediaA<=7.5) {	
						System.out.println("D :"+mediaA );
					}
					//return media;
				}
			}
		}
		//System.out.println("media é :" );
	}
	}


	