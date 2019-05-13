import java.util.*;
public class Vowel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		char ch1 = Character.toLowerCase(ch);
		if(Character.isAlphabetic(ch1)) {
		switch(ch1) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("Vowel");
			break;
		default:
			System.out.println("Consonant");
		}
		}
		else
			System.out.println("Invalid");
	}
}
