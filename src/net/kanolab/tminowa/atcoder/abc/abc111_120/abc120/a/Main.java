package net.kanolab.tminowa.atcoder.abc.abc111_120.abc120.a;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a * c <= b)
			System.out.println(c);
		else
			System.out.println(b / a);
	}
}
