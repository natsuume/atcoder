package net.kanolab.tminowa.atcoder.abc.abc091_100.abc096.a;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(a <= b ? a : a-1);
	}
}