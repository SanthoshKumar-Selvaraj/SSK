package problems;

import java.util.Arrays;

import java.util.Scanner;

public class Prefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int m=0;
		int l=0;
		int count=0;
		String ch;
		String s="";
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		String str[] = new String[num];
		int len[] = new int[num];
		for(int i=0;i<num;i++){
			str[i] = sc.next();
			len[i] = str[i].length();
			l = l + len[i];
		}
		String c[] = new String[l];
		Arrays.sort(len);
		for(int k=1;k<=len[0];k++){
			count=0;
			ch = str[0].substring(k-1,k);
			for(int i=1;i<num;i++){
				c[m] = str[i].substring(k-1, k);
				if(c[m].equalsIgnoreCase(ch)){
					count++;
				}
				m++;
			}
			if(count == num - 1)
				s = s + ch;
			else
				break;
		}
			System.out.print(s);
	}
}
