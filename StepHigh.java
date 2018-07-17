package problems;

import java.util.Scanner;

public class StepHigh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int count = 0;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		int b[] = new int[a];
		for(int i = 0 ; i < a ; i++){
			b[i] = sc.nextInt();
		}
		for(int i = 0 ; i < a ; i++){
			for(int j = i + 1 ; j < a ; j++){
				for(int k = j + 1 ; k < a ; k++){
					if(b[i] + b[j] == b[k])
						System.out.println(b[i]+" "+b[j]+" "+b[k]);						
				}
			}
		}
	}
}
