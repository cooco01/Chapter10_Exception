package ch10_3_example;

public class Calculator {

	// 업무적으로 x+y 값은 1000을 넘으면 에러
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
	// 업무적으로 x-y값은 음수이면 에러
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
	
	// 업무적으로 y값이 0이면 에러
	public static int div(int i, int j) throws BizDivideByZeroException{
		int result = i/j;
		if(j==0) {
			throw new BizDivideByZeroException();
		}
		return result;	
	}

}
