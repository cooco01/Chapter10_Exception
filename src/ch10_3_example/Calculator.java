package ch10_3_example;

public class Calculator {

	// ���������� x+y ���� 1000�� ������ ����
	public static int add(int i, int j) throws BizThousandOverException
	, BizNegativeNumberException{
		int result = i+j;
		if (result>1000) {
			throw new BizThousandOverException();
		}
		if (result<0) {
			throw new BizNegativeNumberException();
		}
		return result;
		
	}
	// ���������� x-y���� �����̸� ����
	public static int sub(int i, int j) throws BizNegativeNumberException{
		int result = i-j;
		if (result < 0) {
			throw new BizNegativeNumberException();
		}
		return result;
		
	}

	public static int multi(int i, int j) {
		int result = i*j;
		return result;
	}
	
	// ���������� y���� 0�̸� ����
	public static int div(int i, int j) throws BizDivideByZeroException{
		int result = i/j;
		if(j==0) {
			throw new BizDivideByZeroException();
		}
		return result;	
	}

}
