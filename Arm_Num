import java.util.Scanner;

public class Arm_Num {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int rem;
		int sum;
		int len;
		int temp;
		for(int i = a + 1 ; i < b ; i++) {
			sum = 0;
			rem = 0;
			temp = i;
		len = String.valueOf(i).length();
		while(temp != 0) {
			rem = temp % 10;
			sum = (int) (sum + Math.pow(rem, len));
			temp = temp / 10;
		}
		if(i == sum)
			System.out.print(i+" ");
		}
	}
}
