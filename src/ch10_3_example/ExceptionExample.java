package ch10_3_example;

public class ExceptionExample {
	public static void main(String[] args) {
		
		
		try {
			System.out.println(Calculator.div(10000,0));
			System.out.println(Calculator.add(10000,-2));
		} catch (BizNegativeNumberException e) {
			e.printStackTrace();
		} catch (BizThousandOverException  e) {
			System.out.println(e.toString());
			System.out.println(e.getMessage());
		} catch (BizDivideByZeroException e) {
			System.out.println(e.toString());
		}
		
		finally {
			System.out.println("�Է°��� Ȯ���ϼ���~");
		}
		
		
//		System.out.println(Calculator.sub(5,3));
//		System.out.println(Calculator.multi(1,3));
//		System.out.println(Calculator.div(1,1));
		System.out.println("���α׷� ���� ����");
	}
}

