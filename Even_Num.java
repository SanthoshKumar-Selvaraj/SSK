import java.util.Scanner;

public class Even_Num {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		for(int i = a + 1 ; i < b ; i++) {
			if(((i / 2) * 2) == i) {
				System.out.print(i+" ");
			}
		}
	}
}
