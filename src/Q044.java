import java.util.Scanner;

public class Q044 {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);

		int num1;
		int num2;
		int res;
		num1 = num2 = res= 0;
		int x =0;

		for (x = 0;x<=10;x++) {
		System.out.println("digite 1 para multiplicar ");
		System.out.println("digite 2 para dividir ");
		x = in.nextInt();

		if(x!=0) {
			System.out.println("digite o primeiro numero");
			num1 = in.nextInt();
			System.out.println("digite o segundo numero");
			num2 = in.nextInt();

			if(x==1) {
				res = num1 *num2;
			} else {
				if(x==2) {
					res = num1 / num2;

				}
			}
			System.out.println();
			System.out.println("resultado: "+res);
			System.out.println(".............................");
			System.out.println();

		}

		}
	}
}

