import java.util.Scanner;
public class DongulerOrnek7 {

	public static void main(String[] args) {
		// Java ile girilen sayýnýn harmonik serisini bulan program yazacaðýz.
		// Harmonik Seri formülü
		// 1 + 1/2 + 1/3 + 1/4 + .. 1/n
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Sayý giriniz : ");
		int n = scan.nextInt();
		
		double total = 0.0;
		
		for(int i = 1; i <= n; i++) {
			total = total + (1.0 / i); // double / int = double
		}
		
		System.out.println(total);

	}

}
