package ch10_3_example;

import java.util.Scanner;

public class ExceptionCase {
	public static void main(String[] args) {
		// 두 정수를 사용자로부터 입력 받기 나누기
		// 입력받은 숫자와 나누기 결과를 출력
		
		Scanner sc = new Scanner(System.in);
		
		try {
		System.out.println("a/b...a?>");
		int n1 = sc.nextInt();
		
		System.out.println("a/b...b?>");
		int n2 = sc.nextInt();
		System.out.printf("%d / %d = %d\n", n1, n2, n1/n2);
			
		
		} catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다");
		} finally {
			System.out.println("프로그램 종료");			
		}
			
		
		
//		String x = args[0];
//		String y = args[1];
//		int value1 = Integer.parseInt(x);
//		int value2 = Integer.parseInt(y);
//		int result = value1 / value2;
//		System.out.println(value1 + " / " + value2 + " = " + result );
	}
}
