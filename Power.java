import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int mul = 1;
		for(int i = 1 ; i <= k ; i++) {
			mul = mul * n;
		}
		System.out.println(mul);
	}
}
