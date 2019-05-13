import java.util.Scanner;

public class Even_odd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num < 0)
			System.out.println("Invalid");
		else if((num / 2) * 2 == num)
			System.out.println("Even");
		else 
			System.out.println("Odd");
	}
}
