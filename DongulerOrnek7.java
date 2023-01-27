import java.util.Scanner;
public class DongulerOrnek7 {

	public static void main(String[] args) {
		// Java ile girilen say�n�n harmonik serisini bulan program yazaca��z.
		// Harmonik Seri form�l�
		// 1 + 1/2 + 1/3 + 1/4 + .. 1/n
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Say� giriniz : ");
		int n = scan.nextInt();
		
		double total = 0.0;
		
		for(int i = 1; i <= n; i++) {
			total = total + (1.0 / i); // double / int = double
		}
		
		System.out.println(total);

	}

}
