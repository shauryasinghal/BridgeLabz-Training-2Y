package java_Arrays_Level_1_Lab_Practice;

import java.util.Scanner;

public class Valid_Voter_Age {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[10];
		for(int i =0; i<10; i++) {
			a[i]=sc.nextInt();
		}
		for(int i =0; i<10; i++) {
			if(a[i]<18) {
				System.out.println(a[i]+" can't vote.");
			}else {
				System.out.println(a[i]+" can vote.");
			}
		}
		sc.close();
	}
}