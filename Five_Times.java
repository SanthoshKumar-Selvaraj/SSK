import java.util.Scanner;

public class Five_Times {

	public static void main(String[] args) {
		int mul;
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i = 1 ; i <= 5 ; i++) {
			mul = num * i;
			System.out.print(mul+" ");
		}
	}
}
