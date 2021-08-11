package ch10_3_example;

public class BizThousandOverException extends Exception {
	@Override
	public String toString() {
		return "결과값이 천을 넘습니다. 확인요망!";
	}
}
