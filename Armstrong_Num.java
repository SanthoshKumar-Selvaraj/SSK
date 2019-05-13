import java.util.Scanner;

public class Armstrong_Num {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int temp = a;
		int rem = 0;
		int sum = 0;
		int len = String.valueOf(a).length();
		while(a != 0) {
			rem = a % 10;
			sum = (int) (sum + Math.pow(rem, len));
			a = a / 10;
		}
		if(temp == sum)
			System.out.println("yes");
		else
			System.out.println("no");
	}
}
