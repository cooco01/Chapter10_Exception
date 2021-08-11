package ch10_3_example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		try {
			System.out.println("1 > ");
			int n1 = scn.nextInt();
			System.out.println("2 > ");
			int n2 = scn.nextInt();
			System.out.println(n1/n2);
		} catch(InputMismatchException e) {
			System.out.println("잘못된 입력입니다");
		} catch(ArithmeticException e) {
			System.out.println("잘못된 나누기입니다");
		}
	}
}
