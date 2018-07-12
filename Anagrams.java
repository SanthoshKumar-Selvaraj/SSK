import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a;
		String b;
		boolean c;
		Scanner sc = new Scanner(System.in);
		a = sc.next();
		b = sc.next();
		if(a.length() == b.length()){
			char c1[] = a.toLowerCase().toCharArray();
			char c2[] = b.toLowerCase().toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			c = Arrays.equals(c1,c2);
		}
		else{
			c = false;
		}
		if(c)
			System.out.println("true");
		else
			System.out.println("false");
	}
}
