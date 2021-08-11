package ch10_1_exception_class;

public class NullPointerExceptionExample {
	public static void main(String[] args) {
		
		String data1;
		String data2 = null;
		String data3 = "";
		String data4 = "";
		try {
			
		} catch(NullPointerException e) {
			System.out.println("예외 발생");
			System.out.println("e.toString() : " + e.toString());
			System.out.println("e.getMessage() : " + e.getMessage());
			System.out.println("e.printStackTrace() :");
			e.printStackTrace();
			
			
			
		}
		
		String data = "";
		
		System.out.println(data2.length());
		
		System.out.println("프로그램 종료");
	}
}
