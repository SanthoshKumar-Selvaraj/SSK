import java.util.Scanner;

public class Prime_Num {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int count = 0;
		for(int i = a + 1 ; i < b ; i++) {
			count = 0;
			for(int j = 2 ; j < i ; j++) {
				if(i % j == 0) {
					count++;
					break;
				}
			}
			if(count == 0 && i != 1)
				System.out.print(i+" ");
		}
	}
}
