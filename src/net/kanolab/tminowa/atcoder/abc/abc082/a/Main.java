package net.kanolab.tminowa.atcoder.abc.abc082.a;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println((a + b) %2 == 0 ? (a+b)/2 : (a+b+1)/2);
	}
}